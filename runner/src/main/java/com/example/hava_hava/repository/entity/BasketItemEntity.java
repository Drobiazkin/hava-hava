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
@Entity(name = BasketItemEntity.ENTITY_NAME)
@Table(name = BasketItemEntity.TABLE_NAME, indexes = {
        @Index(name = "i_basket_items_basket_uuid", columnList = "basket_uuid"),
        @Index(name = "i_basket_items_items_uuid_basket_uuid", columnList = "basket_uuid, menu_items_uuid, status"),
        @Index(name = "i_basket_items_items_uuid", columnList = "menu_items_uuid")
})
public class BasketItemEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Basket_Item";
    public static final String TABLE_NAME = "basket_items";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_BASKETUUID_NAME = "basket_uuid";
    public static final String COLUMN_MENUUUID_NAME = "menu_uuid";
    public static final String COLUMN_MENUITEMSUUID_NAME = "menu_items_uuid";
    public static final String COLUMN_COUNT_NAME = "count";
    public static final String COLUMN_STATUS_NAME = "status";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_BASKETUUID_NAME, nullable = false)
    private UUID basketUuid;

    @Column(name = COLUMN_MENUUUID_NAME, nullable = false)
    private UUID menuUuid;

    @Column(name = COLUMN_MENUITEMSUUID_NAME, nullable = false)
    private UUID menuItemsUuid;

    @Column(name = COLUMN_COUNT_NAME, nullable = false)
    private Integer count;

    @Column(name = COLUMN_STATUS_NAME, nullable = false, length = 10)
    private String status;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getBasketUuid() {
        return basketUuid;
    }

    public void setBasketUuid(UUID basketUuid) {
        this.basketUuid = basketUuid;
    }

    public UUID getMenuUuid() {
        return menuUuid;
    }

    public void setMenuUuid(UUID menuUuid) {
        this.menuUuid = menuUuid;
    }

    public UUID getMenuItemsUuid() {
        return menuItemsUuid;
    }

    public void setMenuItemsUuid(UUID menuItemsUuid) {
        this.menuItemsUuid = menuItemsUuid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        BasketItemEntity that = (BasketItemEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getBasketUuid().equals(that.getBasketUuid()) && getMenuUuid().equals(that.getMenuUuid()) && getMenuItemsUuid().equals(that.getMenuItemsUuid()) && getCount().equals(that.getCount()) && getStatus().equals(that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getBasketUuid(), getMenuUuid(), getMenuItemsUuid(), getCount(), getStatus());
    }
}