package com.couses.project.service;

import java.util.List;

import com.couses.project.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	void deleteCourse(long courseId);
}
