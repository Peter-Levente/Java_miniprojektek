public class f_6 {
    public static void Tombegyenloseg(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            System.out.println("Nem egyenloek a tombok!");
            return;
        }

        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                System.out.println("Nem egyenloek a tombok!");
                return;
            }
        }
        System.out.println("Egyenloek a tombok!");
    }


    public static void main(String[] args) {
        int[] t1 = {10, 20, 30, 40};
        int[] t2 = {10, 20, 30, 40};
        Tombegyenloseg(t1, t2);
    }
}
