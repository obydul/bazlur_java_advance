package com.obydul.defaults;

import java.util.List;

public class UserRemoteService implements UserService {
	private RestClient client;

	public UserRemoteService(RestClient client) {
		this.client = client;
	}

	@Override
	public void save(User user) {
		client.save(user);

	}

	@Override
	public List<User> findAll() {
		return client.findAll();
	}

}
