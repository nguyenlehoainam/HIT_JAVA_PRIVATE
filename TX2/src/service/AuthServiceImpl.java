package service;


import common.Account;
import common.Address;
import model.Role;
import model.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AuthServiceImpl implements AuthService  {
	
	private AccountService accountService = new AccountServiceImpl();
	private Account logInAccount;
	@Override
	 public void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Account account = accountService.getAccountByUsername(username);
        if (account != null && account.getPassword().equals(password)) {
        	System.out.println("đăng nhập thành công !");
        } else {
            System.out.println("sai tài khoản hoặc mật khẩu.");
        }
    }

	@Override
	public void logout() {
		if (logInAccount != null) {
            System.out.println("đăng xuất thành công");
            logInAccount = null;
        } else {
            System.out.println("chưa đăng nhập.");
        }
	}
	@Override
	public void changePassword(String username, String oldPassword, String newPassword) {
		
	
		if (logInAccount != null && logInAccount.getUserName().equals(username)
	            && logInAccount.getPassword().equals(oldPassword)) {
	            logInAccount.setPassword(newPassword);
	            System.out.println("đổi mật khẩu thành công!");
	        } else {
	            System.out.println("lỗi đổi mật khẩu.");
		
	}
	}
	  public Account getLoggedInAccount() {
	        return logInAccount;
	  }

	
	}

	
	


