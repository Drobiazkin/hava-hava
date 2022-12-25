

CREATE TABLE public.description_menu_items
(
    uuid            UUID PRIMARY KEY         NOT NULL,
    menu_items_uuid UUID                     NOT NULL,
    create_date     TIMESTAMP with time zone NOT NULL,
    search          tsvector                 NOT NULL,
    description     VARCHAR(2000)            NOT NULL,
    language        VARCHAR(10) default 'ru' NOT NULL
        CONSTRAINT C_HEADING_MENU_LANGUAGE CHECK (language in ('ru', 'en'))
);
CREATE INDEX I_DESCRIPTION_MENU_HEADING_SEARCH ON description_menu_items USING GIST (search);
CREATE INDEX I_DESCRIPTION_MENU_ITEMS_MENU_ITEMS_UUID ON description_menu_items (menu_items_uuid);