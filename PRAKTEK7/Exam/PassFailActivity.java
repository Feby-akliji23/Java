package Exam;
public class PassFailActivity extends GradedActivity {//Feby Akliji Rofiah - A11.2022.14529
    private double minimumPassingScore; // Nilai minimal untuk lulus

    // Konstruktor menerima nilai minimal untuk lulus
    public PassFailActivity(double min) {
        minimumPassingScore = min; // Inisialisasi nilai minimal untuk lulus
    }

    // Override metode untuk mendapatkan nilai huruf
   
    public char getGrade() {
        if (getScore() >= minimumPassingScore)
            return 'P'; // Mengembalikan 'P' jika nilai lebih besar dari atau sama dengan nilai minimal untuk lulus
        else
            return 'F'; // Mengembalikan 'F' jika tidak
    }
}
