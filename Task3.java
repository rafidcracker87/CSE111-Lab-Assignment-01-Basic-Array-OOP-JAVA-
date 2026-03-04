import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr1 = new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Enter an input: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++) {
            if (arr1[i] == 1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[j] = 1;
                }
            }
            System.out.println(arr[i] + " - " + count + " times ");
        }
    }
}

