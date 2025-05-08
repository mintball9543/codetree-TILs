import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.

        int idx = find_location(text, pattern);

        System.out.println(idx);

    }

    public static int find_location(String str1, String str2){
        return str1.indexOf(str2);
    }
}