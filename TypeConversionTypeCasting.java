import java.util.*; 
public class TypeConversionTypeCasting{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("for Type Conversion or Implicit Conversion enter a number that is integer:");
        float number= sc.nextInt();
        System.out.println(number);
        System.out.println("we observed that int is changed to float");

        System.out.println("for Type Casting or Explicit Conversion enter a number that is float:");
        float a= sc.nextFloat();
        System.out.println(a);
        int b= (int)a;
        System.out.println(b);
        System.out.println("we observed that float is changed to int ");
    }

}