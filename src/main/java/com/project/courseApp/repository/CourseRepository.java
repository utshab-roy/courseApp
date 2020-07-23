package com.project.courseApp.repository;

import com.project.courseApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    /**
     * custom query execution
     * @return
     */
    @Query("SELECT name FROM Course")
    List<String> getCourseName();

    /**
     * custom query by JPA modification followed my convention
     * @param name
     * @return List of courses
     */
    List<Course> getByName(String name);
    List<Course> getByNameOrderByNameDesc(String name);
    List<Course> getByNameOrderByIdDesc(String name);

}
