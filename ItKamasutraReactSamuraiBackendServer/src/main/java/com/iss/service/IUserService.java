package com.iss.service;

import java.util.List;

import com.iss.dto.UserDto;

public interface IUserService {
	List<UserDto> getUsers(int page, int size);
}