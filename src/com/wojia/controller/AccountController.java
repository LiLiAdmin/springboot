package com.wojia.controller;

import com.wojia.pojo.Account;
import com.wojia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//控制器
@Controller
@RequestMapping(value = "/account")
public class AccountController {
	@Autowired
	private AccountService service;

	/*定义处理  查询所有账户信息的方法*/
	@RequestMapping("/sel")
	public String selAccounts(Model  model) {
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		//处理请求  调用的是业务层方法
		List<Account> list = service.findAll();
		//存值
		model.addAttribute("list",list);
		//指向视图页面
		return "account";
	}

	/*删除  同名即可接收参数*/
	@RequestMapping("/del")
	public String del(int id) {
		int i = service.delById(id);
		//根据i的值
		if (i > 0) {
			return "redirect:sel.do";//指令：路径   forward
		} else {
			return "error";//视图名称
		}
	}

	/*处理新增请求
	 * 请求名字和类中的属性名称一致   接收整个对象参数
	 * */
	@RequestMapping("/add")
	public String add(Account account) {
		int i = service.addAccount(account);
		//根据i的值
		if (i > 0) {
			return "redirect:sel.do";//指令：路径   forward
		} else {
			return "error";//视图名称
		}
	}

	/*修改第一步  Model:模型 容器 存储数据*/
	@RequestMapping("/preUpdate")
	public String preUpdate(int id, Model model) {
		//根据id查询账户信息
		Account account = service.findById(id);
		//存值  容器
		model.addAttribute("account", account);
		return "update";//视图名称
	}
 	/*修改*/
	@RequestMapping("/update")
	public String update(Account account) {
		int i = service.update(account);
		//根据i的值
		if (i > 0) {
			return "redirect:sel.do";//指令：路径   forward
		} else {
			return "error";//视图名称
		}
	}
}
