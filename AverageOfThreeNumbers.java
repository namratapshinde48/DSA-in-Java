import java.util.*;
public class AverageOfThreeNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int A=sc.nextInt();
        System.out.println("Enter B:");
        int B=sc.nextInt();
        System.out.println("Enter C:");
        int C=sc.nextInt();
        int sum=A+B+C;
        int average=sum/3;
        System.out.println("Average of the given 3 numbers is:"+average);
    }
}