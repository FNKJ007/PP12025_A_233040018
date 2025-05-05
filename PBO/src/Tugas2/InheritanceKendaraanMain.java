package Pertemuan_9.Tugas2;

public class InheritanceKendaraanMain {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2020, 5);
        Motor motor = new Motor("Honda Vario", 2022, "Skuter");

        System.out.println("Data Mobil:");
        System.out.println("Merk: " + mobil.getMerk());
        System.out.println("Tahun: " + mobil.getTahun());
        System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());

        System.out.println("\nData Motor:");
        System.out.println("Merk: " + motor.getMerk());
        System.out.println("Tahun: " + motor.getTahun());
        System.out.println("Jenis: " + motor.getJenisMotor());
    }
}