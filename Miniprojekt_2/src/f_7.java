import java.util.ArrayList;

public class f_7 {
    public static void main(String[] args) {
        int[] myArray = {2, 2, 2, 4163, 4, 4, 501300, 8, 8, 8, 7, 7, 6, 6};
        ArrayList<Integer> lattamMar = new ArrayList<>();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && !lattamMar.contains(myArray[i])) {
                    lattamMar.add(myArray[i]);
                }
            }
        }
        System.out.println("Az összes többször előforduló elem: ");
        for (int value : lattamMar) {
            System.out.print(value + " ");
        }

    }
}


