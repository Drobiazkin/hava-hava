CREATE TABLE public.customers
(
    uuid        UUID PRIMARY KEY         NOT NULL,
    create_date TIMESTAMP with time zone NOT NULL,
    org_name    VARCHAR(500)             NOT NULL,
    inn         VARCHAR(12),
    kpp         VARCHAR(9)
);