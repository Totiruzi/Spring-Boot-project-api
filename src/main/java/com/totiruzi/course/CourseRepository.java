package com.totiruzi.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


// CrudRepository implements the CRUD operations
public interface CourseRepository extends CrudRepository<Course, String> {
	
	//creating a method for getting courses by name 
	public List<Course> findByTopicId(String topicId);

}
