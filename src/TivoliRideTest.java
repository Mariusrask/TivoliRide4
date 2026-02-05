import java.util.Scanner;

public class TivoliRideTest {

    public static void main(String[] args) {


        System.out.println("Find out if you're tall enough for the ride!");
        System.out.print("Enter your height: ");

        Scanner HeightChecker = new Scanner(System.in);
        int height = HeightChecker.nextInt();
System.out.println();
        if (height < 170) {
            System.out.println("You're not tall enough for the ride :(");
            }
        else {
            System.out.println("You're tall enough for the ride ! :D");
        }
    }
}
