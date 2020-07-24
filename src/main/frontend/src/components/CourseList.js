import React from 'react';
import { CardColumns } from 'reactstrap';
import Course from './Course';

function CourseList() {
    return (
        <div>
            <CardColumns>
                <Course />
                <Course />
                <Course />
            </CardColumns>
        </div>
    );
}

export default CourseList;
