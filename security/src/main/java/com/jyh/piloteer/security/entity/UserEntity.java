package com.jyh.piloteer.security.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author JYH
 * 2018/9/9 14:49
 */
@Entity
@Data
@Table(name = "user")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String password;

//    @ManyToOne
//    @JoinColumn(name = "did") //定义外键关联的字段名称
//    @JsonBackReference
//    private DeparmentEntity deparmentEntity;
//
//    @ManyToMany(cascade = {},fetch =FetchType.EAGER)
//    @JoinTable(name = "user_role",
//            joinColumns = {@JoinColumn(name = "user_id")},
//            inverseJoinColumns = {@JoinColumn(name="roles_id")})
//    private List<RoleEntity> roles;

    /**
     * 权限
     */
    private String roles;

    public UserEntity() {

    }


}
