import java.util.Scanner;

public class bonusz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kave_fajta;
        int vegso_ar;
        int alapar = 200;
        int gomb = -1;


        do {
            System.out.println("""
                    Válasszon kávét:
                                    
                    1-es gomb: Kávé pohár nélkül
                    2-es gomb: Kávé dupla cukorral
                    3-as gomb: Habos kávé
                    """);

            kave_fajta = scanner.nextInt();


            if (kave_fajta == 1) {
                vegso_ar = alapar - 10;
                System.out.println("Kávé pohár nélkül ára: " + vegso_ar + " Ft");
                System.out.println("""
                        4-es gomb a Kávé pohár nélkül elkészítéséhez
                        5-ös gomb az új kávé főzéséhez
                        """);
                gomb = scanner.nextInt();
                if (gomb == 4) {
                    System.out.println("Kávé pohár nélkül elkészült! Egészségére!");
                    System.out.println("""
                            0-ás gomb Kávéautomata kikapcsolása
                            5-ös gomb az új kávé főzéséhez
                            """);
                    gomb = scanner.nextInt();

                } else if (gomb == 5) {
                    System.out.println("""
                            Válasszon kávét:
                                            
                            1-es gomb: Kávé pohár nélkül
                            2-es gomb: Kávé dupla cukorral
                            3-as gomb: Habos kávé
                            """);

                }


            }
            if (kave_fajta == 2) {
                vegso_ar = alapar + 20;
                System.out.println("Kávé dupla cukorral ára: " + vegso_ar + " Ft");
                System.out.println("""
                        6-os gomb a Kávé dupla cukorral elkeszítéséhez
                        7-es gomb a visszalépéshez
                        """);
                gomb = scanner.nextInt();
            }
            if (gomb == 6) {
                System.out.println("Kávé dupla cukorral elkészült! Egészségére!");
                System.out.println("""
                        0-ás gomb Kávéautomata kikapcsolása
                        5-ös gomb az új kávé főzéséhez
                        """);
                gomb = scanner.nextInt();
            } else if (gomb == 7) {
                System.out.println("""
                        Válasszon kávét:
                                        
                        1-es gomb: Kávé pohár nélkül
                        2-es gomb: Kávé dupla cukorral
                        3-as gomb: Habos kávé
                        """);
                kave_fajta = scanner.nextInt();


            }
            if (kave_fajta == 3) {
                vegso_ar = alapar + 50;
                System.out.println("Habos kávé ára: " + vegso_ar + " Ft");
                System.out.println("""
                        8-as gomb a Habos kávé elkeszítéséhez
                        9-es gomb a visszalépéshez
                        """);
                gomb = scanner.nextInt();
            }
            if (gomb == 8) {
                System.out.println("Habos kávé elkészült! Egészségére!");
                System.out.println("""
                        0-ás gomb Kávéautomata kikapcsolása
                        5-ös gomb az új kávé főzéséhez
                        """);
                gomb = scanner.nextInt();
            } else if (gomb == 9) {
                System.out.println("""
                        Válasszon kávét:
                                                                      
                        1-es gomb: Kávé pohár nélkül
                        2-es gomb: Kávé dupla cukorral
                        3-as gomb: Habos kávé
                        """);
            }
        } while (gomb != 0);
    }
}


