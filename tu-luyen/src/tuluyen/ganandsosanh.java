package tuluyen;

public class ganandsosanh {

    public static void main(String[] agrs) {
        //gắn toán tử
        int a = 10;
        a += 5; //a=a+5
        System.out.println("a=" + a);//- * / %(lấy dư) tương tự
        //so sánh 
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(a != b);//khác
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);
        //bài tập
        int d = 6;
        d += 3;
        System.out.println("d+=" + d);
        int e = 2;
        d -= (e + 7);
        System.out.println("d=" + d);

    }
}
