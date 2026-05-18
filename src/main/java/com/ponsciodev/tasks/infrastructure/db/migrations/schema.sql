CREATE TABLE task(
    task_id PRIMARY KEY VARCHAR(255),
    board_id VARCHAR(255),
    name VARCHAR(50),
    description VARCHAR(150),
    start_date VARCHAR(255),
    end_date VARCHAR(255)
);

