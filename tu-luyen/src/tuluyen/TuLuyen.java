package tu.luyen;

public class TuLuyen {

    public static void main(String[] args) {
        //ep kieu du lieu
        int a = 5;
        int b = 10;
        double kp = (double) a / b;
        System.out.println(kp);
        // ep kieu du lieu hep
        int c = 128;
        byte d = (byte) c;//byte chỉ chứa được từ -128 đến 127 nên sẽ đổi giá trị
        System.out.println(c);
        System.out.println(d);
        int f = 12;
        byte e = (byte) f;//ép từ int->>byte
        System.out.println(f);
        System.out.println(e);
    }
}
