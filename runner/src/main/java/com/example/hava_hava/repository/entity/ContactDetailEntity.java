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
@Entity(name = ContactDetailEntity.ENTITY_NAME)
@Table(name = ContactDetailEntity.TABLE_NAME, indexes = {
        @Index(name = "i_contact_details_unified_uuid_customer_boolean", columnList = "unified_uuid, contact_customer")
})
public class ContactDetailEntity extends CommonEntity {
    public static final String ENTITY_NAME = "Contact_Detail";
    public static final String TABLE_NAME = "contact_details";
    public static final String COLUMN_ID_NAME = "uuid";
    public static final String COLUMN_CREATEDATE_NAME = "create_date";
    public static final String COLUMN_UNIFIEDUUID_NAME = "unified_uuid";
    public static final String COLUMN_EMAIL_NAME = "email";
    public static final String COLUMN_PHONE_NAME = "phone";
    public static final String COLUMN_TELEGRAM_NAME = "telegram";
    public static final String COLUMN_CONTACTCUSTOMER_NAME = "contact_customer";

    @Column(name = COLUMN_CREATEDATE_NAME, nullable = false)
    private OffsetDateTime createDate;

    @Column(name = COLUMN_UNIFIEDUUID_NAME, nullable = false)
    private UUID unifiedUuid;

    @Column(name = COLUMN_EMAIL_NAME, length = 320)
    private String email;

    @Column(name = COLUMN_PHONE_NAME, length = 20)
    private String phone;

    @Column(name = COLUMN_TELEGRAM_NAME, length = 50)
    private String telegram;

    @Column(name = COLUMN_CONTACTCUSTOMER_NAME)
    private Boolean contactCustomer;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public Boolean getContactCustomer() {
        return contactCustomer;
    }

    public void setContactCustomer(Boolean contactCustomer) {
        this.contactCustomer = contactCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDetailEntity that = (ContactDetailEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getCreateDate(), that.getCreateDate()) && getUnifiedUuid().equals(that.getUnifiedUuid()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPhone(), that.getPhone()) && Objects.equals(getTelegram(), that.getTelegram()) && getContactCustomer().equals(that.getContactCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateDate(), getUnifiedUuid(), getEmail(), getPhone(), getTelegram(), getContactCustomer());
    }
}