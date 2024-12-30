CREATE TABLE planets
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    name            VARCHAR(100) NOT NULL,
    rotation_period INT,
    orbital_period  INT,
    diameter        INT,
    climate         VARCHAR(255),
    gravity         VARCHAR(50),
    terrain         VARCHAR(255),
    surface_water   INT,
    population      BIGINT,
    created_at      DATETIME,
    edited_at       DATETIME
);

CREATE TABLE planet_residents
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    planet_id    INT NOT NULL,
    resident_url VARCHAR(255),
    FOREIGN KEY (planet_id) REFERENCES planets (id) ON DELETE CASCADE
);

CREATE TABLE planet_films
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    planet_id INT NOT NULL,
    film_url  VARCHAR(255),
    FOREIGN KEY (planet_id) REFERENCES planets (id) ON DELETE CASCADE
);
