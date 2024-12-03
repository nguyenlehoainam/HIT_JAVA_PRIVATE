package service;

import java.util.ArrayList;
import java.util.List;

import common.Account;
import common.Address;
import model.Role;
import model.Status;

public class AccountServiceImpl implements AccountService {
	private List<Account> accounts = new ArrayList<>();
	
	
	public AccountServiceImpl() {
		  Address adminAddress = new Address("64 Chùa Láng", "Hà Nội");
	      Account adminAccount = new Account( "0001", "Nguyễn văn A", 30, adminAddress, "27/01/2005","admin","123", Role.ADmin, Status.ACTIVE);
	      
	      accounts.add(adminAccount);

	    
	      Address userAddress = new Address("36 Xuân Phương", "Hà nội");
	      Account userAccount = new Account("0002", "Nguyễn Văn B", 25, userAddress,"29/08/2005","user","123", Role.User, Status.ACTIVE);
	      
	      accounts.add(userAccount);
		}

	@Override
	public List<Account> getAllAccount() {
		
		return null;
	}

	@Override
	public void createNewAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccountByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeStatus(String username, Status status) {
		// TODO Auto-generated method stub
		
	}
	
	



}
