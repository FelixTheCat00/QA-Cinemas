import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int sum;
    Standard standard = new Standard();
    OAP oap = new OAP();
    Student student = new Student();
    Child child = new Child();
    
    int standardP = standard.ticketPrice();
    int oapP = oap.ticketPrice();
    int studentP = student.ticketPrice();
    int childP = child.ticketPrice();
    
    Scanner reader = new Scanner(System.in);  
    System.out.println("Who many children tickets ?: ");
    int childrenPrice = reader.nextInt(); 
    System.out.println("Who many OAP tickets ?: ");
    int OAPPrice = reader.nextInt();
    System.out.println("Who many student tickets ?: ");
    int studentPrice = reader.nextInt();
    System.out.println("Who many standard tickets ?: ");
    int standardPrice = reader.nextInt();
    
    reader.close();
    int total = childrenPrice*child.ticketPrice() +
                OAPPrice*oap.ticketPrice()        +
                studentPrice*student.ticketPrice()+
                standardPrice*standard.ticketPrice();
                
  
    System.out.println("The total cost of tickets for this movie is £" +total+".");
    
    
    /**
    System.out.println(standard.ticketPrice());
    System.out.println(oap.ticketPrice());
    System.out.println(student.ticketPrice());
    System.out.println(child.ticketPrice());
    **/
    
   
      
    }
     
 
  
}