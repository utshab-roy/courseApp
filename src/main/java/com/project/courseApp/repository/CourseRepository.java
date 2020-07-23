package com.project.courseApp.repository;

import com.project.courseApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT name FROM Course")
    List<String> getCourseName();
}
