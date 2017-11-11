package com.totiruzi.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.totiruzi.topic.Topic;

//Telling JPA this is an entity class, which creates a column having all the entities
@Entity
public class Course {
	// Telling JPA which is the primary key
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne // Mapping topic as a foreign key to id
	private Topic topic;
	
	public Course() {
		
	}
	
	
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description; 
		this.topic = new Topic(topicId, "", "");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	public Topic getTopic() {
		return topic;
	}



	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
