package intro.business.abstracts;

import java.util.List;

import intro.entities.concretes.User;

public interface SignUpCheckService {
	
	List<String> getEmails();
	
	
	boolean checkLastNameIsEmpity(String lastName);
	boolean checkNameIsEmpity(String name);
	boolean checkEmailIsEmpity(String email);
	boolean checkPasswordIsEmpity(String password);
	boolean checkThisEmailUsed(String email);
	boolean checkThisEmailFormatIsOkey(String email);
	boolean checkThisNameLengthIsOkey(String name);
	boolean checkThisLastNameLengthIsOkey(String lastName);
	boolean checkThisPasswordLengthIsOkey(String password);
	boolean checkAll(User user);
	
	
	
	
	

}
