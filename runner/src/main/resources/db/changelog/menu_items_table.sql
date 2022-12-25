

CREATE TABLE public.menu_items
(
    uuid        UUID PRIMARY KEY         NOT NULL,
    menu_uuid   UUID                     NOT NULL,
    create_date TIMESTAMP with time zone NOT NULL,
    price       decimal,
    price_type  VARCHAR(10) default 'rub',
    stop        boolean default false,
    CONSTRAINT C_MENU_ITEMS_PRICE_TYPE CHECK ( price_type in ('rub', 'dollar', 'kzt'))
);
CREATE INDEX I_MENU_ITEMS_MENU_UUID ON menu_items (menu_uuid);