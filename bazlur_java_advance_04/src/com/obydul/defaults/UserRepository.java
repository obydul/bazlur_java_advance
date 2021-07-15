package com.obydul.defaults;

import java.util.List;

public interface UserRepository {
	void save(User user);
	List<User> findAll();

}
