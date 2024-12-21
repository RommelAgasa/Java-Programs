package combi;

public class Combi {

    public static void main(String[] args) {
        char[] character = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};
        int lengthOfPass = 15;
        int row = numberOfCombination(character.length, lengthOfPass);
        System.out.println(row);
        char[][] combiResult = new char[row][lengthOfPass];

        combination(character, 0, combiResult, lengthOfPass, 0, row, lengthOfPass - 1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < lengthOfPass; j++)
                System.out.print(combiResult[i][j] + " ");
            System.out.println("");
        }
    }

    public static void combination(char[] character, int currentFirst,
                                   char[][] combiResult, int k, int currentRow, int row, int pivot) {

        if (k == 0)
            return;

        if (currentFirst == (character.length - 1))
            return;

        if (character.length <= 1)
            return;

        int curSec = currentFirst + 1;
        int pivotOrigPlace = pivot;
        while (curSec < character.length - 1) {
            for (int j = pivotOrigPlace; j < character.length; j++) {

                int i = 1;
                int shift = curSec;
                combiResult[currentRow][0] = character[currentFirst];
                for (; i < k - 1; i++) {
                    combiResult[currentRow][i] = character[shift];
                    shift++;
                }
                combiResult[currentRow][i] = character[j];
                currentRow++;
            }
            pivotOrigPlace++;
            curSec++;
        }

        combination(character, currentFirst += 1, combiResult, k, currentRow, row, pivot + 1);
    }

    static int numberOfCombination(int numOfItem, int k) {
        return factorial(numOfItem) / (factorial(numOfItem - k) * factorial(k));
    }

    static int factorial(int f) {
        int product = 1;
        for (int i = 1; i <= f; i++) {
            product *= i;
        }
        return product;
    }
}
