

CREATE TABLE public.basket
(
    uuid             UUID PRIMARY KEY         NOT NULL,
    create_date      TIMESTAMP with time zone NOT NULL,
    paying_user_uuid UUID                     NOT NULL,
    restaurant_uuid  UUID                     NOT NULL,
    status           VARCHAR(10)              NOT NULL
CONSTRAINT C_STATUS CHECK ( status in ('CREATE', 'WORK', 'REJECT', 'DELETE', 'COMPLETED', 'DELIVERY'))
);
CREATE INDEX I_BASKET_USER_UUID_CUSTOMER_UUID_RESTAURANT_UUID ON basket (paying_user_uuid, restaurant_uuid, status);