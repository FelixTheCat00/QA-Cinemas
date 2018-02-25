public abstract class Fighter {
   private String name;
   private int age;
   private int weight;

   public Fighter(String name, int age, int weight) {
      System.out.println("Constructing an Fighter");
      this.name = name;
      this.age = age;
      this.weight = weight;
   }
   
   public void hit() {
   }

   public String toString() {
      return name + " " + age + " " + weight;
   }

   public String getName() {
      return name;
   }
 
   public String getAge() {
      return age;
   }
   
   public int getWeight() {
      return weight;
   }
   
   public void setName(String newName) {
      name = newName;
   }
   
   public void setAge(String newAge) {
      age = newAge;
   }
   
   public void setWeight(String newWeight) {
      weight = newWeight;
   }
   
}

public class boxer extends fighter{
	public void hit() {
		System.out.println("The Boxer throw an uppercut");
   }
	
}