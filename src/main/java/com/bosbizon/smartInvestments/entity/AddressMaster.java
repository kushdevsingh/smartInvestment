package com.bosbizon.smartInvestments.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "address_master")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class AddressMaster extends AuditModel{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String street1;
    @Column
    private String street2;
    @Column
    private String street3;
    @Column
    private String unit;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String pin;
    @Column
    private String country;
    @Column
    private boolean isActive;
    @Column
    private boolean isVerified;

}
