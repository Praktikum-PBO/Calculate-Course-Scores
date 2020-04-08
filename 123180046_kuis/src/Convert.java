public class Convert {
    // Deklasi variabel
    private float average;
    private float score1;
    private float score2;
    private String grades;

    // Membuat method convertData
    // untuk menghitung rata-rata dan menampilkan data ke console
    public void convertData(String NIM, String name, String courses1, String score1, String courses2, String score2) {
        this.score1 = Float.parseFloat(score1);
        this.score2 = Float.parseFloat(score2);
        average = (this.score1 + this.score2) / 2;
        grades = averageValue(average);

        System.out.println("NIM\t\t\t: " + NIM);
        System.out.println("Name\t\t: " + name);
        System.out.println("Courses 1\t: " + courses1);
        System.out.println("Courses 2\t: " + courses2);
        System.out.println("Average\t\t: " + average);
        System.out.println("Grades\t\t: " + grades);
    }

    // Membuat method averageValue
    // untuk menentukan nilai huruf
    private String averageValue(float average) {
        if (average >= 80 && average <= 100) return "A";
        else if (average >= 75 && average < 80) return "B+";
        else if (average >= 65 && average < 75) return "B";
        else if (average >= 60 && average < 65) return "C+";
        else if (average >= 50 && average < 60) return "C";
        else if (average >= 20 && average < 50) return "D";
        else if (average >= 0 && average < 20) return "E";
        else return "Error";
    }
}
