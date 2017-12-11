package com.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ali on 11.12.2017.
 */

/**
 * Get /topics gets all topics
 * Get /topics/id gets the topic
 * Post /topics create new topic
 * Put /topics/id updates the topic
 * Delete /topics/id delete the topic
 */

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    public Topic getTopic(String id){

        return topicService.getTopic(id);
    }
}
