package gun2odev2;

public class M25 {
    public static void main(String[] args) {
        System.out.println("Hava güzel!");
        String mesaj = sehirVer();
        System.out.println(mesaj);
        int sayi = topla(1, 5);
        System.out.println(sayi);
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
}
