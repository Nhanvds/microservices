package com.code.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.entity.Course;
import com.code.repository.CourseRepository;
import com.code.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	private static final Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);

	@Autowired
	CourseRepository courseRepository;

	@Override
	public boolean create(Course course) {
		courseRepository.save(course);
		return true;
	}

	@Override
	public Course getById(int courseId) {
		logger.info("Fetching course by ID...");
		Course course = courseRepository.findById(courseId).orElse(null);
		return course;
	}

	@Override
	public List<Course> getAll() {
		List<Course> courseList = courseRepository.findAll();
		return courseList;
	}

	@Override
	public boolean update(Course course) {
		courseRepository.save(course);
		return true;
	}

	@Override
	public boolean delete(int courseId) {
		courseRepository.deleteById(courseId);
		return true;
	}
}
