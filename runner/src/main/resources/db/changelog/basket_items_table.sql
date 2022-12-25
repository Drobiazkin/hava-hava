

CREATE TABLE public.basket_items
(
    uuid            UUID PRIMARY KEY         NOT NULL,
    create_date     TIMESTAMP with time zone NOT NULL,
    basket_uuid     UUID                     NOT NULL,
    menu_uuid       UUID                     NOT NULL,
    menu_items_uuid UUID                     NOT NULL,
    count           int                      NOT NULL,
    status          VARCHAR(10)              NOT NULL
        CONSTRAINT C_STATUS CHECK ( status in ('CREATE', 'WORK', 'REJECT', 'DELETE', 'COMPLETED', 'DELIVERY'))
);
CREATE INDEX I_BASKET_ITEMS_BASKET_UUID ON basket_items (basket_uuid);
CREATE INDEX I_BASKET_ITEMS_ITEMS_UUID ON basket_items (menu_items_uuid);
CREATE INDEX I_BASKET_ITEMS_ITEMS_UUID_BASKET_UUID ON basket_items (basket_uuid, menu_items_uuid, status);
