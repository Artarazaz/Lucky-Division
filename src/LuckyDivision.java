import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lucky = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 777};
        for (int j : lucky) {
            if (n % j == 0) {
                System.out.println("YES");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("NO");
        }
    }
}
