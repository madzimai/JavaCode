 import java.util.Scanner;
public class JavaLessonFour {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String contNorY = "Y";
        int h = 1;

        while(contNorY.equalsIgnoreCase("Y")) {

            System.out.println(h);
            System.out.print("Countinue y or n? ");
            contNorY = sc.nextLine();
            h++;
        }

    }
}