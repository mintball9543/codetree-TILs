import java.util.Scanner;
public class Main {
    public static int[] arr;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int result = 0;
            for(int j = a1 - 1; j < a2; j++){
                result += arr[j];
            }

            System.out.println(result);
        }
    }
}