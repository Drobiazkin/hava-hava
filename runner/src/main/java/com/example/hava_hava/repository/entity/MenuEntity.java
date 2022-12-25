package com.example.hava_hava.repository.entity;

import com.example.hava_hava.repository.entity.common.CommonEntity;
import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = MenuEntity.ENTITY_NAME)
@Table(name = MenuEntity.TABLE_NAME, indexes = {
        @Index(name = "i_menu_customer_uuid", columnList = "customer_uuid")
})
public class MenuEntity extends CommonEntity {
    public static final String ENTITY_NAME = "MenuEntity";
    public static final String TABLE_NAME = "menu";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_CUSTOMERUUID_NAME = "customer_uuid";
    public static final String COLUMN_STATUS_NAME = "status";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_CUSTOMERUUID_NAME, nullable = false)
    private UUID customerUuid;

    @Column(name = COLUMN_STATUS_NAME)
    private Boolean status;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuEntity that = (MenuEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getCustomerUuid().equals(that.getCustomerUuid()) && getStatus().equals(that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getCustomerUuid(), getStatus());
    }

}