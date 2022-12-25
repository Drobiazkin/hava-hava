

CREATE TABLE public.heading_menu_items
(
    uuid            UUID PRIMARY KEY         NOT NULL,
    menu_items_uuid UUID                     NOT NULL,
    create_date     TIMESTAMP with time zone NOT NULL,
    search          tsvector                 NOT NULL,
    heading         VARCHAR(50)              NOT NULL,
    language        VARCHAR(10) default 'ru' NOT NULL
        CONSTRAINT C_HEADING_MENU_LANGUAGE CHECK (language in ('ru', 'en'))
);
CREATE INDEX I_HEADING_MENU_HEADING_SEARCH ON heading_menu_items USING GIST (search);
CREATE INDEX I_HEADING_MENU_ITEMS_MENU_ITEMS_UUID ON heading_menu_items (menu_items_uuid);