CREATE TABLE pet_types (
  id SERIAL PRIMARY KEY,
  classification VARCHAR(30) NOT NULL,
  type VARCHAR(50) NOT NULL,
  breed VARCHAR(50) NOT NULL UNIQUE,
  breed_img_url VARCHAR(255) NOT NULL UNIQUE,
  description TEXT
);

