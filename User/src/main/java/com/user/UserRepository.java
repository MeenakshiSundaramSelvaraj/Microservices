package com.user;

public interface UserRepository {
	
	User[] getAllUser();

	User getUser(String number);

}
