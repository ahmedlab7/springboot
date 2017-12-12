package com.example.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ali on 11.12.2017.
 */

@Service
public class TopicService {

private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
        new Topic("spring", "spring framework", "Spring framework description"),
        new Topic("java", "cora java", "core java description"),
        new Topic("javascript", "Javascript", "javascript  description")
        ));

    public List<Topic> getAllTopics(){

        return topics;

    }

    public Topic getTopic(String id){
        for(Topic topic : topics){
            if(topic.getId().equals(id)){
                return topic;
            }
        }
        return null;
    }

    public void addTopic(Topic topic) {

        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {

        for (int i = 0; i<topics.size(); i++){

            Topic t = topics.get(i);
            if(t.getId().equals(id)){

                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {

        for (int i = 0; i<topics.size(); i++){

            if (topics.get(i).getId().equals(id)){

                topics.remove(i);
            }
        }
    }
}
