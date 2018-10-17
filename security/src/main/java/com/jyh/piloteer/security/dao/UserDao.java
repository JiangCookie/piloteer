package com.jyh.piloteer.security.dao;


import com.jyh.piloteer.security.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author JYH
 * 2018/9/9 14:49
 */
public interface UserDao extends JpaRepository<UserEntity, Long> {
    @Query("select t from UserEntity t where t.name=?1 and t.email=?2")
    UserEntity findByNameAndEmail(String name, String email);

    @Query("select t from UserEntity t where t.name like  :name")
    Page<UserEntity> findByName(@Param("name") String name, Pageable pageRequest);

    UserEntity findByName(String name);

}
