package service;

import java.util.List;

import common.Account;
import model.Status;


public interface AccountService {
	public List<Account> getAllAccount();
	void createNewAccount(Account account);
	Account getAccountByUsername(String username);
	void deleteAccount(String username);
	void changeStatus(String username, Status status);



}
