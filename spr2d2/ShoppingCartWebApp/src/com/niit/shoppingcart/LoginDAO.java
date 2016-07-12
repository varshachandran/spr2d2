package com.niit.shoppingcart;

public class LoginDAO {
	

	public  boolean isValiduser(String userID, String password) {
		if(userID.equals(password))
		{
			return true;// TODO Auto-generated method stub
		}
		else
		{
		return false;
	}

	}
}
