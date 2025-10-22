public class UcgenAlanHesap {
    static void main(String[] args) {

        //Atanan değerler

        int a_Kenarı = 3;
        int b_Kenarı = 4;
        int c_Kenarı = 5;

        //Çevre hesabı

        int cevre = a_Kenarı + b_Kenarı + c_Kenarı;
        System.out.println("Üçgenin çevresi = " + cevre);

        //Alan hesaplama

          //Çevrenin yarısı
        int s = (3+4+5) / 2;

        int alan = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Üçgenin alanı = " + alan);

        
    }
}
