package com.userm.pa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userm.pa.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
