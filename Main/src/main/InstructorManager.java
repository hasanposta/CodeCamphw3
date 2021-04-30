
package main;


public class InstructorManager extends UserManager{
   
    
    
    public void login(Instructor instructor){
    System.out.println(instructor.getFirstName()+" adlı eğitmen sisteme giriş yaptı");
    }
    
    public void exit(Instructor instructor){
        System.out.println(instructor.getFirstName()+" adlı eğitmen sistemden çıkış yaptı");
    }
 
    
    
    
    
}

