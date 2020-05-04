public class Main {
    public static void main(String[] args) {
        Naisu mahasiswa1 = new Naisu();
        Naisu mahasiswa2 = new Naisu();

        mahasiswa1.KampusData();
        mahasiswa1.DataPribadi();
        mahasiswa1.userName = "Dhafin";
        mahasiswa1.nilai = 100;

        System.out.println(mahasiswa1.nilai);
        mahasiswa1.Punch(mahasiswa2);
        System.out.println(mahasiswa1.nilai);
    }
}
