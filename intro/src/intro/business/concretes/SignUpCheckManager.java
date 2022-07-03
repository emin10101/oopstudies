package intro.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import intro.business.abstracts.SignUpCheckService;
import intro.entities.concretes.User;

public class SignUpCheckManager implements SignUpCheckService {
	
	public List<String> userEmails = new ArrayList<>();

	@Override
	public List<String> getEmails() {
		// TODO Auto-generated method stub
		return userEmails;
	}
	
	
	
	
	
	
	//CHECK OPERASYONLARI

	
	
	
	
	public boolean checkLastNameIsEmpity(String lastName) {
		
		
	     if(lastName.length()==0) {
				
					
				return true;	
					
				}
			
			
			return false;
		}
	
	
	
	
	
	
	

	
	public boolean checkNameIsEmpity(String name) {
		
		
     if(name.length()==0) {
			
				
			return true;	
				
			}
		
		
		return false;
	}
	
	

	


	@Override
	public boolean checkEmailIsEmpity(String email) {
		// TODO Auto-generated method stub
		
		if(email.length()==0) {
			
			
			return true;	
			
			}	
		
		return false;
		
		
	}






	@Override
	public boolean checkPasswordIsEmpity(String password) {
		// TODO Auto-generated method stub
		
		
      if(password.length()==0) {
			
				
			return true;	
				
			}
      
      
		return false;
	}






	@Override
	public boolean checkThisEmailUsed(String email) {
		// TODO Auto-generated method stub
		
		
        for(String mail: userEmails) {
			
			if(mail == email) {
				
				return true;
				
				
			}	
		
        }
		
		
		return false;
	}






	@Override
	public boolean checkThisEmailFormatIsOkey(String email) {
		// TODO Auto-generated method stub
		
		//REGEXX
		
		Pattern emailRegex = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:."
				+ "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]"
				+ "(?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		
		
		if(!emailRegex.matcher(email).matches()) {
			
			return false;
			
			
		}
		
		
		
		return true;
		
	}






	@Override
	public boolean checkThisNameLengthIsOkey(String name) {
		// TODO Auto-generated method stub
		
		
		
       if(name.length()<2) {
			
			
			return false;
		}	
		
		
		
		
		return true;
	}






	@Override
	public boolean checkThisLastNameLengthIsOkey(String lastName) {
		// TODO Auto-generated method stub
		
       if(lastName.length()<2) {
			
				
			return false;
			
		}
		
		
		
		return true;
	}






	@Override
	public boolean checkThisPasswordLengthIsOkey(String password) {
		// TODO Auto-generated method stub
		
		 if(password.length()<6) {
				
					
				return false;
				
			}
		
		
		
		return true;
	}






	@Override
	public boolean checkAll(User user) {
		
		
		
		if(checkThisPasswordLengthIsOkey(user.getPassword())
		&&!checkPasswordIsEmpity(user.getPassword())
		&&checkThisEmailFormatIsOkey(user.getEmail())
		&&!checkEmailIsEmpity(user.getEmail())
		&&!checkThisEmailUsed(user.getEmail())
		&&checkThisLastNameLengthIsOkey(user.getLastName())
		&&!checkLastNameIsEmpity(user.getLastName())
		&&checkThisNameLengthIsOkey(user.getName())
		&&!checkNameIsEmpity(user.getName())
		) 
			
		{	
			
			return true;
			
		}
		
		
		
		
		
		
		
		return false;
	}	
		
	
	
	
	
	
	
	
	
	
	
	

}
