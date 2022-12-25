package com.example.hava_hava.repository.entity;

import com.example.hava_hava.repository.entity.common.CommonEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = CustomerEntity.ENTITY_NAME)
@Table(name = CustomerEntity.TABLE_NAME)
public class CustomerEntity extends CommonEntity {
    public static final String ENTITY_NAME = "CustomerEntity";
    public static final String TABLE_NAME = "customers";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_ORGNAME_NAME = "org_name";
    public static final String COLUMN_INN_NAME = "inn";
    public static final String COLUMN_KPP_NAME = "kpp";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_ORGNAME_NAME, nullable = false, length = 500)
    private String orgName;

    @Column(name = COLUMN_INN_NAME, length = 12)
    private String inn;

    @Column(name = COLUMN_KPP_NAME, length = 9)
    private String kpp;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getOrgName().equals(that.getOrgName()) && getInn().equals(that.getInn()) && Objects.equals(getKpp(), that.getKpp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getOrgName(), getInn(), getKpp());
    }
}