import java.util.Scanner;

class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double fnum, snum, answer;

        System.out.println("Enter First Number: ");
        fnum = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        snum = sc.nextDouble();
       answer = fnum + snum;
       System.out.println(answer);


    }
}