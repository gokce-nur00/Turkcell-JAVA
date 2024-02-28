package gun2odev2;

public class M26 {
    public static void main(String[] args) {
        System.out.println("Hava güzel!");
        String mesaj = sehirVer();
        System.out.println(mesaj);
        int sayi = topla(1, 5);
        System.out.println(sayi);
        int toplam = topla2(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi!");
    }

    public static void sil() {
        System.out.println("Silindi!");

    }

    public static void guncelle() {
        System.out.println("Guncellendi!");

    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int i : sayilar) {
            toplam += i;
        }
        return toplam;
    }

}
