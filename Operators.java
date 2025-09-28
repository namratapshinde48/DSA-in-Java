import java.util.*;
public class Operators{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("This is an example of ASSIGNMENT  OPERATOR binary operator with 2 operands:");
        int A=10;
        int B= 5;
        System.out.println("Addition of A and B is:"+ (A+B));
        System.out.println("Subtraction of A and B is:"+ (A-B));
        System.out.println("Multiplication of A and B is:"+ (A*B));
        System.out.println("Division of A and B is:"+ (A/B));
        System.out.println("Modulo of A and B is:"+ (A%B));

         System.out.println("\n \n Examples of unary operator with 1 operands:");
         System.out.println("Preincrement operator for the entered value:" );
         int a=10;
         int b= ++a;
         System.out.println(a);
           System.out.println(b);
         
         System.out.println("Postincrement operator:");
         int p=10;
         int c= p++;
        System.out.println(p);
          System.out.println(c);
         
         System.out.println("Predecrement operator:");
         int q=10;
         int d=--q;
        System.out.println(q);
          System.out.println(d);
         
         System.out.println("Postdecrement operator:");
         int r= 10;
         int e=r--;
        System.out.println(r);
          System.out.println(e);

        System.out.println("\n\n");

        System.out.println("Relational Operators:");
        int N=20;
        int M= 45;
        System.out.println("N==M "+(N==M));
        System.out.println("N!=M "+(N!=M));
        System.out.println("N>M "+(N>M));
        System.out.println("N<M "+(N<M));
        System.out.println("N>=M "+(N>=M));
        System.out.println("N<=M "+(N<=M));
         System.out.println("\n");

         System.out.println("Logical Operators AND &&, or ||, not!:");
         System.out.println((3>2)&& (5>0));
         System.out.println((3==2)|| (5>0));
         System.out.println(!(3>2));

         System.out.println("\n");
         System.out.println("Assignment Operators:");
         int x=10;
         int y=20;
         int P=(x+=10);
         System.out.println("x+=10: "+(P));
         System.out.println("y-=10: "+(y-=10));
         System.out.println("x*=5: "+(x*=5));
         System.out.println("y/=5: "+(y/=5));
         System.out.println("x%=5: "+(x%=5));
         System.out.println("x=y: "+(x=y));
         System.out.println("\n");
         int g=2, h=5;
         int exp1= (g*h/g);
         int exp2=(g*(h/g));
         System.out.print(exp1+",");
         System.out.print(exp2);

         



          }
}