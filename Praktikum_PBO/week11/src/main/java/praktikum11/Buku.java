package praktikum11;

public class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + this.judul);
        if (this.pengarang != null) {
            this.pengarang.infoPengarang();
        }
    }
}