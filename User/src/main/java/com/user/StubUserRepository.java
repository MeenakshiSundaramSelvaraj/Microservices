package com.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubUserRepository implements UserRepository {
	Map<String, User> users = new HashMap<>();

	public StubUserRepository() {

		User user = new User("Admin", "Sunder");
		users.put("1", user);
		user = new User("WebMaster", "Dinesh");
		users.put("2", user);
		user = new User("DesignMaster", "Rajesh");
		users.put("3", user);
	}

	@Override
	public User[] getAllUser() {
		return users.values().toArray(new User[0]);
	}

	@Override
	public User getUser(String number) {
		return users.get(number);
	}

}
