public class Dosen { //Mendefinisikan class
    public String nama;
    public double nidn;
    public String matkul;

    public Dosen (String nama, double nidn, String matkul){
        this.nama= nama;
        this.nidn= nidn;
        this.matkul= matkul;
    }

    public void showDosen(){
        System.out.println("Nama:" + this.nama);
        System.out.println("NIDN:" + this.nidn);
        System.out.println("Mengajar:" + this.matkul);
    }

    
}