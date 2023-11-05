import java.util.Scanner;

public class baekjoon_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        /*
        int[] arr1 = new int[N*M];
        int[] arr2 = new int[N*M];

        for (int i = 0; i < N*M; i++)
            arr1[i] = sc.nextInt();
        for (int i = 0; i < N*M; i++)
            arr2[i] = sc.nextInt();
        sc.close();

        for (int i = 0; i < N*M; i++) {
            System.out.print(arr1[i] + arr2[i] + " ");
            if ((i+1) % M == 0)
                System.out.println();
        }
        */

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                arr1[i][j] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                arr2[i][j] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
                if (j+1 == M) // (j+1 % M == 0)
                    System.out.println();
            }
        }
    }
}
