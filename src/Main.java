import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("m: ");
        int m=scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                arr[i][j] = scanner.nextInt();

            }
            }
             int sum=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                sum=sum+arr[i][j];
            }

        }
        System.out.println(sum);
            }

        }









