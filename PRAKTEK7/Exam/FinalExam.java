package Exam;
public class FinalExam extends GradedActivity {//Feby Akliji Rofiah - A11.2022.14529
    private int numberOfQuestions; // Jumlah pertanyaan dalam ujian
    private int numberMissed; // Jumlah jawaban yang salah dalam ujian
    private double pointsPerQuestion; // Nilai per pertanyaan

    // Konstruktor menerima jumlah pertanyaan dan jumlah salah
    public FinalExam(int questions, int missed) {
        numberOfQuestions = questions; // Inisialisasi jumlah pertanyaan
        numberMissed = missed; // Inisialisasi jumlah jawaban yang salah
        pointsPerQuestion = 100.0 / numberOfQuestions; // Menghitung nilai per pertanyaan
        double numericScore = 100.0 - (numberMissed * pointsPerQuestion); // Menghitung nilai numerik
        setScore(numericScore); // Menetapkan nilai
    }

    // Metode untuk mendapatkan nilai per pertanyaan
    public double getPointsPerQuestion() {
        return pointsPerQuestion; // Mengembalikan nilai per pertanyaan
    }

    // Metode untuk mendapatkan jumlah jawaban yang salah
    public int getNumberMissed() {
        return numberMissed; // Mengembalikan jumlah jawaban yang salah
    }
}
