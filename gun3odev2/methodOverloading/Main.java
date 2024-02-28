package gun2odev2.methodOverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.Topla(2, 4);
        toplam = dortIslem.Topla(2, 3, 4);
        System.out.println(toplam);
    }
}
