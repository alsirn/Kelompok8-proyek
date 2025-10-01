public class showMatkul {
    public static void main(String[] args){
        //membuat beberapa objek data mata kuliah
        Matkul matkul1 = new Matkul("IF101", "Pemrograman Dasar", 3);
        Matkul matkul2 = new Matkul("IF102", "Struktur Data", 4);

        //menampilkan data mata kuliah
        System.out.println("=== Data Mata Kuliah ===");
        System.out.println(matkul1.toString());
        System.out.println(matkul2.toString());
    }
}
