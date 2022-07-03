package intro.dataAccess.abstracts;

import java.util.List;

import intro.entities.concretes.User;

public interface UserDao {
	
    void addToDatabase(User user);
    List<String> getAllEmails();
	
	
	
	
	

}
