package bailab3;

public class chanle {

    public static void main(String[] args) {
        int tc = 0;
        int tl = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                tc += i;
                System.out.print(" so chan: " + i + " ");
            } else {
                tl += i;
                System.out.print("so le: " + i);
            }
        }
        System.out.println("\ntong so le: " + tc);
        System.out.println("\ntong so le: " + tl);
    }
}
