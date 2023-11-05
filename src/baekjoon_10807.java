import java.util.Scanner;

public class baekjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int v = sc.nextInt();
        sc.close();

        int numV = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == v)
                numV++;
        }

        System.out.println(numV);
    }
}
