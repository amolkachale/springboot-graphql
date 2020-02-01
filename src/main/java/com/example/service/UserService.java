package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.entity.User;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class UserService {

	@Autowired
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GraphQLQuery(name = "users") // READ ALL
	public List<User> getUsers() {
		return this.userRepository.findAll();
	}

	@GraphQLQuery(name = "user") // READ BY ID
	public Optional<User> getUserById(@GraphQLArgument(name = "id") Long id) {
		return this.userRepository.findById(id);
	}

	@GraphQLMutation(name = "saveUser") // CREATE
	public User saveUser(@GraphQLArgument(name = "user") User user) {
		return this.userRepository.save(user);
	}

	@GraphQLMutation(name = "deleteUser") // DELETE
	public long deleteUser(@GraphQLArgument(name = "id") Long id) {
		this.userRepository.deleteById(id);
		return id;
	}

}
