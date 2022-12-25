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
@Entity(name = RestaurantEntity.ENTITY_NAME)
@Table(name = RestaurantEntity.TABLE_NAME, indexes = {
        @Index(name = "i_customers_nickname", columnList = "nickname", unique = true)
})
public class RestaurantEntity extends CommonEntity {
    public static final String ENTITY_NAME = "RestaurantEntity";
    public static final String TABLE_NAME = "restaurant";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_CUSTOMERUUID_NAME = "customer_uuid";
    public static final String COLUMN_INFO_NAME = "info";
    public static final String COLUMN_NICKNAME_NAME = "nickname";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_CUSTOMERUUID_NAME, nullable = false)
    private UUID customerUuid;

    @Column(name = COLUMN_INFO_NAME, length = 100)
    private String info;

    @Column(name = COLUMN_NICKNAME_NAME, nullable = false, length = 30)
    private String nickname;

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantEntity that = (RestaurantEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getCustomerUuid().equals(that.getCustomerUuid()) && Objects.equals(getInfo(), that.getInfo()) && getNickname().equals(that.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getCustomerUuid(), getInfo(), getNickname());
    }
}