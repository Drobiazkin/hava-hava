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
@Entity(name = RoleEntity.ENTITY_NAME)
@Table(name = RoleEntity.TABLE_NAME, indexes = {
        @Index(name = "i_uniq_role", columnList = "role", unique = true)
})
public class RoleEntity extends CommonEntity {
    public static final String ENTITY_NAME = "RoleEntity";
    public static final String TABLE_NAME = "role";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_ROLE_NAME = "role";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_ROLE_NAME, length = 50)
    private String role;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getRole().equals(that.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getRole());
    }
}