package EC2JhonatanChancafeBodega.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if ("frank".equals(username)) {
			return new User("frank", "123", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("El usuario no existe " + username);
		}
	}

}
