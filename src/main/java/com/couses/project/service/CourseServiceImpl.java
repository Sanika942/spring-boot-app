package com.couses.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.couses.project.dao.CourseDao;
import com.couses.project.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService{

//	List<Courses>list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Courses(145,"Java Core Course","this is java course"));
//		list.add(new Courses(115,"C++ Core Course","this is cpp course"));
//		list.add(new Courses(112,"Django Core Course","this is django course"));
//		list.add(new Courses(140,"React Core Course","this is react course"));

	}
	@Override
	public List<Courses> getCourses() {
//        return list;
		return courseDao.findAll();
    }

	 public Courses getCourse(long courseId) {
//	        for (Courses c : list) {
//	            if (c.getId() == courseId) {
//	                return c;
//	            }
//	        }
//	        return null;
		 return courseDao.getOne(courseId);
	    }
	 @Override
	 public Courses addCourse(Courses course) {
//		list.add(course);
//		return course;
		 courseDao.save(course);
		return  course;
	 }
	 @Override
	 public Courses updateCourse(Courses course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		 courseDao.save(course);
		 return course;
	 }
	 @Override
	 public void deleteCourse(long courseId) {
//		    list.removeIf(course -> course.getId() == courseId);
		 	Courses entity=courseDao.getOne(courseId);
		 	courseDao.delete(entity);
		 
		}
	 	
}
