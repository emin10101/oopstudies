package intro.adapter;

import intro.business.abstracts.UserService;
import intro.entities.concretes.User;

public class GoogleAuthentecationAdapter implements UserService{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		System.out.println(user.getId()+" Id'li kullan�c� Sisteme Google ile eklenmi�tir");
		
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		
		System.out.println(email+ " mailli kullan�c� Google ile sisteme giri� yapm��t�r");
		
	}

	@Override
	public void emailList() {
		// TODO Auto-generated method stub
		
	}

}
