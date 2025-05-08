import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        System.out.println(sum_arr(arr, m));
    }

    private static int sum_arr(int[] arr, int m){
        int sum = 0;
        
        while(m != -1){
            sum += arr[m];
            m = check_m(m);
        }

        return sum;
    }

    private static int check_m(int m){
        if(m == 1)
            return -1;
        
        if(m%2 == 0)
            return m/2;
        else
            return m-1;
    }
}