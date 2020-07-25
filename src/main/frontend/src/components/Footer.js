import React from 'react';

function Footer() {
    return (
        <>
            <footer class="my-5 pt-5 text-muted text-center text-small">
                <p class="mb-1">&copy; {new Date().getFullYear()} Utshab Roy</p>
                <ul class="list-inline">
                    <li class="list-inline-item">
                        <a href="https://github.com/utshab-roy">Github</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="https://www.facebook.com/uutshab">Facebook</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="mailto:utshab.roy@gmail.com">Support</a>
                    </li>
                </ul>
            </footer>
        </>
    );
}

export default Footer;
