package com.obydul.defaults;

import java.util.List;

public interface RestClient {
	void save(User user);
	List<User> findAll();

}
