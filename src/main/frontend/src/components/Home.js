import React from 'react';
import { Button, Jumbotron } from 'reactstrap';

function Home() {
    return (
        <div>
            <Jumbotron className="text-center">
                <h1 className="display-6">Spring Boot + React Demo App</h1>
                <p className="lead">
                    Backend has been develop with Spring and the Frontend has
                    been develop with React
                </p>
                <hr className="my-2" />
                <p>Please click the button to see it in action ! ! !</p>
                <p className="lead">
                    <Button color="primary">Welcome</Button>
                </p>
            </Jumbotron>
        </div>
    );
}

export default Home;
