package cn.whx.util;

import javax.servlet.annotation.WebListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制层的重载
 * @author Administrator
 */
/** 热部署参数
 -noverify -javaagent:./jreloader.jar - Djreloader.dirs=./target/classes
 Djreloader.dirs 是class的路径，多个路径使用逗号隔开 
 */
@WebListener
@Controller
@RequestMapping("/reload")
public class ReloadController {
	@ResponseBody
	@RequestMapping("/all")
	public String reloadSpringController() {
		MVCServlet.refreshes();
		WebContextListener.reloadApplicationContext();
		return "success";
	}

	
	@ResponseBody
	@RequestMapping("/reloadSpringContext")
	public String reloadSpringContext() {
		WebContextListener.reloadApplicationContext();
		return "success";
	}
}