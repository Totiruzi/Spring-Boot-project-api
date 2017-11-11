package com.totiruzi.course;
 
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.totiruzi.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	// Returning all topics
	@RequestMapping("/topics/{id/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	// Returning a particular topic
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	// Making a post request
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		//making sure the user does not have to set the topic name by himself
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
		
	}
	
	// Making a put request
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
		public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id) {
			course.setTopic(new Topic(topicId, "", ""));
			courseService.updateCourse(course);
	}
		
		// Deleting a particular topic
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
		public void deletTopic(@PathVariable String id) {
			 courseService.deleteTopic(id);
		}

}
