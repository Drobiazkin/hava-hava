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
@Entity(name = BasketEntity.ENTITY_NAME)
@Table(name = BasketEntity.TABLE_NAME, indexes = {
        @Index(name = "i_basket_user_uuid_customer_uuid_restaurant_uuid", columnList = "paying_user_uuid, restaurant_uuid, status")
})
public class BasketEntity extends CommonEntity {
    public static final String ENTITY_NAME = "BasketEntity";
    public static final String TABLE_NAME = "basket";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_PAYINGUSERUUID_NAME = "paying_user_uuid";
    public static final String COLUMN_RESTAURANTUUID_NAME = "restaurant_uuid";
    public static final String COLUMN_STATUS_NAME = "status";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_PAYINGUSERUUID_NAME, nullable = false)
    private UUID payingUserUuid;

    @Column(name = COLUMN_RESTAURANTUUID_NAME, nullable = false)
    private UUID restaurantUuid;

    @Column(name = COLUMN_STATUS_NAME, nullable = false, length = 10)
    private String status;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getPayingUserUuid() {
        return payingUserUuid;
    }

    public void setPayingUserUuid(UUID payingUserUuid) {
        this.payingUserUuid = payingUserUuid;
    }

    public UUID getRestaurantUuid() {
        return restaurantUuid;
    }

    public void setRestaurantUuid(UUID restaurantUuid) {
        this.restaurantUuid = restaurantUuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketEntity that = (BasketEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getPayingUserUuid().equals(that.getPayingUserUuid()) && getRestaurantUuid().equals(that.getRestaurantUuid()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getPayingUserUuid(), getRestaurantUuid(), getStatus());
    }
}