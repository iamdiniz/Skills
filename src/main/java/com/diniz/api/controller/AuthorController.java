package com.diniz.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diniz.domain.model.Author;
import com.diniz.domain.repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;
	
	@GetMapping
	public List<Author> findAll() {
		return authorRepository.findAll();
	}
	
}
