import axios from 'axios';
import React from 'react';
import { toast } from 'react-toastify';
import {
    Button,
    Card,
    CardBody,
    CardSubtitle,
    CardTitle,
    Container,
} from 'reactstrap';
import base_url from './../api/bootapi';

function Course(props) {
    //destructuring the property
    const { course, updateCourse } = props;

    const updateCourseData = (id, event) => {
        console.log('id of courses', event.preventDefault());
    };

    const deleteCourse = id => {
        axios
            .delete(`${base_url}/courses/${id}`)
            .then(res => {
                updateCourse(id);
                toast.error('Course has been deleted !');
            })
            .catch(error => {
                console.log(error);
            });
    };

    return (
        <div>
            <Card>
                <CardBody className="text-center">
                    <CardTitle className="font-weight-bold">
                        {course.name}
                    </CardTitle>
                    <CardSubtitle>{course.description}</CardSubtitle>

                    <Container className="mt-3">
                        <Button
                            type="submit"
                            onClick={e => updateCourseData(course.id, e)}
                            color="warning"
                        >
                            Update
                        </Button>{' '}
                        <Button
                            color="danger"
                            onClick={() => deleteCourse(course.id)}
                        >
                            Delete
                        </Button>
                    </Container>
                </CardBody>
            </Card>
        </div>
    );
}

export default Course;
