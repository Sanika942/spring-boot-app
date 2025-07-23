package com.couses.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couses.project.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>{
	
}
