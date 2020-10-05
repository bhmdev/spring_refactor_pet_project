CREATE TABLE pets (
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL UNIQUE,
  pet_img_url VARCHAR(255) NOT NULL,
  age VARCHAR(12),
  vaccination_status BOOLEAN,
  description TEXT,
  adoption_story TEXT NOT NULL,
  adoption_status BOOLEAN NOT NULL,
  pet_type_id INTEGER REFERENCES pet_types(id) NOT NULL
);

