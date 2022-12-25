package com.example.hava_hava.repository.entity.common;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public abstract class CommonEntity implements Serializable {
    public static final String COLUMN_ID_NAME = "uuid";

    @Id
    @Column(name = COLUMN_ID_NAME, nullable = false)
    @GenericGenerator(name = COLUMN_ID_NAME, strategy = "uuid2")
    protected UUID id;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHashKey() {
        return getId().toString();
    }
}
