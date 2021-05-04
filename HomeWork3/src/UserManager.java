
public class UserManager {

	public void add(User user) {
	
		System.out.println(user.getName()+" "+user.getLastName()+ " adl� kullan�c� eklendi."+"\n"+
	                       user.getEmail()+" ve �ifreniz ile giri� yapabilirsiniz."+"\n");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user:users) {
			add(user);
		}	
	}
	
	public void Update(User user) {
		System.out.println(user.getName() +" adl� kullan�c� g�ncellenmi�tir.");
	}
	
	public void Delete(User user) {
		System.out.println(user.getName() +" adl� kullan�c� silinmi�tir.");
	}
	
	
}
