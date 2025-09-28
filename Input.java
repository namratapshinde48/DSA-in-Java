import java.util.*;
public class Input{
    public static void main(String args[]){
    byte b=8;
    char ch='a';
    boolean var=false;
    float price=10.5f;
    int number=35;
    long l=24L;             
    double d= 34.12;
    short n=Short.parseShort("480");

    System.out.println(b);
    System.out.println(ch);
    System.out.println(var);
    System.out.println(price);
    System.out.println(number);
    System.out.println(l);
    System.out.println(d);
    System.out.println(n);    
    System.out.println("\n\n");
    System.out.println("using scanner and next commands to take inputs:");

    Scanner sc= new Scanner(System.in);
    System.out.println("enter word:");
    String name= sc.next();
    System.out.println(name);
    System.out.println("enter string:");
    String fullname= sc.nextLine();
    System.out.println(fullname);
    System.out.println("enter age:");
    int age= sc.nextInt();
    System.out.println(age);
    System.out.println("enter decimal:");
    float decimal = sc.nextFloat();
    System.out.println(decimal);
    System.out.println("enter byte:");
    byte bytevalue = sc.nextByte();
    System.out.println(bytevalue);
    System.out.println("enter double:");
    double value= sc.nextDouble();
    System.out.println(value);
    System.out.println("enter boolean:"); 
    boolean bool= sc.nextBoolean();
    System.out.println(bool);
    System.out.println("enter short:");
    short s= sc.nextShort();
    System.out.println(s);
    System.out.println("enter long:");
    long longvalue= sc.nextLong();
    System.out.println(longvalue);

    }
}