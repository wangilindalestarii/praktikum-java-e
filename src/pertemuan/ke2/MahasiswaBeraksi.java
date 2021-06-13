package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs.npm = "19631063";
        mhs.nama = "Linda";
        mhs.tanggalLahir = formatTanggal.parse("04-07-2001");

        System.out.println("NPM " + mhs.npm);
        System.out.println("NAMA " + mhs.nama);
        System.out.println("TANGGAL LAHIR " + formatTanggal.format(mhs.tanggalLahir));

        System.out.println("=============================================================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19631063";
        mhs2.nama = "Wangi";
        mhs2.tanggalLahir = formatTanggal.parse("04-07-2001");

        System.out.println("NPM " + mhs2.npm);
        System.out.println("NAMA " + mhs2.nama);
        System.out.println("TANGGAL LAHIR " + formatTanggal.format(mhs2.tanggalLahir));


    }
}
