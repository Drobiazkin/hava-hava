package com.example.hava_hava.repository.entity;

import com.example.hava_hava.repository.entity.common.CommonEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = MenuItemEntity.ENTITY_NAME)
@Table(name = MenuItemEntity.TABLE_NAME, indexes = {
        @Index(name = "i_menu_items_menu_uuid", columnList = "menu_uuid")
})
public class MenuItemEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Menu_Item";
    public static final String TABLE_NAME = "menu_items";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_MENUUUID_NAME = "menu_uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_PRICE_NAME = "price";
    public static final String COLUMN_PRICETYPE_NAME = "price_type";
    public static final String COLUMN_STOP_NAME = "stop";

    @Column(name = COLUMN_MENUUUID_NAME, nullable = false)
    private UUID menuUuid;

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_PRICE_NAME)
    private BigDecimal price;

    @Column(name = COLUMN_PRICETYPE_NAME, length = 10)
    private String priceType;

    @Column(name = COLUMN_STOP_NAME)
    private Boolean stop;

    public UUID getMenuUuid() {
        return menuUuid;
    }

    public void setMenuUuid(UUID menuUuid) {
        this.menuUuid = menuUuid;
    }

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItemEntity that = (MenuItemEntity) o;
        return getId().equals(that.getId()) && getMenuUuid().equals(that.getMenuUuid()) && Objects.equals(getCreateDate(), that.getCreateDate()) && Objects.equals(getPrice(), that.getPrice()) && Objects.equals(getPriceType(), that.getPriceType()) && getStop().equals(that.getStop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMenuUuid(), getCreateDate(), getPrice(), getPriceType(), getStop());
    }
}