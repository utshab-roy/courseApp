import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { CardColumns } from 'reactstrap';
import Course from './Course';

function CourseList() {
    const [courses, setCourses] = useState([]);

    useEffect(() => {
        axios
            .get(`http://localhost:8080/courses`)
            .then(res => {
                // console.log(res.data);
                const data = res.data;
                setCourses(data);
            })
            .catch(error => {
                console.log(error);
            });

        return () => {
            // cleanup
        };
    }, []);

    /**
     * () => ({ name: 'Amanda' })  // Shorthand to return an object
     *
     * () => {
     *    return { name : 'Amanda' }
     * }
     */

    // course list iteration
    const courseList = courses.map((course, index) => (
        <Course key={index} course={course} />
    ));

    return (
        <div>
            <h1>List of courses</h1>
            <CardColumns>
                {courses.length > 0 ? courseList : 'No courses available'}
            </CardColumns>
        </div>
    );
}

export default CourseList;
