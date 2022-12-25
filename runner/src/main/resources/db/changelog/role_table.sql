

CREATE TABLE public.role
(
    uuid        UUID PRIMARY KEY         NOT NULL,
    create_date TIMESTAMP with time zone NOT NULL,
    role        VARCHAR(50)
);
CREATE UNIQUE INDEX I_UNIQ_ROLE ON role (role);