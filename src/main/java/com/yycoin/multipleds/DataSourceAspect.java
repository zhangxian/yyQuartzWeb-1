package com.yycoin.multipleds;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DataSourceAspect {

	private static Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

	@Pointcut("@annotation(com.yycoin.multipleds.YYDataSource)")
	public void dataSourcePointCut() {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}

	@Around("dataSourcePointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("-----------------------------dataSourcePointCut");
		MethodSignature signature = (MethodSignature) point.getSignature();
		Method method = signature.getMethod();
		YYDataSource ds = method.getAnnotation(YYDataSource.class);
		if (ds == null) {
			DynamicDataSource.setDataSource(DataSourceNames.tnds);
			logger.debug("set datasource is " + DataSourceNames.tnds);
		} else {
			DynamicDataSource.setDataSource(ds.name());
			logger.debug("set datasource is " + ds.name());
		}
		try {
			return point.proceed();
		} finally {
			DynamicDataSource.clearDataSource();
			logger.debug("clean datasource");
		}
	}

//	@Before("dataSourcePointCut()")
//	public void before(JoinPoint joinPoint) {
//		Object target = joinPoint.getTarget();
//		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//		// 执行方法名
//		String methodName = methodSignature.getName();
//		// 方法参数
//		Class[] parameterTypes = methodSignature.getParameterTypes();
//		try {
//			// 获取方法, 直接getClass获取对象可能为代理对象
//			Method method = target.getClass().getInterfaces()[0].getMethod(methodName, parameterTypes);
//			// 添加默认数据源
//			String dataSource = DataSourceNames.tnds;
//			if (null != method && method.isAnnotationPresent(YYDataSource.class)) {
//				YYDataSource targetDataSource = method.getAnnotation(YYDataSource.class);
//				dataSource = targetDataSource.name();
//			}
//			// 此处添加线程对应的数据源到上下文
//			// 在AbstractRoutingDataSource子类中拿到数据源, 加载后进行配置
//			DynamicDataSource.setDataSource(dataSource);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	/**
//	 * 清除数据源, 方法执行完成后, 清除数据源
//	 */
//	@After("dataSourcePointCut()")
//	public void after(JoinPoint joinPoint) {
//		DynamicDataSource.clearDataSource();
//	}

}
