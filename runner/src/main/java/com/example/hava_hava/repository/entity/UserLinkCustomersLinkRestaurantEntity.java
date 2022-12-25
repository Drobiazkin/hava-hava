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
@Entity(name = UserLinkCustomersLinkRestaurantEntity.ENTITY_NAME)
@Table(name = UserLinkCustomersLinkRestaurantEntity.TABLE_NAME, indexes = {
        @Index(name = "i_user_uuid_link_user_uuid_customer_uuid_restaurant_uuid", columnList = "user_uuid, customer_uuid, restaurant_uuid, user_role"),
        @Index(name = "i_user_uuid_link_user_uuid_restaurant_uuid", columnList = "user_uuid, restaurant_uuid")
})
public class UserLinkCustomersLinkRestaurantEntity extends CommonEntity {
    public static final String ENTITY_NAME = "User_Link_Customers_Link_Restaurant";
    public static final String TABLE_NAME = "user_link_customers_link_restaurant";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_USERUUID_NAME = "user_uuid";
    public static final String COLUMN_CUSTOMERUUID_NAME = "customer_uuid";
    public static final String COLUMN_RESTAURANTUUID_NAME = "restaurant_uuid";
    public static final String COLUMN_USERROLE_NAME = "user_role";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_USERUUID_NAME, nullable = false)
    private UUID userUuid;

    @Column(name = COLUMN_CUSTOMERUUID_NAME, nullable = false)
    private UUID customerUuid;

    @Column(name = COLUMN_RESTAURANTUUID_NAME, nullable = false)
    private UUID restaurantUuid;

    @Column(name = COLUMN_USERROLE_NAME, nullable = false)
    private UUID userRole;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(UUID userUuid) {
        this.userUuid = userUuid;
    }

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public UUID getRestaurantUuid() {
        return restaurantUuid;
    }

    public void setRestaurantUuid(UUID restaurantUuid) {
        this.restaurantUuid = restaurantUuid;
    }

    public UUID getUserRole() {
        return userRole;
    }

    public void setUserRole(UUID userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLinkCustomersLinkRestaurantEntity that = (UserLinkCustomersLinkRestaurantEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getUserUuid().equals(that.getUserUuid()) && getCustomerUuid().equals(that.getCustomerUuid()) && getRestaurantUuid().equals(that.getRestaurantUuid()) && getUserRole().equals(that.getUserRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getUserUuid(), getCustomerUuid(), getRestaurantUuid(), getUserRole());
    }
}