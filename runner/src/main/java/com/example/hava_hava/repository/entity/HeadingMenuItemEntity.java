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
@Entity(name = HeadingMenuItemEntity.ENTITY_NAME)
@Table(name = HeadingMenuItemEntity.TABLE_NAME, indexes = {
        @Index(name = "i_heading_menu_items_menu_items_uuid", columnList = "menu_items_uuid"),
        @Index(name = "i_heading_menu_heading_search", columnList = "search")
})
public class HeadingMenuItemEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Heading_Menu_Item";
    public static final String TABLE_NAME = "heading_menu_items";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_MENUITEMSUUID_NAME = "menu_items_uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_SEARCH_NAME = "search";
    public static final String COLUMN_HEADING_NAME = "heading";
    public static final String COLUMN_LANGUAGE_NAME = "language";

    @Column(name = COLUMN_MENUITEMSUUID_NAME, nullable = false)
    private UUID menuItemsUuid;

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_HEADING_NAME, nullable = false, length = 50)
    private String heading;
    @Column(name = COLUMN_LANGUAGE_NAME, nullable = false, length = 10)
    private String language;

    @Column(name = COLUMN_SEARCH_NAME, columnDefinition = "tsvector not null")
    private String search;

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

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadingMenuItemEntity that = (HeadingMenuItemEntity) o;
        return getId().equals(that.getId()) && getMenuItemsUuid().equals(that.getMenuItemsUuid()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getHeading().equals(that.getHeading()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getSearch(), that.getSearch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMenuItemsUuid(), getCreateDate(), getHeading(), getLanguage(), getSearch());
    }
}