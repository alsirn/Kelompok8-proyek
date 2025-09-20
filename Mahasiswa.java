public class Mahasiswa {
    public String nim;
    public String nama;
    public String prodi;
    public int angkatan;

    public Mahasiswa(String nim, String nama, String prodi, int angkatan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.angkatan = angkatan;
    }

    public void showMahasiswa(){
        System.out.println( "Nim : " + this.nim);
        System.out.println( "Nama : " + this.nama);
        System.out.println( "Prodi : " + this.prodi);
        System.out.println( "Angkatan : " + this.angkatan);
    }
}
