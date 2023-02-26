import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = {
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
        };
        Batman b = new Batman();
        Random random = new Random();
        int x = random.nextInt(5);
        int y = random.nextInt(5);

        myArray[x][y] = "b";
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {

                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        b.stepAhead(myArray,input);
    }
}