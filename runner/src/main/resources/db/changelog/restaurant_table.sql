

CREATE TABLE public.restaurant
(
    uuid          UUID PRIMARY KEY         NOT NULL,
    create_date   TIMESTAMP with time zone NOT NULL,
    customer_uuid UUID                     NOT NULL,
    info          VARCHAR(100),
    nickname      VARCHAR(30)              NOT NULL
);
CREATE UNIQUE INDEX I_RESTAURANT_NICKNAME ON restaurant (nickname);