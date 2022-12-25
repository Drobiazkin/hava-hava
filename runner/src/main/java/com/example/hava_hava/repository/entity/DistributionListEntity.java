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
@Entity(name = DistributionListEntity.ENTITY_NAME)
@Table(name = DistributionListEntity.TABLE_NAME, indexes = {
        @Index(name = "i_dist_list_restaurant_uuid", columnList = "restaurant_uuid")
})
public class DistributionListEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Distribution_List";
    public static final String TABLE_NAME = "distribution_list";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_RESTAURANTUUID_NAME = "restaurant_uuid";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_TELEGRAMCHATID_NAME = "telegram_chat_id";
    public static final String COLUMN_WHATSAPPCHATID_NAME = "whatsapp_chat_id";
    public static final String COLUMN_USERCHATUUID_NAME = "user_chat_uuid";
    public static final String COLUMN_POST_NAME = "post";
    public static final String COLUMN_DELIVERY_NAME = "delivery";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_RESTAURANTUUID_NAME, nullable = false)
    private UUID restaurantUuid;

    @Column(name = COLUMN_NAME_NAME, nullable = false, length = 50)
    private String name;

    @Column(name = COLUMN_TELEGRAMCHATID_NAME, length = 100)
    private String telegramChatId;

    @Column(name = COLUMN_WHATSAPPCHATID_NAME, length = 100)
    private String whatsappChatId;

    @Column(name = COLUMN_USERCHATUUID_NAME)
    private UUID userChatUuid;

    @Column(name = COLUMN_POST_NAME, length = 50)
    private String post;

    @Column(name = COLUMN_DELIVERY_NAME)
    private Boolean delivery;

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public UUID getRestaurantUuid() {
        return restaurantUuid;
    }

    public void setRestaurantUuid(UUID restaurantUuid) {
        this.restaurantUuid = restaurantUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelegramChatId() {
        return telegramChatId;
    }

    public void setTelegramChatId(String telegramChatId) {
        this.telegramChatId = telegramChatId;
    }

    public String getWhatsappChatId() {
        return whatsappChatId;
    }

    public void setWhatsappChatId(String whatsappChatId) {
        this.whatsappChatId = whatsappChatId;
    }

    public UUID getUserChatUuid() {
        return userChatUuid;
    }

    public void setUserChatUuid(UUID userChatUuid) {
        this.userChatUuid = userChatUuid;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistributionListEntity that = (DistributionListEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getRestaurantUuid().equals(that.getRestaurantUuid()) && Objects.equals(getName(), that.getName()) && Objects.equals(getTelegramChatId(), that.getTelegramChatId()) && Objects.equals(getWhatsappChatId(), that.getWhatsappChatId()) && getUserChatUuid().equals(that.getUserChatUuid()) && Objects.equals(getPost(), that.getPost()) && getDelivery().equals(that.getDelivery());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getRestaurantUuid(), getName(), getTelegramChatId(), getWhatsappChatId(), getUserChatUuid(), getPost(), getDelivery());
    }
}