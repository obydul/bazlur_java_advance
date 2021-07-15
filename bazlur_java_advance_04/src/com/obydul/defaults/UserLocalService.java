package com.obydul.defaults;

import java.util.List;

public class UserLocalService implements UserService {

	private UserRepository userRepository;

	public UserLocalService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);

	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
