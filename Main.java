import javax.lang.model.util.ElementScanner6;

class CheckMyAge {
  public static void main(String[] args) {
    int age = 17;
    int myBirthday = 934;
    int todaysDate = 921;
    
    if (myBirthday == todaysDate)
    {  
      age = age + 1;
    System.out.println("I am" + age + "years old.");
    }
    else {
    System.out.println("I am still"  + age + "years old."); 
  }
 }
}