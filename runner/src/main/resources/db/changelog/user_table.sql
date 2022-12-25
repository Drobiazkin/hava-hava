

CREATE TABLE public.user
(
    uuid             UUID PRIMARY KEY         NOT NULL,
    create_date      TIMESTAMP with time zone NOT NULL,
    name             VARCHAR(50)              NOT NULL,
    nickname         VARCHAR(30)              NOT NULL
);
CREATE UNIQUE INDEX I_USER_NICK_NAME ON "user" (nickname);