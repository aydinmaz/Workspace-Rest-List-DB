package io.javabrains.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrepo;

	public List<Topic> getAllTopics() {

		return (List<Topic>) topicrepo.findAll();
	}

	public Optional<Topic> getTopic(String id) {
		return topicrepo.findById(id);
	}

	public void addTopic(Topic topic) {
		topicrepo.save(topic);

	}

	// dar bala az ravesh lambada estefade kardim inja for loop normal
	public void updateTopic(String id, Topic topic) {
		topicrepo.save(topic);

	}

	public void deleteTopic(String id) {
		topicrepo.deleteById(id);
	}

}
