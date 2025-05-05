package Pertemuan_9.Tugas2;

public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merk, int tahun, String jenisMotor) {
        super(merk, tahun);
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }
}