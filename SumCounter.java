import java.util.*;

public class SumCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findSumIndices(arr, T);
        System.out.println(result);
    }
    public static int findSumIndices(int[] arr, int T) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == T) {
                    return i * j;
                }
            }
        }
        return -1;
    }
}