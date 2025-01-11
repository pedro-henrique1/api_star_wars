CREATE TABLE planets
(
    id              SERIAL PRIMARY KEY,
    edited          TIMESTAMP,
    climate         VARCHAR(255),
    surface_water   VARCHAR(255),
    name            VARCHAR(255),
    diameter        INTEGER,
    rotation_period INTEGER,
    created         TIMESTAMP,
    terrain         VARCHAR(255),
    gravity         VARCHAR(255),
    orbital_period  INTEGER,
    population      BIGINT
);

CREATE TABLE people
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(255),
    gender     VARCHAR(50),
    skin_color VARCHAR(50),
    hair_color VARCHAR(50),
    height     INTEGER,
    eye_color  VARCHAR(50),
    mass       DOUBLE PRECISION,
    homeworld  INTEGER REFERENCES planets (id),
    birth_year VARCHAR(50),
    created    TIMESTAMP
);

CREATE TABLE species
(
    id               SERIAL PRIMARY KEY,
    edited           TIMESTAMP,
    classification   VARCHAR(255),
    name             VARCHAR(255),
    designation      VARCHAR(255),
    created          TIMESTAMP,
    eye_colors       VARCHAR(255),
    hair_colors      VARCHAR(255),
    skin_colors      VARCHAR(255),
    language         VARCHAR(255),
    homeworld        INTEGER REFERENCES planets (id),
    average_lifespan INTEGER,
    average_height   INTEGER
);

CREATE TABLE films
(
    id            SERIAL PRIMARY KEY,
    title         VARCHAR(255),
    episode_id    INTEGER,
    director      VARCHAR(255),
    producer      VARCHAR(255),
    release_date  DATE,
    opening_crawl TEXT,
    created       TIMESTAMP,
    edited        TIMESTAMP
);

CREATE TABLE starships
(
    id                SERIAL PRIMARY KEY,
    MGLT              VARCHAR(50),
    starship_class    VARCHAR(255),
    hyperdrive_rating VARCHAR(50)
);

CREATE TABLE vehicles
(
    id            SERIAL PRIMARY KEY,
    vehicle_class VARCHAR(255)
);

CREATE TABLE planet_residents
(
    planet_id BIGINT REFERENCES planets (id),
    person_id BIGINT REFERENCES people (id),
    PRIMARY KEY (planet_id, person_id)
);

CREATE TABLE film_planets
(
    film_id   BIGINT REFERENCES films (id),
    planet_id BIGINT REFERENCES planets (id),
    PRIMARY KEY (film_id, planet_id)
);

CREATE TABLE film_characters
(
    film_id      BIGINT REFERENCES films (id),
    character_id BIGINT REFERENCES people (id),
    PRIMARY KEY (film_id, character_id)
);

CREATE TABLE film_species
(
    film_id    BIGINT REFERENCES films (id),
    species_id BIGINT REFERENCES species (id),
    PRIMARY KEY (film_id, species_id)
);

CREATE TABLE starship_pilots
(
    starship_id BIGINT REFERENCES starships (id),
    pilot_id    BIGINT REFERENCES people (id),
    PRIMARY KEY (starship_id, pilot_id)
);

CREATE TABLE vehicle_pilots
(
    vehicle_id BIGINT REFERENCES vehicles (id),
    pilot_id   BIGINT REFERENCES people (id),
    PRIMARY KEY (vehicle_id, pilot_id)
);