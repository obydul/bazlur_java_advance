package com.obydul.defaults;

import java.util.List;

public interface UserService {
	void save(User user);
	List<User> findAll();
	default User findByName(String name);
}
