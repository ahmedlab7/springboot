package com.example.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ali on 11.12.2017.
 */

@Service
public class TopicService {

private List<Topic> topics = Arrays.asList(
        new Topic("spring", "spring framework", "Spring framework description"),
        new Topic("java", "cora java", "core java description"),
        new Topic("javascript", "Javascript", "javascript  description")
        );

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

}
