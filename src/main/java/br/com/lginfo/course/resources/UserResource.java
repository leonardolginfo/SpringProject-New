package br.com.lginfo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lginfo.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@lginfo.com.br", "85987620747", "12345");
		return ResponseEntity.ok().body(u);
	}
}
