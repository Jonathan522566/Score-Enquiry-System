package com.example.DEMO.java_web_lab14_1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//JDK代理类
public class JdkProxy implements InvocationHandler{
	// 声明目标类接口
	private UserDao userDao;
	// 创建代理方法，生成得到代理类
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		// 1.类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		// 2.被代理对象实现的所有接口
		Class[] clazz = userDao.getClass().getInterfaces();
		// 3.使用代理类，进行增强，返回的是代理后的对象
		return  Proxy.newProxyInstance(classLoader,clazz,this);
	}
	/*
	 * 所有动态代理类的方法调用，都会交由invoke()方法去处理
	 * proxy 被代理后的对象 
	 * method 将要被执行的方法信息（反射） 
	 * args 执行方法时需要的参数
	 */
	//处理代理实例，并返回结果
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 声明切面
		MyAspect myAspect = new MyAspect();
		// 前增强
		myAspect.check_Permissions();
		// 在目标类上调用方法，并传入参数
		Object obj = method.invoke(userDao, args);
		// 后增强
		myAspect.log();
		return obj;
	}
}
