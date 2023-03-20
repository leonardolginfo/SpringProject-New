package br.com.lginfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lginfo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 
	
}
