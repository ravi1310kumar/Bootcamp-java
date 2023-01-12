import java.util.Scanner;
public class Day3 {
    public static void main(String[] args){
        System.out.println("Enter the value of a:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a>0){
            System.out.println("The number is positive.");
        } else if (a==0) {
            System.out.println("neither positive nor negative.");
        } else if (a<0) {
            System.out.println("The number is negative.");
        }
    }

}
