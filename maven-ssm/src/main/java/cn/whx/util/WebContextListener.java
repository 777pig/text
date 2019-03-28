package cn.whx.util;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * spirng 配置、 bean的重载
 */
public class WebContextListener extends ContextLoaderListener 
implements java.io.Serializable{
	private static Logger logger = LoggerFactory.getLogger("Init");
	public static ApplicationContext applicationContext;
	public static ServletContextEvent servletContextEvent;

	/**
	 * 获取属性bean
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static Object getBean(String name) throws Exception {
		return applicationContext.getBean(name);
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		/** 初始化bean **/
		super.contextInitialized(event);
		/** 初始化context 和event **/
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		servletContextEvent = event;
		/** 打印SUCCESS图案 **/
		logger.info("*******************");
		logger.info("**---------------**");
		logger.info("**--***********--**");
		logger.info("**--*---------*--**");
		logger.info("**--*-SUCCESS-*--**");
		logger.info("**--*---------*--**");
		logger.info("**--***********--**");
		logger.info("**---------------**");
		logger.info("*******************");
	}

	/**
	 * applicationContext的reload
	 */
	public static void reloadApplicationContext() {
		AbstractRefreshableApplicationContext abstractRefreshableApplicationContext = (AbstractRefreshableApplicationContext) applicationContext;
		logger.info("start refresh the application context");
		abstractRefreshableApplicationContext.refresh();
		/** 打印SUCCESS图案 **/
		logger.info("*******************");
		logger.info("**---------------**");
		logger.info("**--***********--**");
		logger.info("**--*-REFRESH-*--**");
		logger.info("**--*---------*--**");
		logger.info("**--*-SUCCESS-*--**");
		logger.info("**--***********--**");
		logger.info("**---------------**");
		logger.info("*******************");
		logger.info("reload the application context success");
	}
}