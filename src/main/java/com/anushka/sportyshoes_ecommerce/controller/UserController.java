package com.anushka.sportyshoes_ecommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anushka.sportyshoes_ecommerce.entity.Status;
import com.anushka.sportyshoes_ecommerce.entity.User;
import com.anushka.sportyshoes_ecommerce.exceptions.InvalidUserException;
import com.anushka.sportyshoes_ecommerce.exceptions.UserNotFoundException;
import com.anushka.sportyshoes_ecommerce.repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository uRepo;
    
    @RestController
    public class LoginController {
            @Autowired
    		UserRepository userRepository;

    		@PostMapping("/users/login/{id}")
    		public Status loginUser(@Valid @RequestBody User user) {
    			List<User> users = userRepository.findAll();
    			for (User other : users) {
    				if (other.equals(user)) {
    					user.setLoggedIn(true);
    					userRepository.save(user);
    					return Status.SUCCESS;
    				}
    			}
    			return Status.FAILURE;
    		}
    		
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
    
	// list all users
	@GetMapping("/users")
	public List<User> getProducts() {
		List<User> list = uRepo.findAll();
		if (!list.isEmpty()) {
			return list;
		}
		throw new UserNotFoundException("User list is empty !");
	}

	// get on User
	@GetMapping("/users/{id}")
	public User getProducts(@PathVariable("id") long id) {
		User fetchedProduct = uRepo.findById(id).orElseThrow(() -> {
			throw new UserNotFoundException("Product does not exist with id " + id);
		});
		return fetchedProduct;
	}

	// create User
	@PostMapping("/users")
	public User addUser(@RequestBody(required=false) User userObj) {
		if(userObj !=null) {
			return uRepo.save(userObj);
		}
		throw new InvalidUserException("User creation failed ! missing project object !");
	}

	// update User
	@PutMapping("/users")
	public User updateUser(@RequestBody User userObj) {
		// step 1: find product
		User fetchedUser = uRepo.findById(userObj.getId()).orElseThrow(() -> {
			throw new UserNotFoundException("User does not exist with id " + userObj.getId());
		});
		// step 2: Map updating fields
		fetchedUser.setUsername(userObj.getUsername());
		fetchedUser.setPassword(userObj.getPassword());
		fetchedUser.setRoles(userObj.getRoles());
	//	fetchedUser.setLoggedIn(userObj.isLoggedIn());
		
		// step 3: update
		return uRepo.save(fetchedUser);

	}

	// delete on User
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		// step 1: find product
		User fetchedUser = uRepo.findById(id).orElseThrow(() -> {
			throw new UserNotFoundException("User does not exist with id " + id);
		});
		// step 2: delete
		uRepo.delete(fetchedUser);
	} 
	}
}