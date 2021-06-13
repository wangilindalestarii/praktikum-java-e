package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {

    public static void main(String[] args) throws ParseException {

        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs2.npm = "19631063";
        mhs2.nama = "Wangi";
        mhs2.tanggalLahir = formatTanggal.parse("04-07-2001");

        mhs2.tampilkanIdentitasDiri();

    }
}
