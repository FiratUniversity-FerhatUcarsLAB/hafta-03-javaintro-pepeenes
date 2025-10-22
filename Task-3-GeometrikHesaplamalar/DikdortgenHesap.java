public class DikdortgenHesap {
    static void main(String[] args) {
        //Atanan değerler
        int kısaKenar = 10;
        int uzunKenar = 20;


        //Çevre hesaplama
        int cevre = (uzunKenar + kısaKenar)*2;
        System.out.println("Dikdörtgenin çevresi : " + cevre);

        //Alan hesaplama

        int alan = uzunKenar * kısaKenar;
        System.out.println("Dikdörtgenin alanı : " + alan);
    }
}
