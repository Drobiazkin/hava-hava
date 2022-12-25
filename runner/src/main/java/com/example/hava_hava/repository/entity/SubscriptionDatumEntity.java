package com.example.hava_hava.repository.entity;

import com.example.hava_hava.repository.entity.common.CommonEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = SubscriptionDatumEntity.ENTITY_NAME)
@Table(name = SubscriptionDatumEntity.TABLE_NAME, indexes = {
        @Index(name = "i_subscription_customer_uuid", columnList = "customer_uuid")
})
public class SubscriptionDatumEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Subscription_Datum";
    public static final String TABLE_NAME = "subscription_data";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_CUSTOMERUUID_NAME = "customer_uuid";
    public static final String COLUMN_STARTDATE_NAME = "start_date";
    public static final String COLUMN_ENDDATE_NAME = "end_date";

    public static final String COLUMN_STOPDATE_NAME = "stop_date";


    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_CUSTOMERUUID_NAME, nullable = false)
    private UUID customerUuid;

    @Column(name = COLUMN_STARTDATE_NAME, nullable = false)
    private LocalDate startDate;

    @Column(name = COLUMN_ENDDATE_NAME, nullable = false)
    private LocalDate endDate;

    @Column(name = COLUMN_STOPDATE_NAME, nullable = false)
    private LocalDate stopDate;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDate stopDate) {
        this.stopDate = stopDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionDatumEntity that = (SubscriptionDatumEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getCustomerUuid().equals(that.getCustomerUuid()) && getStartDate().equals(that.getStartDate()) && Objects.equals(getEndDate(), that.getEndDate()) && Objects.equals(getStopDate(), that.getStopDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getCustomerUuid(), getStartDate(), getEndDate(), getStopDate());
    }
}