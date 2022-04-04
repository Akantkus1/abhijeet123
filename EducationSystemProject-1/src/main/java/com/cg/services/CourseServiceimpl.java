package com.cg.services;

import java.util.List;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import com.cg.entities.Course;
import com.cg.exception.ListEmptyException;
import com.cg.repositories.CourseRepository;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course addCourse(Course courseName) {
		return courseRepo.save(courseName);
	}

	@Override
	public void deleteCourse(int courseId) throws NotFoundException {

		courseRepo.deleteById(courseId);
	}

	@Override
	public Course viewCourse(int courseId) throws NotFoundException {

		return courseRepo.findById(courseId).orElse(null);
	}

	@Override
	public List<Course> viewAllCourses() throws ListEmptyException {

		return courseRepo.findAll();
	}

	public IntPredicate updateCourseForTest(int courseId, int transactionId) {
		
		return null;
	}
}
