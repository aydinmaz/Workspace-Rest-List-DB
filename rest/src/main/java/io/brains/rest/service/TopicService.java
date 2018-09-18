package io.brains.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.brains.rest.model.Topic;

@Service
public class TopicService {

	Topic t1 = new Topic("4", "math", "mathdes");
	Topic t2 = new Topic("5", "hist", "histdes");
	Topic t3 = new Topic("6", "foo", "foodes");

	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "spring", "springcourse"),
			new Topic("2", "java", "javacourse"), new Topic("3", "javasript", "javascriptcourse"), t1, t2));

	List<Topic> topics2 = new ArrayList<>();
	List<Topic> topics3 = new ArrayList<>();

	public List<Topic> getAllTopics() {
		topics2.add(t1);
		topics2.add(t2);
		topics2.add(t3);
		topics3 = Arrays.asList(t1, t2);
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	//dar bala az ravesh lambada estefade kardim inja for loop normal
	public void updateTopic(String id,Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t=topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
      topics.removeIf(t -> t.getId().equals(id));		
	}

}
