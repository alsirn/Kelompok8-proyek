public class showMahasiswa {
    
    public static void main(String[] args){
        //membuat beberapa objek data mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2403007", "Amalia Lutviani", "Teknik Informatika", 2024);
        Mahasiswa mhs2 = new Mahasiswa("2404031", "Nazwa Aulia", "Perancangan Munufaktur", 2024);

        //menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        mhs1.showMahasiswa();
        mhs2.showMahasiswa();

    }
}
