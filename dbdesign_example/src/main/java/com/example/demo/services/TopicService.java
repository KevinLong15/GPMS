package com.example.demo.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.models.Topic;

public interface TopicService {
	
	// 上传课题
	Topic releaseTopic(int teacherId, Date releasetime);
	
	//选定课题
	Topic chooseTopic(int topicId, int studentId, Date chosentime);
	
	//查询课题
	List<Topic> findTopicByStudentId(int studentId);
	List<Topic> findTopicByTeacherId(int teacherId);

}
