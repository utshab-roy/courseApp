package com.project.courseApp.services;

import com.project.courseApp.dao.CourseDao;
import com.project.courseApp.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

    /**
     * creating the object of the CourseDao
     */
    @Autowired
    private CourseDao courseDao;


    /**
     * List of all the courses
     *
     * @return
     */
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    /**
     * get the single instance of the course by id
     *
     * @param courseId
     * @return
     */
    @Override
    public Course getCourse(long courseId) {
        return courseDao.findById(courseId).orElse(null);

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
        courseDao.save(course);
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
        courseDao.save(course);
        return course;
    }

    /**
     * delete the course by the given id
     *
     * @param courseId
     */
    @Override
    public void deleteCourse(long courseId) {
        Course course = courseDao.getOne(courseId);
        courseDao.delete(course);
    }

    /**
     * custom query implementation in the CourseDao file
     * @return
     */
    @Override
    public List<String> getCourseName() {
        return courseDao.getCourseName();
    }

}
