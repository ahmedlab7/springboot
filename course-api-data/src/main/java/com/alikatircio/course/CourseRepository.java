package com.alikatircio.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ali on 13.12.2017.
 */
public interface CourseRepository extends CrudRepository<Course, String > {

    public List<Course> findByTopicId(String topicId);
}
