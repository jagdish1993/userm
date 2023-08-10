package com.userm.pa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userm.pa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(name = "Select u.* from users u INNER JOIN users_roles ur ON ur.user_id=u.id where ur.role_id is not null",nativeQuery = true)
	List<User> getAllUsersHasRole();

	@Query(name = "Select u.* from users u INNER JOIN users_roles ur ON ur.user_id=u.id where ur.role_id is null",nativeQuery = true)
	List<User> getAllUsersHasnoRole();

}
