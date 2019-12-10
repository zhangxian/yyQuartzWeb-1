package com.yycoin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan(basePackages = { "com.yycoin.vo" })
@EnableAutoConfiguration
public class YyQuartzWebApplicationTests {

//	@Autowired
//	private TCenterPackageMapper tCenterPackageMapper;

	private static Logger logger = LoggerFactory.getLogger(YyQuartzWebApplicationTests.class);

	/**
	 * 顺丰打印
	 */
	@Test
	public void sfprint() {
		String fileName = "d:/sfprintpic/1.xlsx";
		InputStream in = null;
		Workbook exl = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			in = new FileInputStream(new File(fileName));
			exl = WorkbookFactory.create(in);
			Sheet sheet1 = exl.getSheetAt(0);
			int rowNums = sheet1.getLastRowNum(); // 模板的行数0开始，返回值比行数小1
//			short cellNums = sheet1.getRow(3).getLastCellNum(); // 列数
			Map<String, List<String>> dataMap = new HashMap<String, List<String>>();
			for (int i = 1; i <= rowNums; i++) {
				Row row = sheet1.getRow(i);
				Cell numberCel = row.getCell(0);
				String numberText = numberCel.getStringCellValue();

				Cell sfNumberCel = row.getCell(14);
				String sfNumberText = sfNumberCel.getStringCellValue();

				if (dataMap.containsKey(sfNumberText)) {
					List<String> numberTxtList = dataMap.get(sfNumberText);
					numberTxtList.add(numberText);

				} else {
					List<String> numberTxtList = new LinkedList<String>();
					numberTxtList.add(numberText);
					dataMap.put(sfNumberText, numberTxtList);
				}
			}
			List<String> picFileList = new ArrayList<String>();
			File picFile = new File("D:\\sfprintpic");
			File[] picFiles = picFile.listFiles();
			for (File f : picFiles) {
				String picfileName = f.getName();
				if (f.getName().contains("png")) {
					String ffname = picfileName.substring(0, picfileName.indexOf("."));
					if (!dataMap.containsKey(ffname)) {
						logger.error("图片名称:" + picfileName + "不包含在excel中");
					}
				}
			}

			Iterator<String> it = dataMap.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				List<String> valueList = dataMap.get(key);
				try {
					for (int j = 0; j < valueList.size(); j++) {
						String sfNumberText = valueList.get(j);

						String filePath = "D:\\sfprintpic\\" + key + ".png";
						System.out.println(filePath);
						// 读取原图片信息
						File srcImgFile = new File(filePath);// 得到文件
						Image srcImg = ImageIO.read(srcImgFile);// 文件转化为图片
						int srcImgWidth = srcImg.getWidth(null);// 获取图片的宽
						int srcImgHeight = srcImg.getHeight(null);// 获取图片的高
						// 加水印
						BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
						Graphics2D g = bufImg.createGraphics();
						g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
						g.setColor(Color.red); // 根据图片的背景设置水印颜色
						g.setFont(new Font("微软雅黑", Font.BOLD, 20)); // 设置字体

						// 设置水印的坐标
						int y = 510 + 20 * j;
						g.drawString(sfNumberText, 10, y); // 画出水印
						g.dispose();
						// 输出图片
						String destPic = "D:\\sfprintpic\\dest\\" + sfNumberText + ".png";
						FileOutputStream outImgStream = new FileOutputStream(destPic);
						ImageIO.write(bufImg, "png", outImgStream);
						outImgStream.flush();
						outImgStream.close();
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					logger.error(key + " 没有找到图片");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (exl != null) {
					exl.close();
				}
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	@Configuration
	@PropertySource("classpath:commonconfig.properties")
	static class PropertiesWithJavaConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}

}
