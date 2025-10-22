public class DikdortgenHesap {
    static void main(String[] args) {
        //Atanan değerler
        double kısaKenar = 4.5;
        double uzunKenar = 7.9;


        //Çevre hesaplama
        double cevre = (uzunKenar + kısaKenar)*2;
        System.out.println("Dikdörtgenin çevresi : " + cevre);

        //Alan hesaplama

        double alan = uzunKenar * kısaKenar;
        System.out.println("Dikdörtgenin alanı : " + alan);
    }
}


