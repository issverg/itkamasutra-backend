package com.iss.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.iss.dao.UserRepository;
import com.iss.dto.UserDto;
import com.iss.model.User;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	UserRepository repo;
	@Autowired
	Pageable p;

	@Override
	public List<UserDto> getUsers(int page, int size) {
		p = PageRequest.of(page, size);
		return repo.findAll(p)
				.getContent()
				.stream()
				.map(u -> convertUserToUserDto(u))
				.collect(Collectors.toList());
	}

	private UserDto convertUserToUserDto(User u) {
		return new UserDto(u.getId(), u.getImage(), u.isFollowed(), u.getName(), u.getStatus(), u.getLocation());
	}
}