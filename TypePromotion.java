
public class TypePromotion{
    public static void main(String args[]){
        char c='c';
        short d=50;
        System.out.println("sum of char c and short d in int is:"+ (c+d));

        char a='a';
        char b='b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println("difference of char a and char b in int is:"+ (b-a));

        System.out.println("\n \n");

        int i=10;
        float f= 20.25f;
        long l=25;
        double o= 30;
        double ans= i+f+o+l;
        System.out.println(ans);
        System.out.println("Here int, float, long and double data types were used but as double is largest data type, the answer is of double data type.");
        System.out.println("\n \n");

        System.out.println("The following is an example of how inspite of being byte, due to the expression e*2 the statement changes answer in int, so we need to type caste it:");
        byte e = 5;
        e= (byte)(e*2); // and not e=e*2 as e*2 makes e as int but e is byte
        System.out.println("the value of e after type casting it is: "+ e);
    }
}