CREATE DATABASE course;

USE course;

CREATE TABLE tab_user(
    u_id INT PRIMARY KEY AUTO_INCREMENT,
    
);

CREATE TABLE tab_favorite(
    u_id INT,
    c_id INT
);

CREATE TABLE tab_courses(
    c_id INT,
    c_code VARCHAR,
    t_id INT,
    c_name VARCHAR,
    category_id INT,
    credit INT,
    c_target VARCHAR,
    department VARCHAR,
    c_week VARCHAR,
    c_day VARCHAR,
    c_lesson VARCHAR
);

CREATE TABLE tab_location(
    c_id INT,
    c_location VARCHAR,
    c_time VARCHAR
);

CREATE TABLE tab_teacher(
    t_id INT,
    
);


CREATE TABLE tab_comment(
    c_id INT,
    u_id INT,
    comment VARCHAR,
    comment_date TIMESTAMP
)



