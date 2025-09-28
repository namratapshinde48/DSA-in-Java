import java.util.*;
public class BasicMaths {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("sum of both numbers:"+ (a+b));
        System.out.println("product of both numbers:"+ (a*b));
        System.out.println("enter radius:");
        float r= sc.nextFloat();
        System.out.println("Area of the circle is:"+ (3.14*r*r));

    }
}