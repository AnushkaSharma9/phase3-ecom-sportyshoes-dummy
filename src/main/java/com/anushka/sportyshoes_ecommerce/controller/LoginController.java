//package com.anushka.sportyshoes_ecommerce.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.anushka.sportyshoes_ecommerce.entity.Status;
//import com.anushka.sportyshoes_ecommerce.entity.User;
//import com.anushka.sportyshoes_ecommerce.repository.UserRepository;
//
//@RestController
//public class LoginController {
//        @Autowired
//		UserRepository userRepository;
//
//		@PostMapping("/users/login/{id}")
//		public Status loginUser(@Valid @RequestBody User user) {
//			List<User> users = userRepository.findAll();
//			for (User other : users) {
//				if (other.equals(user)) {
//					user.setLoggedIn(true);
//					userRepository.save(user);
//					return Status.SUCCESS;
//				}
//			}
//			return Status.FAILURE;
//		}
//		@PostMapping("/users/logout")
//		public Status logUserOut(@Valid @RequestBody User user) {
//			List<User> users = userRepository.findAll();
//			for (User other : users) {
//				if (other.equals(user)) {
//					user.setLoggedIn(false);
//					userRepository.save(user);
//					return Status.SUCCESS;
//				}
//			}
//			return Status.FAILURE;
//		}
//		
//}
//
