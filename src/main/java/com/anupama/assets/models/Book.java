package com.anupama.assets.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.anupama.assets.configurations.TimestampAuditConfig;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonFormat
@NotNull
@Valid
@Getter
@Setter
@Entity
@Table(name="book")
public class Book extends TimestampAuditConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="book_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @SequenceGenerator(name="BOOK_SEQ", initialValue = 1, allocationSize = 25)
    private Long id;

    @Column(name="book_name")
    @Valid
    @Size(min = 5, max = 60)
    @NotEmpty
    @NotNull
    String name;

    @ManyToMany
    @JoinTable(
            name = "book",
            joinColumns = @JoinColumn(name = "book_id"/*, referencedColumnName = "member_id"*/),
            inverseJoinColumns = @JoinColumn(name = "member_id"/*, referencedColumnName = "book_id"*/)
    )
    private List<Members> members;
}