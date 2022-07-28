package com.wojia.service;

import com.wojia.mapper.AccountMapper;
import com.wojia.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
@Service
public class AccountService implements   IAccountService {
	@Autowired
	private AccountMapper   mapper;
	@Override
	public List<Account> findAll() {
 		return mapper.findAll();
	}

	@Override
	public int delById(int id) {
		return mapper.delById(id);
	}

	public int addAccount(Account account) {
		return   mapper.addAccount(account);
	}

	@Override
	public Account findById(int id) {
		return mapper.findById(id);
	}

	@Override
	public int update(Account account) {
		return mapper.update(account);
	}
}
