

CREATE TABLE public.address
(
    uuid         UUID PRIMARY KEY         NOT NULL,
    create_date  TIMESTAMP with time zone NOT NULL,
    unified_uuid UUID                     NOT NULL,
    address_type VARCHAR(20)              NOT NULL,
    point        POINT,
    country      VARCHAR(50),
    city         VARCHAR(50),
    street       VARCHAR(100),
    building     VARCHAR(10),
    office       VARCHAR(10),
    floor        int,
    comment      VARCHAR(50)
        CONSTRAINT C_ADDRESS_TYPE CHECK ( address_type in ('user', 'customers', 'restaurant'))
);
CREATE INDEX I_ADDRESS_CUSTOMER_UUID ON address (unified_uuid);