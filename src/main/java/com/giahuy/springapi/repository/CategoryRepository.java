package com.giahuy.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giahuy.springapi.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
