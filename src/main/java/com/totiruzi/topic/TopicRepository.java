package com.totiruzi.topic;

import org.springframework.data.repository.CrudRepository;


// CrudRepository implements the CRUD operations
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	

}
