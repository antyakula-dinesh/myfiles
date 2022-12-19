import java.util.*;

class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("enter number");
        a = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }

}