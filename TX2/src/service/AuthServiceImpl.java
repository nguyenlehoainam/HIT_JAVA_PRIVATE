package service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Role;
import common.Account;



public class AuthServiceImpl implements AuthService  {
	
	private List<Account> users = new ArrayList<>(); 
    private Account currentUser = null;

	@Override
	public void login(Scanner scanner) {
	  
	        System.out.println("Enter username: ");
	        String username = scanner.nextLine();
	        System.out.println("Enter password: ");
	        String password = scanner.nextLine();

	        for (Account user : users) {
	            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
	                currentUser = user;
	                System.out.println("Login successful! Welcome " + username);
	                return;
	            }
	        }
	        System.out.println("Invalid username or password.");
	    
		
	}

	@Override
	public void logout() {
		
		
	}

	@Override
	public void changePassword(String username, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}
	
	

}
