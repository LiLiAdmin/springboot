package com.wojia.service;



import com.wojia.pojo.Account;

import java.util.List;

public interface IAccountService {
	/*查询所有*/
	public List<Account> findAll();
	/*删除*/
	public   int  delById(int id);
	/*新增*/
	public int addAccount(Account account);
/*根据id查询账户信息*/
	public Account findById(int id);
/*真正的修改*/
	public int update(Account account);
}
