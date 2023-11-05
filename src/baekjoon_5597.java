import java.util.Scanner;

public class baekjoon_5597 {
    public static void main(String[] args) {
        boolean[] n = new boolean[31];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 28; i++)
            n[sc.nextInt()] = true;
        sc.close();

        for (int i = 1; i <= 30; i++) {
            if (!n[i])
                System.out.print(i + " ");
        }
    }
}
