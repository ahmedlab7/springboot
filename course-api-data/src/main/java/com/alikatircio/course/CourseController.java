package com.alikatircio.course;

import com.alikatircio.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){

        return courseService.getAllCourses(id);
    }

    @RequestMapping("topics/{topicId}/courses/{id}")
    public Course getCourses(@PathVariable String id){

        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){

        course.setTopic(new Topic(topicId,"", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId){

        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){

        courseService.deleteCourse(id);
    }
}
