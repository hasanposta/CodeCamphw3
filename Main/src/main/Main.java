package main;

public class Main {


    public static void main(String[] args) {
        
        
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("ad");
        student1.setLastName("soyad");
        student1.setEmailAdress("123@gmail.com");
        student1.setStudentNumber(123);
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("add");
        student2.setLastName("soyadd");
        student2.setEmailAdress("1233@gmail.com");
        student2.setStudentNumber(1234);
        
        
        Instructor instructor1 = new Instructor();
        
        instructor1.setFirstName("ad2");
        instructor1.setLastName("soyad2");
        instructor1.setInstructorNumber(112233);
        
        
        UserManager userManager = new UserManager();
        
        userManager.add(student1);
        
        System.out.println("--------------------------");
        
        User[] users = {student1,student2,instructor1};
        userManager.deleteMultiple(users);

      


        
        
        
    }
    
}
