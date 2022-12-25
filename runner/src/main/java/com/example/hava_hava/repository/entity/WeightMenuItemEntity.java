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
@Entity(name = WeightMenuItemEntity.ENTITY_NAME)
@Table(name = WeightMenuItemEntity.TABLE_NAME, indexes = {
        @Index(name = "i_weight_menu_items_menu_uuid", columnList = "menu_items_uuid")
})
public class WeightMenuItemEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Weight_Menu_Item";
    public static final String TABLE_NAME = "weight_menu_items";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_MENUITEMSUUID_NAME = "menu_items_uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_WEIGHT_NAME = "weight";
    public static final String COLUMN_TYPE_NAME = "type";

    @Column(name = COLUMN_MENUITEMSUUID_NAME, nullable = false)
    private UUID menuItemsUuid;

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_WEIGHT_NAME, nullable = false)
    private Double weight;

    @Column(name = COLUMN_TYPE_NAME, length = 10)
    private String type;

    public UUID getMenuItemsUuid() {
        return menuItemsUuid;
    }

    public void setMenuItemsUuid(UUID menuItemsUuid) {
        this.menuItemsUuid = menuItemsUuid;
    }

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightMenuItemEntity that = (WeightMenuItemEntity) o;
        return getId().equals(that.getId()) && getMenuItemsUuid().equals(that.getMenuItemsUuid()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getWeight().equals(that.getWeight()) && Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMenuItemsUuid(), getCreateDate(), getWeight(), getType());
    }
}