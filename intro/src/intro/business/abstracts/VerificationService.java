package intro.business.abstracts;



public interface VerificationService {
	
	void sendToVerifify(String email);
	boolean userIsTheVerified(String email);
	



}
