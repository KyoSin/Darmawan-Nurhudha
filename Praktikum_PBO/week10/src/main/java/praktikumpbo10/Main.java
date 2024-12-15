package praktikumpbo10;

public class Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik("Laptop", 1500000);
        Makanan makanan = new Makanan("Pizza", 100000);

        elektronik.tampilkanInfo();
        System.out.println();
        makanan.tampilkanInfo();
    }
}
