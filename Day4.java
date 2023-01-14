import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        int n=0,sum=0;
        System.out.println("Enter the five number :");
        for (int i = 0; i < 5; i++) {
            Scanner sc=new Scanner(System.in);
            n= sc.nextInt();
            sum+=n;
        }
        System.out.println("The sum of five numbers are "+sum);
    }
}
