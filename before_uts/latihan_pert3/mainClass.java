package before_uts.latihan_pert3;

public class mainClass {
    public static void main(String [] args) {

        belajarmodifier1 modifi1 = new belajarmodifier1();
        modifi1.nama = "Budi";

        belajarmodifier2 modifi2 = new belajarmodifier2();
        //modifi2.nama = "Budi";

        belajarmodifier3 modifi = new belajarmodifier3();
        modifi.nilai1 = 20;
        modifi.nilai2 = 2;
        System.out.println(modifi.getTambah());
    }
}