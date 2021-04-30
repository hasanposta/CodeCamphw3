
package main;


public class Student extends User{
    
   private int studentNumber;
   
public Student() {
		
	}

    public Student(int studentNumber, int id, String firstName, String lastName, String emailAdress) {
        super(id, firstName, lastName, emailAdress);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
    
}

