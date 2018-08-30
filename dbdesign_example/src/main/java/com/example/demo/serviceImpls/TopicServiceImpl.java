package com.example.demo.serviceImpls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Topic;
import com.example.demo.repositories.TopicRepository;
import com.example.demo.services.TopicService;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public Topic releaseTopic(int teacherId, Date releaseTime) {
		Topic topic = new Topic();
		topic.setTeacherId(teacherId);
		topic.setReleaseTime(releaseTime);
		return topic;
	}

	@Override
	public Topic chooseTopic(int topicId, int studentId, Date chosentime) {
		Topic topic = topicRepository.getOne(topicId);
		topic.setIsChosen(1);
		topic.setStudentId(studentId);
		topic.setChosenTime(chosentime);
		return topic;
	}

	@Override
	public List<Topic> findTopicByTeacherId(int teacherId) {
		return topicRepository.findByTeacherId(teacherId);
	}
	
	@Override
	public List<Topic> findTopicByStudentId(int studentId) {
		return topicRepository.findByStudentId(studentId);
	}
	

}
