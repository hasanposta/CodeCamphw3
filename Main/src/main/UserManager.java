
package main;


public class UserManager{
    
    public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı eklendi");
	}
    
    public void addMultiple(User[] users){
        for (User user : users){
            add(user);
            
        }
        
        
    }
    
    public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()  + " adlı kullanıcı  güncellendi");
	}

    public void updateMultiple(User[] users){
        
        for (User user : users)
            add(user);
        
    }
            
    public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()  + " dlı kullanıcı silindi");
	}
    
       public void deleteMultiple(User[] users){
        
        for (User user : users)
            add(user);
        
    } 
    
    
 
    
    
}


