CREATE TABLE product(
    id  TEXT PRIMARY key UNIQUE NOT null,
    name TEXT NOT null,
    price_in_cents NUMBER NOT NULL
);