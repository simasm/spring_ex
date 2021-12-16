package it.akademija;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserDao implements UserDao {

	private final List<User> users = new CopyOnWriteArrayList<>();
	
	@Override
	public List<User> getUsers() {
		return Collections.unmodifiableList(users);
	}

	
	@Override
	public void createUser(User user) {
		users.add(user);
		
	}

	@Override
	public void deleteUser(String username) {
		
		users.remove(users.stream()
				.filter(user -> user.getUsername()
									.equals(username))
				.findFirst().orElse(null));
		
	}

}
