CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT ,
    title varchar(255) NOT NULL,
    desc text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    PRIMARY KEY (id)
);

/*
--INSERT INTO Content (title, desc, status, content_type, date_created)
--VALUES  ('Activity1', 'activity1 description', 'IDEA', 'SPORT', CURRENT_TIMESTAMP),
--        ('Activity2', 'activity2 description', 'IDEA', 'SPORT', CURRENT_TIMESTAMP),
--        ('Activity3', 'activity3 description', 'IDEA', 'SPORT', CURRENT_TIMESTAMP);
 */