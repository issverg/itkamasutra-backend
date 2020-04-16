package com.iss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iss.dto.UserDto;
import com.iss.service.IUserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class UsersController {
	@Autowired
	IUserService service;

	@GetMapping("/{page}/{size}")
	public List<UserDto> getListOfUsers(@PathVariable int page, @PathVariable int size) {
		return service.getUsers(page, size);
	}
}