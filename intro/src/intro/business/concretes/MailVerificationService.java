package intro.business.concretes;

import intro.business.abstracts.VerificationService;


public class MailVerificationService implements VerificationService {

	@Override
	public void sendToVerifify(String email) {
		
		System.out.println(email+" adlý maile doðrulama maili gönderilmiþtir");
		
	}

	@Override
	public boolean userIsTheVerified(String email) {
		// TODO Auto-generated method stub
		
	     //SÝMÜLASYON
		
		return true;
	}

}
