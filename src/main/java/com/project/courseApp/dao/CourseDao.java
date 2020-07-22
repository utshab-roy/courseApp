package com.project.courseApp.dao;

import com.project.courseApp.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseDao extends JpaRepository<Course, Long> {
    @Query("SELECT name FROM Course")
    List<String> getCourseName();
}
