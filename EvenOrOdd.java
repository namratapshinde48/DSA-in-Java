import java.util.*;
public class EvenOrOdd{
    public static void main(String args[]){
        System.out.println("enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}