package com.wojia.controller;
//控制器  是一个普通的类

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**@Controller：控制层
 * @RequestMapping:作用在类上、方法上    请求映射路径
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	/*处理全查请求的方法  返回值类型为String的普通方法*/
	@RequestMapping(value = "/selAll")
	public   String    selAll(){
		System.out.println("查询所有的用户信息");

		return   "user";//user是视图名称 前缀+user+后缀
	}





}
