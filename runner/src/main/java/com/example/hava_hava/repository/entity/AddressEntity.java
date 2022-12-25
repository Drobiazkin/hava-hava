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
@Entity(name = AddressEntity.ENTITY_NAME)
@Table(name = AddressEntity.TABLE_NAME, indexes = {
        @Index(name = "i_address_customer_uuid", columnList = "unified_uuid")
})
public class AddressEntity extends CommonEntity {
    public static final String ENTITY_NAME = "AddressEntity";
    public static final String TABLE_NAME = "address";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_UNIFIEDUUID_NAME = "unified_uuid";
    public static final String COLUMN_ADDRESSTYPE_NAME = "address_type";
    public static final String COLUMN_POINT_NAME = "point";
    public static final String COLUMN_COUNTRY_NAME = "country";
    public static final String COLUMN_CITY_NAME = "city";
    public static final String COLUMN_STREET_NAME = "street";
    public static final String COLUMN_BUILDING_NAME = "building";
    public static final String COLUMN_OFFICE_NAME = "office";
    public static final String COLUMN_FLOOR_NAME = "floor";
    public static final String COLUMN_COMMENT_NAME = "comment";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_UNIFIEDUUID_NAME, nullable = false)
    private UUID unifiedUuid;

    @Column(name = COLUMN_ADDRESSTYPE_NAME, nullable = false, length = 20)
    private String addressType;

    @Column(name = COLUMN_COUNTRY_NAME, length = 50)
    private String country;

    @Column(name = COLUMN_CITY_NAME, length = 50)
    private String city;

    @Column(name = COLUMN_STREET_NAME, length = 100)
    private String street;

    @Column(name = COLUMN_BUILDING_NAME, length = 10)
    private String building;

    @Column(name = COLUMN_OFFICE_NAME, length = 10)
    private String office;

    @Column(name = COLUMN_FLOOR_NAME)
    private Integer floor;
    @Column(name = COLUMN_COMMENT_NAME, length = 50)
    private String comment;

    @Column(name = COLUMN_POINT_NAME, columnDefinition = "point")
    private String point;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getUnifiedUuid() {
        return unifiedUuid;
    }

    public void setUnifiedUuid(UUID unifiedUuid) {
        this.unifiedUuid = unifiedUuid;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getUnifiedUuid().equals(that.getUnifiedUuid()) && Objects.equals(getAddressType(), that.getAddressType()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getStreet(), that.getStreet()) && Objects.equals(getBuilding(), that.getBuilding()) && Objects.equals(getOffice(), that.getOffice()) && Objects.equals(getFloor(), that.getFloor()) && Objects.equals(getComment(), that.getComment()) && Objects.equals(getPoint(), that.getPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getUnifiedUuid(), getAddressType(), getCountry(), getCity(), getStreet(), getBuilding(), getOffice(), getFloor(), getComment(), getPoint());
    }
}