package intro;

import intro.business.abstracts.UserService;
import intro.business.concretes.MailVerificationService;
import intro.business.concretes.SignUpCheckManager;
import intro.business.concretes.UserManager;
import intro.dataAccess.concretes.HibernateUserDao;
import intro.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user  = new User(1,"emicom","çfþdügð","emin","dsyay");
		User user1 = new User(2,"en.a@a.b","çfþdügð","ea","jfsgo");
		User user2 = new User(3,"emin.ba.j","çfþdügð","ema","doýja");
		
		UserService userService = new UserManager(new HibernateUserDao(),
				new SignUpCheckManager(),new MailVerificationService());
		
	
	
        userService.add(user);	
        userService.add(user1);
        userService.add(user2);
        
        System.out.println("");
        System.out.println("*****************");
        System.out.println("");
        
        
        
        userService.emailList();
	   
	
		
	
		
		
			
		
	}	
		
		
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
