use posts_db;
CREATE DATABASE posts_db;
drop DATABASE posts_db;
insert into posts (title, body) values
('Title 1', 'Body 1 asdf asdf asd fasdf as dfa sdfa sdf'),
('Title 2', 'Body 2 asdf asdf asd fasdf as dfa sdfa sdf'),
('Title 3', 'Body 3 asdf asdf asd fasdf as dfa sdfa sdf'),
('Title 4', 'Body 4 asdf asdf asd fasdf as dfa sdfa sdf'),
('Title 5', 'Body 5 asdf asdf asd fasdf as dfa sdfa sdf');

insert into users (email, password, username) values
(test@email, test, testuser)