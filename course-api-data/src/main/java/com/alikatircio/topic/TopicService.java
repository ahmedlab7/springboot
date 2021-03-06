package com.alikatircio.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ali on 11.12.2017.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*private List<Course> topics = new ArrayList<Course>(Arrays.asList(
        new Course("spring", "spring framework", "Spring framework description"),
        new Course("java", "cora java", "core java description"),
        new Course("javascript", "Javascript", "javascript  description")
        ));*/

    public List<Topic> getAllTopics(){

        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;

    }

    public Topic getTopic(String id){
        /*for(Course topic : topics){
            if(topic.getId().equals(id)){
                return topic;
            }
        }
        return null;*/

        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {

        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {

        /*for (int i = 0; i<topics.size(); i++){

            Course t = topics.get(i);
            if(t.getId().equals(id)){

                topics.set(i, topic);
                return;
            }
        }*/

        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        /*for (int i = 0; i<topics.size(); i++){

            if (topics.get(i).getId().equals(id)){

                topics.remove(i);
            }
        }*/

        topicRepository.delete(id);
    }
}
