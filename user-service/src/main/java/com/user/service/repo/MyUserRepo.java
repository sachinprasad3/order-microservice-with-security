package com.user.service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.entity.MyUser;

@Repository
public interface MyUserRepo extends JpaRepository<MyUser, Long>{

	public Optional<MyUser> findByUsername(String username);
}
