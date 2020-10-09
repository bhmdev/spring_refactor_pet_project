CREATE TABLE pet_types (
    id SERIAL PRIMARY KEY,
    type VARCHAR,
    description VARCHAR(255),
    img_url VARCHAR NOT NULL
);