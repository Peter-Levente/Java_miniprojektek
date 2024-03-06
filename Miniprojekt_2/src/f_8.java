public class f_8 {
    public static void main(String[] args) {
        int[] myArray = {2, 4163, 4, 501300, 8, 7, 6};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int idieglenes = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = idieglenes;
                }
            }
        }
        System.out.println("Rendezett tömb:");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}