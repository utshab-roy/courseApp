import React from 'react';
import { Button, Form, FormGroup, Input, Label } from 'reactstrap';

function AddCourse() {
    return (
        <div>
            <Form>
                <FormGroup>
                    <Label for="title">Title</Label>
                    <Input
                        type="text"
                        name="title"
                        id="title"
                        placeholder="Enter course title..."
                    />
                </FormGroup>
                <FormGroup>
                    <Label for="description">Description of the course</Label>
                    <Input type="textarea" name="text" id="description" />
                </FormGroup>
                <Button color="success">Submit</Button>{' '}
                <Button color="info">Clear</Button>
            </Form>
        </div>
    );
}

export default AddCourse;
