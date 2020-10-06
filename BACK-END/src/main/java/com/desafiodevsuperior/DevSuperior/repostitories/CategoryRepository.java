package com.desafiodevsuperior.DevSuperior.repostitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiodevsuperior.DevSuperior.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
