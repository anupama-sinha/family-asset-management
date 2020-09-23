package com.anupama.assets.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.anupama.assets.configurations.TimestampAuditConfig;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@JsonFormat
@NotNull
@Valid
@Getter
@Setter
@Entity
@Table(name = "members")
public class Members  extends TimestampAuditConfig implements Serializable  {
    
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name="product_id")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @SequenceGenerator(name="PRODUCT_SEQ", initialValue = 1, allocationSize = 25)
   private Long id;
    
   private String firstName;
   private String lastName;
   private String emailId;
   private int phoneNumber;
}