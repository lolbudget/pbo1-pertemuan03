package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Assalamu'alaikum Wr. Wb. Pak\"");
                System.out.println("Dosen : \"Wa'alaikumsalam Wr. Wb.\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa nilai ulun A, Pak?\"");
                System.out.println("Dosen : \"karena Bapak baik, saya kasih semua mahasiswa nilainya A\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Kenapa nilai ulun C, Pak?\"");
                System.out.println("Dosen : \"Maaflah Bapak salah input, seharusnya A\"");
                System.out.println("Mhs   : \"Inggih Pak, Hiihihi\"");
                break;
            default:
                System.out.println("Mhs   : \"Kenapa nilai ulun C, Pak?\"");
                System.out.println("Dosen : \"Nama & NPM?\"");
                System.out.println("Mhs   : \"Mustaqim Noor, NPM 18631043\"");
                System.out.println("Dosen : \"Absensi bagus, Tugas bagus, UTS bagus, UAS bagus, hadang Bapak ganti jadi A\"");
                System.out.println("Mhs   : \"Inggih Pak pak, Tterima kasih\"");
                break;
        }
    }
}
