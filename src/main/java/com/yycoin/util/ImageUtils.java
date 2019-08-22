package com.yycoin.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageUtils {

	private static Logger logger = LoggerFactory.getLogger(ImageUtils.class);

	public static boolean downloadPictureByUrl(String filePath, String imageType, String urlstr) {
		URL url = null;
		try {
			url = new URL(urlstr);
			// 1.获取url的输入流 dataInputStream
			DataInputStream dataInputStream = new DataInputStream(url.openStream());
			// 2.加一层BufferedInputStream
			BufferedInputStream bufferedInputStream = new BufferedInputStream(dataInputStream);
			// 3.构造原始图片流 preImage
			BufferedImage preImage = ImageIO.read(bufferedInputStream);
			// 4.获得原始图片的长宽 width/height
			int width = preImage.getWidth();
			int height = preImage.getHeight();
			// 5.构造压缩后的图片流 image 长宽各为原来的1/2
			// 不压缩
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			// 6.给image创建Graphic ,在Graphic上绘制压缩后的图片
			Graphics graphic = image.createGraphics();
			graphic.drawImage(preImage, 0, 0, width, height, null);
			// 7.为file生成对应的文件输出流
			// 将image传给输出流
			File file = new File(filePath);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			// 8.将image写入到file中
			ImageIO.write(image, imageType, bufferedOutputStream);
			// 9.关闭输入输出流
			bufferedInputStream.close();
			bufferedOutputStream.close();
			return true;
		} catch (IOException e) {
			logger.error("downloadPicture error", e);
		}
		return false;
	}

}
