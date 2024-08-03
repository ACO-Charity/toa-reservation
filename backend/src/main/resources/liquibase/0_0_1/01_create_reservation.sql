--liquibase formatted sql
--changeset Minh Hoang Pham:0.0.1-01

CREATE TABLE reservation
(
    id         UUID                        NOT NULL primary key default gen_random_uuid(),
    created    TIMESTAMP WITHOUT TIME ZONE NOT NULL             default now(),
    updated    TIMESTAMP WITHOUT TIME ZONE                      default now(),
    first_name VARCHAR                     NOT NULL,
    last_name  VARCHAR                     NOT NULL,
    email      VARCHAR                     NOT NULL UNIQUE
);