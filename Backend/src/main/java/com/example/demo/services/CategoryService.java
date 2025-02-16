package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository crepo;

	public List<Category> getAllCategory() {
		return crepo.findAll();
	}

	public Category saveCategory(Category c) {
		return crepo.save(c);
	}

}
