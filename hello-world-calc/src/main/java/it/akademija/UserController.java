package it.akademija;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api/users")
public class UserController {

	private final UserDao userDao;
	
	@Autowired
	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		System.out.println("get = " + userDao.getUsers().size());
		return userDao.getUsers();
		
	
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody final CreateUserCommand cmd) {
		userDao.createUser(new User(cmd.getUsername(),
							cmd.getEmail(),
							cmd.getFirstName()));
		System.out.println(cmd);
		System.out.println(cmd.getFirstName());
	}
	
}
