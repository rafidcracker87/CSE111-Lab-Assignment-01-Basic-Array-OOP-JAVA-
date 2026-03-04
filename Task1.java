import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int prime_number_count=0;
        if(num1<num2){
            for(int i=num1+1;i<num2;i++) {
                if (i <= 1) {
                    continue;
                }
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    prime_number_count++;
                }
            }
        }
        else{
            for(int i=num1-1;i>num2;i--){
                if(i<=1){
                    continue;
                }
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    prime_number_count++;
                }
            }
        }
        System.out.println("There are "+prime_number_count+" prime numbers between "+num1+" and "+num2);
    }
}
