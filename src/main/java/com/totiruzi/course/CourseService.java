package com.totiruzi.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		
		//Making a call to the TopicRepository
		List<Course> courses = new ArrayList<>(); // Creating a new topic list
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		//filtering through the courses to get a course
		
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		//adding topics 
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void deleteTopic(String id) {
		courseRepository.delete(id);
	}

}
