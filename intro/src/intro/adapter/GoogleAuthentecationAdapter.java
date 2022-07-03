package intro.adapter;

import intro.business.abstracts.UserService;
import intro.entities.concretes.User;

public class GoogleAuthentecationAdapter implements UserService{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		System.out.println(user.getId()+" Id'li kullanýcý Sisteme Google ile eklenmiþtir");
		
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		
		System.out.println(email+ " mailli kullanýcý Google ile sisteme giriþ yapmýþtýr");
		
	}

	@Override
	public void emailList() {
		// TODO Auto-generated method stub
		
	}

}
