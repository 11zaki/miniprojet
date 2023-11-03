package com.demo.crudadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crudadmin.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    
}