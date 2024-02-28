package gun2odev2;

public class M24 {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak = 5;
        boolean varMi = false;
        for (int i : sayilar) {
            if (aranacak == i) {
                varMi = true;
                break;
            }
        }

        if (varMi)
            mesajVer("Sayi mevcuttur:" + aranacak);
        else
            mesajVer("Sayi mevcut degildir:" + aranacak);
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}
