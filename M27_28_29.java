package gun2odev2;

public class M27_28_29 {
    public static void main(String[] args) {
        CutomerManager cm = new CutomerManager();
        cm.add();
        cm.remove();
        cm.update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar = new int[] { 1, 2, 3 };
        int[] sayilar2 = new int[] { 4, 5, 6 };

        sayilar2 = sayilar;

        sayilar[0] = 10;
        System.out.println(sayilar2[0]); // 10
    }
}
