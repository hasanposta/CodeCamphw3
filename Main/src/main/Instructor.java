
package main;


public class Instructor extends User{
    
   private int instructorNumber;
   
   public Instructor() {
		
	}

    public Instructor(int instructorNumber, int id, String firstName, String lastName, String emailAdress) {
        super(id, firstName, lastName, emailAdress);
        this.instructorNumber = instructorNumber;
        
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
   
   
   
    
}
