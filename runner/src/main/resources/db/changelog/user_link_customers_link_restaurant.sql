

CREATE TABLE public.user_link_customers_link_restaurant
(
    uuid            UUID PRIMARY KEY         NOT NULL,
    create_date     TIMESTAMP with time zone NOT NULL,
    user_uuid       UUID                     NOT NULL,
    customer_uuid   UUID                     NOT NULL,
    restaurant_uuid UUID                     NOT NULL,
    user_role       UUID                     NOT NULL
);
CREATE INDEX I_USER_UUID_LINK_USER_UUID_CUSTOMER_UUID_RESTAURANT_UUID ON user_link_customers_link_restaurant (user_uuid, customer_uuid, restaurant_uuid, user_role);
CREATE INDEX I_USER_UUID_LINK_USER_UUID_RESTAURANT_UUID ON user_link_customers_link_restaurant (user_uuid, restaurant_uuid);