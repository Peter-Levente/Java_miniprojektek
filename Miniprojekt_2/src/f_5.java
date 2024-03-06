public class f_5 {
    public static void main(String[] args) {
        int[] myArray={1,2, 3, 4, 5, 6};

        for (int elem:myArray){
            System.out.print("A tombe elso eleme: "+elem+" es az utolso elem: "+myArray[myArray.length-1]);
            break;
        }
    }
}
