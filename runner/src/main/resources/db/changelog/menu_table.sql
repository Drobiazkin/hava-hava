

CREATE TABLE public.menu
(
    uuid          UUID PRIMARY KEY         NOT NULL,
    create_date   TIMESTAMP with time zone NOT NULL,
    customer_uuid UUID                     NOT NULL,
    status        boolean default true
);
CREATE INDEX I_MENU_CUSTOMER_UUID ON menu (customer_uuid);