package Modul1;
    import java.util.Scanner;

    public class segitiga<T>{

        private T alas;
        private T tinggi;

        public void setAlas(T alas) {
            this.alas = alas;
        }
        public T getAlas() {
            return alas;
        }
        public void setTinggi(T tinggi) {
            this.tinggi = tinggi;
        }
        public T getTinggi() {
            return tinggi;
        }

        public<T>int getResaultAslnt(){
            return (int)alas * (int)tinggi/2;
        }

        public <T>double getResaultAsDouble(){
            return (double) alas * (double) tinggi/2;
        }

        public static void main(String[] args){
            Scanner input = new
                    Scanner(System.in);

            segitiga<Integer>hasilint = new segitiga<Integer>();
            segitiga<Double>hasilDouble = new segitiga<Double>();

            int pilih;
            System.out.println("1. Integer \n2. Double ");
            System.out.print("Masukkan Pilihan : ");

            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("\nMasukan Alas : ");
                    hasilint.setAlas(input.nextInt());
                    System.out.print("Masukkan Tinggi : ");
                    hasilint.setTinggi(input.nextInt());
                    System.out.print("Hasil Integer = " + hasilint.getResaultAslnt());
                    break;
                case 2:
                    System.out.print("\nMasukkan Alas : ");
                    hasilDouble.setAlas(input.nextDouble());
                    System.out.print("Masukkan Tinggi : ");
                    hasilDouble.setTinggi(input.nextDouble());
                    System.out.print("Hasil Double  = " + hasilDouble.getResaultAsDouble());
                    break;
                default:
                    break;
            }

        }

    }

