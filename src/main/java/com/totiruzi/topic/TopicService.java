package com.totiruzi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		
		//Making a call to the TopicRepository
		List<Topic> topics = new ArrayList<>(); // Creating a new topic list
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		//filtering through the topics to get a topic
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		//adding topics 
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

}
