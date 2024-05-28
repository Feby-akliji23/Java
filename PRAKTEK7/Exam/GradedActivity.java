package Exam;

public class GradedActivity {//Feby Akliji Rofiah - A11.2022.14529
    private double score; // Nilai dari kegiatan tergraduasi
    @SuppressWarnings("unused")
    private String name; // tidak terpakai

    // Konstruktor tanpa parameter
    public GradedActivity() {
        score = 0.0; // Inisialisasi nilai awal
        name = ""; // Inisialisasi nama kegiatan
    }

    // Konstruktor dengan parameter nama
    public GradedActivity(String n) {
        score = 0.0; // Inisialisasi nilai awal
        name = n; // Mengatur nama kegiatan sesuai parameter
    }

    // Metode untuk mengatur nilai
    public void setScore(double s) {
        score = s; // Menetapkan nilai sesuai parameter
    }

    // Metode untuk mendapatkan nilai
    public double getScore() {
        return score; // Mengembalikan nilai
    }

    // Metode untuk mendapatkan nilai huruf
    public char getGrade() {
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 70)
            return 'C';
        else if (score >= 60)
            return 'D';
        else
            return 'F';
    }
}
