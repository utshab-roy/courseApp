import React from 'react';
import {
    BrowserRouter as Router,
    Redirect,
    Route,
    Switch,
} from 'react-router-dom';
import { ToastContainer } from 'react-toastify';
import { Col, Container, Row } from 'reactstrap';
import './App.css';
import AddCourse from './components/AddCourse';
import CourseList from './components/CourseList';
import Footer from './components/Footer';
import GenericNotFound from './components/GenericNotFound';
import Header from './components/Header';
import Home from './components/Home';
import NavBar from './components/NavBar';

function App() {
    return (
        <Router>
            <Container>
                <Header />
                <Row>
                    <Col md={4}>
                        <NavBar />
                    </Col>

                    <Col md={8}>
                        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
                        <Switch>
                            <Route path="/view-courses" exact>
                                <CourseList />
                            </Route>
                            <Route path="/add-course" exact>
                                <AddCourse />
                            </Route>
                            <Route path="/" exact>
                                <Home />
                            </Route>
                            <Route path="/404" component={GenericNotFound} />
                            <Redirect to="/404" />
                        </Switch>
                    </Col>
                </Row>
                <Footer />
                <ToastContainer />
            </Container>
        </Router>
    );
}

export default App;
