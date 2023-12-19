DROP TABLE IF EXISTS joke;

CREATE TABLE jokes(
    id SERIAL PRIMARY KEY,
    joke VARCHAR(25),
    created_at TIMESTAMP
);