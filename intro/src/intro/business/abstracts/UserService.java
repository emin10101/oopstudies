package intro.business.abstracts;

import intro.entities.concretes.User;

public interface UserService {

	 void add(User user);
	 void login(String email, String password);
	 void emailList();
	
}
