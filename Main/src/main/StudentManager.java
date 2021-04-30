
package main;



public class StudentManager extends UserManager{
    
    public void login(Student student){
        
        System.out.println(student.getStudentNumber() + " " + " numaralı öğrenci sisteme giriş yaptı"); 
    }
    
    public void exit(Student student){
        
        System.out.println(student.getStudentNumber() + " " + " numaralı öğrenci sistemden çıkış yaptı");
        
    }
    
}
