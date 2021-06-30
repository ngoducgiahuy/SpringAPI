package com.giahuy.springapi.restcontroller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giahuy.springapi.entity.Category;
import com.giahuy.springapi.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> findCategories() {
		List<Category> categories = categoryService.getAllCategories();
		return categories;
	}

	@GetMapping("/{categoryId}")
	public Category findCategory(@PathVariable long categoryId) {
		return categoryService.getCategoryById(categoryId);
	}

	@PostMapping
	public Category saveCategory(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}

	@PutMapping("/{categoryId}")
	public Category replaceCategory(@RequestBody Category categoryNewData, @PathVariable long categoryId) {
		
		return categoryService.updateCategory(categoryId, categoryNewData);
	}
	
	@DeleteMapping("/{categoryId}")
	public HashMap<String, String> deleteCategoryById(@PathVariable long categoryId) {
		return categoryService.deleteCategoryById(categoryId);
	}

}
