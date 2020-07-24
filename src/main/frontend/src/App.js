import React from 'react';
import { Container } from 'reactstrap';
import './App.css';
import CourseList from './components/CourseList';
import Home from './components/Home';

function App() {
    return (
        <Container>
            <Home />
            <CourseList />
        </Container>
    );
}

export default App;
