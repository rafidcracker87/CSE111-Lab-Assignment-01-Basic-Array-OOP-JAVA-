import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter small letter word: ");
        String word = sc.nextLine();
        String result = " ";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int value = (int)ch;
            if(ch=='a'){
                value=(int)'z';
            }
            else{
                value=value-1;
            }
            result=result+(char)value;
        }
        System.out.println("Output: "+result);
    }
}

