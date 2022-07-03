package intro.business.concretes;






import intro.business.abstracts.SignUpCheckService;
import intro.business.abstracts.UserService;
import intro.business.abstracts.VerificationService;
import intro.dataAccess.abstracts.UserDao;
import intro.entities.concretes.User;

public class UserManager implements UserService {
	
	
	
	public UserDao userDao;
	public SignUpCheckService signUpCheckService;
	public VerificationService verificationService;
	
	
	
	public UserManager(UserDao userDao, SignUpCheckService signUpCheckService, 
			VerificationService verificationService) {
		
		this.userDao = userDao;
		this.signUpCheckService = signUpCheckService;
		this.verificationService = verificationService;
		
	}
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		
		if(signUpCheckService.checkNameIsEmpity(user.getName())) {
			  
			System.out.println("Ad boþ býrakýlamaz");
		}
		
		
		
        if(!signUpCheckService.checkThisNameLengthIsOkey(user.getName())) {
			
        	if(!signUpCheckService.checkNameIsEmpity(user.getName())) {
        		
        		System.out.println("Ad en az 2 karakterli olmalýdýr.");
        		
        	}
		}
        
       
		
        if(signUpCheckService.checkLastNameIsEmpity(user.getLastName())) {
        	
        	System.out.println("Soyad boþ býrakýlamaz");
	
        }
        
        
		
		
        if(!signUpCheckService.checkThisLastNameLengthIsOkey(user.getLastName())) {
        	
           if(!signUpCheckService.checkLastNameIsEmpity(user.getLastName())) {
        		
        		System.out.println("Ad en az 2 karakterli olmalýdýr.");
        		
        	}
	
        }
        
        
		
		
        if(signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        	
        	System.out.println("Email boþ býrakýlamaz");
	
        }
        
        
        
        
        if(signUpCheckService.checkThisEmailUsed(user.getEmail())) {
	
           if(!signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        		
        		System.out.println("Bu email kullanýlmaktadýr.");
        	}
        	
        	
        }
        
        
        
        if(!signUpCheckService.checkThisEmailFormatIsOkey(user.getEmail())) {
        	
          if(!signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        		
        		System.out.println("Bu email geçerli bir email deðildir");
        	}
	      
        	
        }
        
        
        
        if(signUpCheckService.checkPasswordIsEmpity(user.getPassword())) {
        	
        	System.out.println("Þifre boþ býrakýlamaz");
        }
        
        
        	
        if(!signUpCheckService.checkThisPasswordLengthIsOkey(user.getPassword())) {
        	
           if(!signUpCheckService.checkPasswordIsEmpity(user.getPassword())) {
        		
        		System.out.println("Ad en az 2 karakterli olmalýdýr.");
        		
        	}
        	
        }
        
        
        
        if (signUpCheckService.checkAll(user))
        {
        
        System.out.println(user.getId()+" Id'li kullanýcý Sisteme eklenmiþtir");
        userDao.addToDatabase(user);
		signUpCheckService.getEmails().add(user.getEmail());
		verificationService.sendToVerifify(user.getEmail());
			
        
		}
        else 	
		{
			
        System.out.println(user.getId()+" Id'li kullanýcý Sisteme eklenememiþtir");
			
			
		}
		
		
			
			
			
		
		
		
		
		
	}
	
	
	
	
	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		if(verificationService.userIsTheVerified(email))
		{
			System.out.println(email+" mail'li kullanýcý sisteme "
					+ "baþarýyla giriþ yapmýþtýr.");
		}
		
	}
	
	
	// Mainde Email listesini görebilmek için bunu ekledim.
	public void emailList() {
		
	for(String email:signUpCheckService.getEmails()) {
		
		System.out.println(email);
		
		
		
	}	
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
