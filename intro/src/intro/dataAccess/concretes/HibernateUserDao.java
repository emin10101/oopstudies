package intro.dataAccess.concretes;



import java.util.List;


import intro.dataAccess.abstracts.UserDao;
import intro.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	
	
	

	@Override
	public void addToDatabase(User user) {
		// TODO Auto-generated method stub
		
		System.out.println(user.getId()+" Id'li kullan�c� veritaban�na Hibernate ile eklenmi�tir");
		
		
	   
		
		
	}

	@Override
	public List<String> getAllEmails() {
		// TODO Auto-generated method stub
		return null;
	}

}
