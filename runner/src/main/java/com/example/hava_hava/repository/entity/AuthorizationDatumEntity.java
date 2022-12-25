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
@Entity(name = AuthorizationDatumEntity.ENTITY_NAME)
@Table(name = AuthorizationDatumEntity.TABLE_NAME, indexes = {
        @Index(name = "i_auth_data_user_uuid", columnList = "user_uuid", unique = true)
})
public class AuthorizationDatumEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Authorization_Datum";
    public static final String TABLE_NAME = "authorization_data";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_USERUUID_NAME = "user_uuid";
    public static final String COLUMN_PASSWORD_NAME = "password";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_USERUUID_NAME, nullable = false)
    private UUID userUuid;

    @Column(name = COLUMN_PASSWORD_NAME, nullable = false, length = 100)
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorizationDatumEntity that = (AuthorizationDatumEntity) o;
        return getId().equals(that.getId()) && Objects.equals(createDate, that.createDate) && userUuid.equals(that.userUuid) && password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), createDate, userUuid, password);
    }
}