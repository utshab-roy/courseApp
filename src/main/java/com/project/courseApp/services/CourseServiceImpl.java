package com.project.courseApp.services;

import com.project.courseApp.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        this.list.add(new Course(101, "java", "java course desc"));
        this.list.add(new Course(102, "kotlin", "kotlin course desc"));
        this.list.add(new Course(103, "oracle", "oracle course desc"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for (Course course :
                list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        this.list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e->{
            if (e.getId() == course.getId()){
                e.setId(course.getId());
                e.setName(course.getName());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        list = this.list.stream().filter(e->e.getId() != courseId).collect(Collectors.toList());
    }


}
