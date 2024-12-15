package praktikumpbo9;

public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: Guk Guk");
    }
}

