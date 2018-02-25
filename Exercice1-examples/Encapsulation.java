/* File name : TennisPlayer.java */
public class TennisPlayer {
   private String name;
   private int height;
   private int weight;
   private int age;

   public String getName() {
      return name;
   }
   
   public int height() {
      return height;
   }
   
   public int weight() {
      return weight;
   }
   
   public int getAge() {
      return age;
   }

  
   
   public void setHeight( int newHeight) {
      age = newHeight;
   }
   
   public void setWeight( int newWeight) {
      age = newAge;
   }
   
   public void setAge( int newAge) {
      age = newAge;
   }
   
   public void setName(String newName) {
      name = newName;
   }

}


public class TennisPlayer {

   public static void main(String args[]) {
      TennisPlayer tenplay = new TennisPlayer();
      tenplay.setName("Roger");
      tenplay.setAge(32);
	  tenplay.setHeight(185);
	  tenplay.setWeight(75);
      

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}