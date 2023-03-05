package com.lcwd.orm.repository;

import com.lcwd.orm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
