package intro.business.concretes;

import intro.business.abstracts.VerificationService;


public class MailVerificationService implements VerificationService {

	@Override
	public void sendToVerifify(String email) {
		
		System.out.println(email+" adl� maile do�rulama maili g�nderilmi�tir");
		
	}

	@Override
	public boolean userIsTheVerified(String email) {
		// TODO Auto-generated method stub
		
	     //S�M�LASYON
		
		return true;
	}

}
