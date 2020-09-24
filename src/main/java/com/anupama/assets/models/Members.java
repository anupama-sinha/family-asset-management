package com.anupama.assets.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
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
   @Column(name="member_id")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @SequenceGenerator(name="PRODUCT_SEQ", initialValue = 1, allocationSize = 25)
   private Long id;

   @Column(name="firstName")
   private String firstName;

   @Column(name="lastName")
   private String lastName;

   @Column(name="emailId")
   private String emailId;

   @Column(name="phoneNumber")
   private int phoneNumber;

   @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
   //Below is done by default by JPA
   @JoinColumn(name = "member_id")
   private List<Product> products;
}