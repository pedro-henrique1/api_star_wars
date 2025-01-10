CREATE TABLE transport
(
    id                     SERIAL PRIMARY KEY,
    edited                 TIMESTAMP,
    consumables            VARCHAR(255),
    name                   VARCHAR(255),
    created                TIMESTAMP,
    cargo_capacity         BIGINT,
    passengers             INTEGER,
    max_atmosphering_speed INTEGER,
    crew                   INTEGER,
    length                 DOUBLE PRECISION,
    model                  VARCHAR(255),
    cost_in_credits        BIGINT,
    manufacturer           VARCHAR(255)
);