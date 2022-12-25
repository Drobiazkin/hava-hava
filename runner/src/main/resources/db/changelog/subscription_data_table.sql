

CREATE TABLE public.subscription_data
(
    uuid          UUID PRIMARY KEY         NOT NULL,
    create_date   TIMESTAMP with time zone NOT NULL,
    customer_uuid UUID                     NOT NULL,
    start_date    DATE                     NOT NULL,
    end_date      DATE                     NOT NULL,
    stop_date     DATE                     NOT NULL
);
CREATE INDEX i_subscription_customer_uuid ON subscription_data (customer_uuid);