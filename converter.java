import java.util.Scanner;

public class converter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius");
        float C = sc.nextFloat();

        float F = C * (9f / 5) + 32;

        System.out.println(C + " degree Celsius is equal to " + F + " degree Farhenheit");
    }
}