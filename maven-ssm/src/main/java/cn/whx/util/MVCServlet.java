package cn.whx.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.DispatcherServlet;


public class MVCServlet extends DispatcherServlet {
	

	private static final long serialVersionUID = 1L;
	private static MVCServlet servlet;
	private static Logger logger = LoggerFactory.getLogger("Init");

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		servlet = this;
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

	public static void refreshes() {
		System.out.println("对控制层进行重载 ");
		servlet.refresh();
	}
}