import React from 'react';
import { Container } from 'reactstrap';
import './App.css';
import AddCourse from './components/AddCourse';
import CourseList from './components/CourseList';
import Footer from './components/Footer';
import Home from './components/Home';

function App() {
    return (
        <Container>
            <Home />
            <CourseList />
            <AddCourse />
            <Footer />
        </Container>
    );
}

export default App;
