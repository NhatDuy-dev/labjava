
package bien2;
public class Bien2 {
    public static void main(String[] args) {
        int x=1;
        int y= x++ + --x + x + x-- + x++ +--x;
       System.out.println(y);
       System.out.println(x);
    }
}
