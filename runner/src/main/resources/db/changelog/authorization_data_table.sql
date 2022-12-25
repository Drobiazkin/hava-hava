

CREATE TABLE public.authorization_data
(
    uuid        UUID PRIMARY KEY         NOT NULL,
    create_date TIMESTAMP with time zone NOT NULL,
    user_uuid   UUID                     NOT NULL,
    password    VARCHAR(100)             NOT NULL
);
CREATE UNIQUE INDEX I_AUTH_DATA_USER_UUID ON authorization_data (user_uuid);