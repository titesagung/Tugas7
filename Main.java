package tugas07;

public class Main {
    public static void main(String[] args) {

        RunApps pegawai1 = new RunApps(new PegawaiTetap("Bayu", "350728490327424892342", 2000000));
        System.out.print("\n");

        RunApps pegawai2 = new RunApps(new PegawaiHarian("Edo", "350728490327424892343", 8500, 40));
        System.out.print("\n");

        RunApps pegawai3 = new RunApps(new Sales("Tika", "350728490327424892344", 50, 50000));
        System.out.print("\n");

        RunApps pegawai4 = new RunApps(new PegawaiHarian("Andika", "350728490327424892345", 10000, 45));
        System.out.print("\n");

        RunApps pegawai5 = new RunApps(new Sales("Akbar", "350728490327424892346", 48, 35000));
    }
}