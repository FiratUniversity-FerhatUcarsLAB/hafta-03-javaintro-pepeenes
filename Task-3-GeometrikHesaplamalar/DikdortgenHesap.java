public class DikdortgenHesap {
    static void main(String[] args) {
        //Atanan değerler
        int kısaKenar = 4.5;
        int uzunKenar = 7.9;


        //Çevre hesaplama
        int cevre = (uzunKenar + kısaKenar)*2;
        System.out.println("Dikdörtgenin çevresi : " + cevre);

        //Alan hesaplama

        int alan = uzunKenar * kısaKenar;
        System.out.println("Dikdörtgenin alanı : " + alan);
    }
}

