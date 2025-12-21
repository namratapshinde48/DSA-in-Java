import java.util.*;
public class PrintFromOneToUserGivenRange{
    public static void main(String args[]){
        System.out.println("enter the number till which you want to print the numbers");
        Scanner sc= new Scanner(System.in);
        int range=sc.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}