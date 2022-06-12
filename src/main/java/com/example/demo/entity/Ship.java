package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "ship_table")
@Entity
@Data
public class Ship {

    @SequenceGenerator(name = "ship_seq",sequenceName = "ship_seq",allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "ship_seq")
    @Id
    private Long id;

    @Column(name = "ship_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
