package com.jyh.piloteer.security.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author JYH
 * 2018/9/9 15:01
 */
@Entity
@Table(name = "deparment")
public class DeparmentEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public DeparmentEntity() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
