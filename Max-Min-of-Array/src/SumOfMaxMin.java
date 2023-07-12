import java.util.Scanner;

public class SumOfMaxMin {
    public static int minMax(int n, int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max+min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int sum = minMax(n,arr);
        System.out.println(sum);
    }
}
