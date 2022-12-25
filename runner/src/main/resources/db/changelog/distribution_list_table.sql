

CREATE TABLE public.distribution_list
(
    uuid             UUID PRIMARY KEY         NOT NULL,
    create_date      TIMESTAMP with time zone NOT NULL,
    restaurant_uuid  UUID                     NOT NULL,
    name             VARCHAR(50)              NOT NULL,
    telegram_chat_id VARCHAR(100) DEFAULT NULL,
    whatsapp_chat_id VARCHAR(100) DEFAULT NULL,
    user_chat_uuid   UUID         DEFAULT NULL,
    post             VARCHAR(50)  DEFAULT NULL,
    delivery         boolean      DEFAULT FALSE
);
CREATE INDEX I_DIST_LIST_RESTAURANT_UUID ON distribution_list (restaurant_uuid);