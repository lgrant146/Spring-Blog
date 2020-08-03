package com.codeup.springblog.models;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dogs", uniqueConstraints=
@UniqueConstraint(columnNames={"age", "reside_state"}))
public class Dog {

//    CREATE TABLE `dogs` (
//            `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//    `age` tinyint(3) unsigned NOT NULL,
//    `name` varchar(200) NOT NULL,
//    `reside_state` char(2) DEFAULT 'XX',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY `UK_?????????????????` (`age`)
//            ) ENGINE=<WHATEVER_VALUE_HERE> DEFAULT CHARSET=utf8

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "int(11) UNSIGNED")
    private long id;

    @Column(columnDefinition = "tinyint(3) unsigned NOT NULL")
    private long age;
    @Column(columnDefinition = "varchar(200) NOT NULL")
    private String name;
    @Column(length = 2, columnDefinition = "varchar(2) default 'XX'")
    private String reside_state;
}


