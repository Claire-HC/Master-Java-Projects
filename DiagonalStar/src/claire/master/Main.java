package claire.master;
/*
* Generate a rectangular pattern composed of stars(*)
* The patterns above consist of a number of rows and columns (where number is the number of rows to print).
* ) For each row or column, stars are printed based on four conditions:
* 1. in the first or last row
* 2. in the first or last column
* 3. when the row number equals the column number
* 4. when the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            for (int row = 0; row < number; row++){
                if(row == 0 || row == (number -1)) {
                    for(int column = 0; column < number; column++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else{
                    for(int column = 0; column < number; column++) {
                        if(column == 0 || column == (number -1) || row == column || (column == (number - row - 1))) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
