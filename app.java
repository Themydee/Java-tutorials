import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int no = 20;
        Scanner sc = new Scanner(System.in);
        String[] names = new String[no];
        int[] id = new int[no];
        int[] maths = new int[no];
        int[] english = new int[no];
        int[] science = new int[no];

        for (int counter = 0; counter < no; counter++) {
            System.out.println("Enter the Students Name" + (counter + 1));
            names[counter] = sc.next();

            System.out.println("Enter the Students id" + (counter + 1));
            id[counter] = sc.nextInt();

            System.out.println("Enter the Students Maths Score" + (counter + 1));
            maths[counter] = sc.nextInt();

            System.out.println("Enter the Students English Score" + (counter + 1));
            english[counter] = sc.nextInt();

            System.out.println("Enter the Students Science Score" + (counter + 1));
            science[counter] = sc.nextInt();

            System.out.println("Students Bio Data: " + names[counter] + "|" + "ID Number:" + id[counter] + "|"
                    + "Students Math Score:" + maths[counter] + "|" + "Students English Score:" + english[counter] + "|"
                    + "Students Science Score:" + science[counter]);
        }
    }
}