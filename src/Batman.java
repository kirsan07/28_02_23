import java.util.Scanner;
    class Batman implements Movable {
        public void stepAhead(String[][] myArray, String input) {
            String[][] newArray = new String[myArray.length][];
            if (input.equals("w")) {
                for (int i = 0; i < myArray.length; i++) {
                    newArray[i] = myArray[i].clone();
                }
                for (int i = 0; i < myArray.length; i++) {
                    for (int j = 0; j < myArray.length; j++) {
                        if ("b".equals(newArray[i][j])) {
                            if (i == 0) {
                                newArray[i][j] = "_";
                                newArray[newArray.length - 1][j] = "b";
                            } else {
                                newArray[i][j] = "_";
                                newArray[i - 1][j] = "b";
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j< newArray.length; j++) {
                    System.out.print(newArray[i][j]);
                }
                System.out.println();
            }
        }
        public void turnLeft() {

        }
        public void turnRight() {

        }
        public void turnAround() {
            turnRight();
            turnRight();
        }
    }

