package com.project.courseApp.controller;

import com.project.courseApp.model.Course;
import com.project.courseApp.repository.CourseRepository;
import com.project.courseApp.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Connecting with react (CORS policy solution)
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /**
     * implemented just to check the query value in the console
     * not recommended way or approach
     */
    @Autowired
    private CourseRepository courseRepository;

    //    @RequestMapping(path = "/home", method = RequestMethod.GET)
    @GetMapping("/home")
    public List<String> home() {
        // custom query test, see the CourseRepository.java file
        return this.courseService.getCourseName();
    }

    // list of courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    // single course object
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    /**
     * TODO: how to make it follow the convention, courses/name-of-the-course
     *
     * @param courseName
     * @return just the name entity of the courses
     */
    @GetMapping("/name/{courseName}")
    public List<Course> getByName(@PathVariable String courseName) {
        // custom query test, see the CourseRepository.java file
        System.out.println(courseRepository.getByNameOrderByIdDesc("Python"));
        System.out.println(courseRepository.getByNameOrderByNameDesc("Python"));
        return this.courseService.getByName(courseName);
    }

    // adding new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    // updating existing course using put request
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }


    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
