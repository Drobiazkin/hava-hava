

CREATE TABLE public.weight_menu_items
(
    uuid            UUID PRIMARY KEY         NOT NULL,
    menu_items_uuid UUID                     NOT NULL,
    create_date     TIMESTAMP with time zone NOT NULL,
    weight          double precision         NOT NULL,
    type            VARCHAR(10) default null
        CONSTRAINT C_WEIGHT_MENU_TYPE_CHECK CHECK (type IN ('gr', 'kg', 'ml', 'l'))
);
CREATE INDEX I_WEIGHT_MENU_ITEMS_MENU_UUID ON weight_menu_items (menu_items_uuid);