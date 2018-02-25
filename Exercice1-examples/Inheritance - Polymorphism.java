class Animal {
	
   public void eat() {
      
      System.out.println("An animal can eat.");
   }
	
}

public class Fish extends Animal {
   public void swim() {
      System.out.println("This fish swim:");
   }
	
   public static void main(String args[]) {
      Fish demo = new Fish();
      My_Calculation demo = new My_Calculation();
	  demo.eat();
	  demo.swim();
     
   }
}


