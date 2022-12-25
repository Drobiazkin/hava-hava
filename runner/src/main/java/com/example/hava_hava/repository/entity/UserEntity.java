package com.example.hava_hava.repository.entity;

import com.example.hava_hava.repository.entity.common.CommonEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = UserEntity.ENTITY_NAME)
@Table(name = UserEntity.TABLE_NAME, indexes = {
        @Index(name = "i_user_nick_name", columnList = "nickname", unique = true)
})
public class UserEntity extends CommonEntity {
    public static final String ENTITY_NAME = "UserEntity";
    public static final String TABLE_NAME = "\"user\"";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NICKNAME_NAME = "nickname";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_NAME_NAME, nullable = false, length = 50)
    private String name;

    @Column(name = COLUMN_NICKNAME_NAME, nullable = false, length = 30)
    private String nickname;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity userEntity = (UserEntity) o;
        return getId().equals(userEntity.getId()) && Objects.equals(getCreateDate(), userEntity.getCreateDate()) && getName().equals(userEntity.getName()) && getNickname().equals(userEntity.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getName(), getNickname());
    }
}