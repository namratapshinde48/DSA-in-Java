import java.util.*;
public class PrintSquarePattern{
    public static void main(String args[]){
        System.out.println("Enter number of rows for square that has 4 columns *s:");
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        for(int line=1; line<=n;line++){
            System.out.println("****");
        }
    }
}