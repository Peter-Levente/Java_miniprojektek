public class f_6 {
    public static void main(String[] args) {
        int[] myArray = {20, 312, 3, 4163, 501300, 6};

        int legkisebb = myArray[0];
        int legnagyobb = myArray[0];

        for (int elem : myArray) {
            if (legkisebb > elem) {
                legkisebb = elem;
            }
            if (legnagyobb < elem) {
                legnagyobb = elem;
            }
        }
        System.out.println("Legkisebb: " + legkisebb);
        System.out.println("Legnagyobb: " + legnagyobb);
    }
}
