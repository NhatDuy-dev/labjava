
package kethua;

public class processor {
   public static void main(String[] args) {  
       cat cat=new cat();
       cat.makeSound();
       System.out.println("cat's ID:"+cat.catID);
       cat.catchMouse();
       System.out.println("source: "+cat.source);
   }
}
