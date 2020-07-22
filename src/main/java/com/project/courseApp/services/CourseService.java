package com.project.courseApp.services;

import com.project.courseApp.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);

    List<String> getCourseName();
}
