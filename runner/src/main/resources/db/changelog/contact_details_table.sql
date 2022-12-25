

CREATE TABLE public.contact_details
(
    uuid             UUID PRIMARY KEY         NOT NULL,
    create_date      TIMESTAMP with time zone NOT NULL,
    unified_uuid     UUID                     NOT NULL,
    email            VARCHAR(320),
    phone            VARCHAR(20),
    telegram         VARCHAR(50),
    contact_customer boolean default false
);
CREATE INDEX I_CONTACT_DETAILS_UNIFIED_UUID_CUSTOMER_BOOLEAN ON contact_details (unified_uuid, contact_customer);