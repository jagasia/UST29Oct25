package com.ust.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String> {

}
