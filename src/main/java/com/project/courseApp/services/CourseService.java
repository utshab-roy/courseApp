package com.project.courseApp.services;

import com.project.courseApp.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);

    // raw query execute interface
    List<String> getCourseName();

    //
    List<Course> getByName(String name);
}
