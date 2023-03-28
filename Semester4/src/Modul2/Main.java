package Modul2;
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            // membuat objek ArrayList Hewan
            ArrayList<String> Hewan = new ArrayList<String>();
            Hewan.add("Sapi");
            Hewan.add("Kelinci");
            Hewan.add("Kambing");
            Hewan.add("Unta");
            Hewan.add("Domba");

            // membuat objek ArrayList DeleteHewan
            ArrayList<String> DeleteHewan = new ArrayList<String>();
            DeleteHewan.add("Kelinci");
            DeleteHewan.add("Kambing");
            DeleteHewan.add("Unta");

            // menghapus data pada objek Hewan yang sama dengan data warna pada objek DeleteHewan
            for (String warna : DeleteHewan) {
                Hewan.removeIf(h -> h.equals(warna));
            }

            // menampilkan isi objek Hewan setelah penghapusan
            System.out.println("Isi objek Hewan setelah penghapusan:");
            for (String hewan : Hewan) {
                System.out.println(hewan);
            }
        }
    }

