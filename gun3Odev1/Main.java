public class Main {
    public static void main(String[] args) {
        Human father = new Human("Melisa", "Kadin", 27, "Malatya");
        Human mother = new Human("Neslihan", "Kadin", 45, "Samsun");
        System.out.println(mother.name);

        Team team = new Team("Fenerbahce", "Kadin", 120, "İstanbul");
        team.play(team);

        Power power = new Power();
        power.loop("Gokce");
        team.stop(team);

        System.out.println("***********************");

        // abstract sınıf örnek.
        Tff tff = new Tff();

        tff.rules();
        tff.tactics();

    }
}