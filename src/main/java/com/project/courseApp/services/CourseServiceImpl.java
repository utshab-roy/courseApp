package com.project.courseApp.services;

import com.project.courseApp.repository.CourseRepository;
import com.project.courseApp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

    /**
     * creating the object of the CourseRepository
     */
    @Autowired
    private CourseRepository courseRepository;


    /**
     * List of all the courses
     *
     * @return
     */
    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    /**
     * get the single instance of the course by id
     *
     * @param courseId
     * @return
     */
    @Override
    public Course getCourse(long courseId) {
        return courseRepository.findById(courseId).orElse(null);

    }

    /**
     * add a new course in the course table
     * id is auto generated
     *
     * @param course
     * @return
     */
    @Override
    public Course addCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    /**
     * update a single course, have to give the the data with id
     *
     * @param course
     * @return
     */
    @Override
    public Course updateCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    /**
     * delete the course by the given id
     *
     * @param courseId
     */
    @Override
    public void deleteCourse(long courseId) {
        Course course = courseRepository.getOne(courseId);
        courseRepository.delete(course);
    }

    /**
     * custom query implementation in the CourseRepository file
     * @return
     */
    @Override
    public List<String> getCourseName() {
        return courseRepository.getCourseName();
    }

    /**
     * JPA query manipulation followed by convention
     * @param name
     * @return List of courses
     */
    @Override
    public List<Course> getByName(String name) {
        return courseRepository.getByName(name);
    }

}
