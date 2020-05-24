package com.manytomanydemo1.manytomanyprogram.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String publisherName;

    @ManyToMany(mappedBy = "publisherSet")
    private Set<Book> bookSet;
}
