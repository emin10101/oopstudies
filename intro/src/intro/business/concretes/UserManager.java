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
			  
			System.out.println("Ad bo� b�rak�lamaz");
		}
		
		
		
        if(!signUpCheckService.checkThisNameLengthIsOkey(user.getName())) {
			
        	if(!signUpCheckService.checkNameIsEmpity(user.getName())) {
        		
        		System.out.println("Ad en az 2 karakterli olmal�d�r.");
        		
        	}
		}
        
       
		
        if(signUpCheckService.checkLastNameIsEmpity(user.getLastName())) {
        	
        	System.out.println("Soyad bo� b�rak�lamaz");
	
        }
        
        
		
		
        if(!signUpCheckService.checkThisLastNameLengthIsOkey(user.getLastName())) {
        	
           if(!signUpCheckService.checkLastNameIsEmpity(user.getLastName())) {
        		
        		System.out.println("Ad en az 2 karakterli olmal�d�r.");
        		
        	}
	
        }
        
        
		
		
        if(signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        	
        	System.out.println("Email bo� b�rak�lamaz");
	
        }
        
        
        
        
        if(signUpCheckService.checkThisEmailUsed(user.getEmail())) {
	
           if(!signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        		
        		System.out.println("Bu email kullan�lmaktad�r.");
        	}
        	
        	
        }
        
        
        
        if(!signUpCheckService.checkThisEmailFormatIsOkey(user.getEmail())) {
        	
          if(!signUpCheckService.checkEmailIsEmpity(user.getEmail())) {
        		
        		System.out.println("Bu email ge�erli bir email de�ildir");
        	}
	      
        	
        }
        
        
        
        if(signUpCheckService.checkPasswordIsEmpity(user.getPassword())) {
        	
        	System.out.println("�ifre bo� b�rak�lamaz");
        }
        
        
        	
        if(!signUpCheckService.checkThisPasswordLengthIsOkey(user.getPassword())) {
        	
           if(!signUpCheckService.checkPasswordIsEmpity(user.getPassword())) {
        		
        		System.out.println("Ad en az 2 karakterli olmal�d�r.");
        		
        	}
        	
        }
        
        
        
        if (signUpCheckService.checkAll(user))
        {
        
        System.out.println(user.getId()+" Id'li kullan�c� Sisteme eklenmi�tir");
        userDao.addToDatabase(user);
		signUpCheckService.getEmails().add(user.getEmail());
		verificationService.sendToVerifify(user.getEmail());
			
        
		}
        else 	
		{
			
        System.out.println(user.getId()+" Id'li kullan�c� Sisteme eklenememi�tir");
			
			
		}
		
		
			
			
			
		
		
		
		
		
	}
	
	
	
	
	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		if(verificationService.userIsTheVerified(email))
		{
			System.out.println(email+" mail'li kullan�c� sisteme "
					+ "ba�ar�yla giri� yapm��t�r.");
		}
		
	}
	
	
	// Mainde Email listesini g�rebilmek i�in bunu ekledim.
	public void emailList() {
		
	for(String email:signUpCheckService.getEmails()) {
		
		System.out.println(email);
		
		
		
	}	
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
