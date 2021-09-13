package com.test1;
import java.util.ResourceBundle;

public class App {

	public int userLogin(String user,String pass_word)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String Password=rb.getString("password");
		
		if(user.equals(userName)&& pass_word.equals(Password)) 
		return 1;
		else
		return 0;
	}
	
	
}
