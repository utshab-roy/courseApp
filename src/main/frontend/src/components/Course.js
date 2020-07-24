import React from 'react';
import {
    Button,
    Card,
    CardBody,
    CardSubtitle,
    CardTitle,
    Container,
} from 'reactstrap';

function Course(props) {
    //destructuring the property
    const { course } = props;
    return (
        <div>
            <Card>
                <CardBody className="text-center">
                    <CardTitle className="font-weight-bold">
                        {course.title}
                    </CardTitle>
                    <CardSubtitle>{course.description}</CardSubtitle>

                    <Container className="mt-3">
                        <Button color="warning">Update</Button>{' '}
                        <Button color="danger">Delete</Button>
                    </Container>
                </CardBody>
            </Card>
        </div>
    );
}

export default Course;
