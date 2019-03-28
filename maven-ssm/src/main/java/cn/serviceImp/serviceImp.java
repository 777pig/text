/**
 * 
 */
/**
 * @author Administrator
 *
 */
package cn.serviceImp;

import org.springframework.stereotype.Service;

import cn.service.service;
@Service
public class serviceImp implements service{

	public void sayhello() {
		System.out.println("hello word!");
	}
	
}