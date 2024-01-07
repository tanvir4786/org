package com.photoshoot.org.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.photoshoot.org.Entity.User;

@Service
public interface UserService {
	User createUser(User user);

	User getUserById(Long userId);

	List<User> getAllUsers();

	User updateUser(User user);

	void deleteUser(Long userId);
}
