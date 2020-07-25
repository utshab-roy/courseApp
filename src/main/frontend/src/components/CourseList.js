import React, { useState } from 'react';
import { CardColumns } from 'reactstrap';
import Course from './Course';

function CourseList() {
    const [courses, setCourses] = useState([
        { title: 'java', description: 'best course' },
        { title: 'python', description: 'Hello world' },
    ]);

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
