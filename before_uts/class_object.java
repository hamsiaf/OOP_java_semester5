package before_uts;

class Mahasiswa{ // deklarasi class untuk mahasiswa
    //deklarasi atribut
    String nama;
    String npm;
}

class class_object { // main class untuk mencetak data
    public static void main(String [] args){

        //membuat objek mahasiswa1 untuk kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(); 
        mahasiswa1.nama = "Anonim";
        mahasiswa1.npm = "123456";

        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+mahasiswa1.nama);
        System.out.println("NPM : "+mahasiswa1.npm);
    }
}