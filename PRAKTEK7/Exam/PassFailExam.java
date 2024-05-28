package Exam;

public class PassFailExam extends PassFailActivity {//Feby Akliji Rofiah - A11.2022.14529
    private int numberOfQuestions; // Jumlah pertanyaan dalam ujian
    private int numberMissed; // Jumlah jawaban yang salah dalam ujian
    private double pointsPerQuestion; // Nilai per pertanyaan

    // Konstruktor menerima jumlah pertanyaan, jumlah salah, dan nilai minimal untuk lulus
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing); // Memanggil konstruktor kelas induk dengan nilai minimal untuk lulus
        numberOfQuestions = questions; // Inisialisasi jumlah pertanyaan
        numberMissed = missed; // Inisialisasi jumlah jawaban yang salah
        pointsPerQuestion = 100.0 / numberOfQuestions; // Menghitung nilai per pertanyaan
        double numericScore = 100.0 - (numberMissed * pointsPerQuestion); // Menghitung nilai numerik
        setScore(numericScore); // Menetapkan nilai
    }

    // Metode untuk mendapatkan nilai per pertanyaan
    public double getPointsEach() {
        return pointsPerQuestion; // Mengembalikan nilai per pertanyaan
    }

    // Metode untuk mendapatkan jumlah jawaban yang salah
    public int getNumMissed() {
        return numberMissed; // Mengembalikan jumlah jawaban yang salah
    }
}
