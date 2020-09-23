package com.anupama.assets.models;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class AbstractTimestampEntity {
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date CreatedDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIME)
    protected Date modifieDate;


}
