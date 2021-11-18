package com.kciamaga.customersservice;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Entitiy {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;


    public String name;


}
