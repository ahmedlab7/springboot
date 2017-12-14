package com.alikatircio.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 11.12.2017.
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    /*private List<Course> topics = new ArrayList<Course>(Arrays.asList(
        new Course("spring", "spring framework", "Spring framework description"),
        new Course("java", "cora java", "core java description"),
        new Course("javascript", "Javascript", "javascript  description")
        ));*/

    public List<Course> getAllCourses(String topicId){

        //return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;

    }

    public Course getCourse(String id){
        /*for(Course topic : topics){
            if(topic.getId().equals(id)){
                return topic;
            }
        }
        return null;*/

        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {

        //topics.add(course);
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {

        /*for (int i = 0; i<topics.size(); i++){

            Course t = topics.get(i);
            if(t.getId().equals(id)){

                topics.set(i, course);
                return;
            }
        }*/

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

        /*for (int i = 0; i<topics.size(); i++){

            if (topics.get(i).getId().equals(id)){

                topics.remove(i);
            }
        }*/

        courseRepository.delete(id);
    }
}
