Setup the project:
-----------------
Setup virtualenv

> mkdir bookapi
> cd bookapi

- Create virtual environment using python3
> virtualenv -p /usr/bin/python3 venv

- Activate virtual environment
> . venv/bin/activate



Write external api using third party api
- setup flask app  => DONE
- implement base version => DONE
    - Fix encoding in name of the book => Done
    - format release  date => Done

- move api details to config => Done
- add logger 
- write unit test => Done
- write integration test => Done

Write api using db
- setup flask app => Done
- implement base version => Done

- move db details to config
- add logger
- write unit test
- write integration test

- Write documentation
- Make the project installable
- Test the installation
- check in into git repo




CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    isbn VARCHAR(50) NOT NULL,
    authors VARCHAR(100) NOT NULL,
    country VARCHAR(50) NOT NULL,
    number_of_pages INT DEFAULT 0,
    publisher VARCHAR(100),
    release_date DATE
)
