package com.wojia.mapper;

import com.wojia.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
	/*查询所有*/
	public List<Account> findAll();
	/*根据id删除*/
	public   int  delById(@Param("id") int id);
/*新增*/
	public  int addAccount(Account account);
/*根据id查询*/
	public  Account findById(int id);
/*修改*/
	public  int update(Account account);
}
