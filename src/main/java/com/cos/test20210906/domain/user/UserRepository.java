package com.cos.test20210906.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "insert into user (username, password, email) values (:username, :password, :email)", nativeQuery = true)
	void mSignup(String username, String password, String email);
	
	@Query(value = "select * from user where username=:username and password=:password", nativeQuery = true)
	User mLogin(String username, String password);
	
	@Query(value = "update user set password=:cpassword where username=:username and password=:password", nativeQuery = true)
	void mUpdate(String username, String password, String cpassword);
	
	@Query(value = "delete from user where username=:username and password=:password and email=:email", nativeQuery = true)
	void mDelete(String username, String password, String email);
}
