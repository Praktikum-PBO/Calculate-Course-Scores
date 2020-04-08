import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormInput extends JFrame {
    // Deklarasi masing-masing komponen
    private JLabel lNIM, lName, lCourses1, lScore1, lCourses2, lScore2, lException;
    private JTextField tfNIM, tfName, tfCourses1, tfScore1, tfCourses2, tfScore2;
    private JButton bConvert, bReset;

    public void displayForm() {
        // Membuat judul pada Frame
        setTitle("Calculate course scores");
        // Inisialisasi masing-masing komponen
        lNIM = new JLabel("NIM");
        lNIM.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lNIM.setForeground(new Color(236, 240, 241));
        lName = new JLabel("Name");
        lName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lName.setForeground(new Color(236, 240, 241));
        lCourses1 = new JLabel("Courses 1");
        lCourses1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lCourses1.setForeground(new Color(236, 240, 241));
        lScore1 = new JLabel("Score 1");
        lScore1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lScore1.setForeground(new Color(236, 240, 241));
        lCourses2 = new JLabel("Courses 2");
        lCourses2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lCourses2.setForeground(new Color(236, 240, 241));
        lScore2 = new JLabel("Score 2");
        lScore2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lScore2.setForeground(new Color(236, 240, 241));
        tfNIM = new JTextField();
        tfNIM.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfNIM.setForeground(new Color(245, 249, 250));
        tfNIM.setBackground(new Color(108, 122, 137));
        tfName = new JTextField();
        tfName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfName.setForeground(new Color(245, 249, 250));
        tfName.setBackground(new Color(108, 122, 137));
        tfCourses1 = new JTextField();
        tfCourses1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfCourses1.setForeground(new Color(245, 249, 250));
        tfCourses1.setBackground(new Color(108, 122, 137));
        tfScore1 = new JTextField();
        tfScore1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfScore1.setForeground(new Color(245, 249, 250));
        tfScore1.setBackground(new Color(108, 122, 137));
        tfCourses2 = new JTextField();
        tfCourses2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfCourses2.setForeground(new Color(245, 249, 250));
        tfCourses2.setBackground(new Color(108, 122, 137));
        tfScore2 = new JTextField();
        tfScore2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tfScore2.setForeground(new Color(245, 249, 250));
        tfScore2.setBackground(new Color(108, 122, 137));
        bConvert = new JButton("Convert");
        bConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
        bConvert.setForeground(new Color(255, 255, 255));
        bConvert.setBackground(new Color(34, 167, 240));
        bReset = new JButton("Reset");
        bReset.setFont(new Font("Tahoma", Font.BOLD, 14));
        bReset.setForeground(new Color(255, 255, 255));
        bReset.setBackground(new Color(255, 40, 20, 204));
        lException = new JLabel("");
        lException.setFont(new Font("Tahoma", Font.BOLD, 14));
        lException.setForeground(Color.RED);

        // Mengganti warna background pada Frame
        getContentPane().setBackground(new Color(44, 62, 80));

        // Membuat Null Layout
        setLayout(null);
        // Menambahkan masing-masing komponen kedalam Frame
        add(lNIM);
        add(tfNIM);
        add(lName);
        add(tfName);
        add(lCourses1);
        add(tfCourses1);
        add(lScore1);
        add(tfScore1);
        add(lCourses2);
        add(tfCourses2);
        add(lScore2);
        add(tfScore2);
        add(bConvert);
        add(bReset);
        add(lException);

        // Mengatur tata letak setiap komponen
        lNIM.setBounds(40, 30, 80, 30);
        tfNIM.setBounds(127, 33, 170, 25);
        lName.setBounds(40, 65, 80, 30);
        tfName.setBounds(127, 68, 170, 25);
        lCourses1.setBounds(40, 100, 80, 30);
        tfCourses1.setBounds(127, 103, 170, 25);
        lScore1.setBounds(40, 135, 80, 30);
        tfScore1.setBounds(127, 138, 170, 25);
        lCourses2.setBounds(40, 170, 80, 30);
        tfCourses2.setBounds(127, 173, 170, 25);
        lScore2.setBounds(40, 205, 80, 30);
        tfScore2.setBounds(127, 208, 170, 25);
        bReset.setBounds(60, 260, 105, 30);
        bConvert.setBounds(180, 260, 105, 30);
        lException.setBounds(30, 300, 300, 30);

        // Mengatur ukuran dimensi Frame
        setSize(370, 390);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Membuat Action Listener untuk mengambil data dari form ketika button convert di klik
        bConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Membuat objek dari class Convert
                Convert convert = new Convert();
                // Mengambil nilai dari textfield gui lalu dimasukan kedalam variabel
                String NIM = tfNIM.getText();
                String name = tfName.getText();
                String courses1 = tfCourses1.getText();
                String score1 = tfScore1.getText();
                String courses2 = tfCourses2.getText();
                String score2 = tfScore2.getText();

                // Error Handling
                try {
                    // validasi setiap komponen
                    validateData(NIM, name, courses1, score1, courses2, score2);
                    convert.convertData(NIM, name, courses1, score1, courses2, score2);
                } catch (Error exception1) {
                    lException.setText(String.valueOf(exception1));
                } catch (NumberFormatException exception2) {
                    lException.setText("Error : Please enter numbers for Score");
                }
            }
        });

        // Membuat Action Listener untuk mereset semua data dari form ketika button reset di klik
        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengatur setiap komponen menanjadi null
                tfNIM.setText("");
                tfName.setText("");
                tfCourses1.setText("");
                tfScore1.setText("");
                tfCourses2.setText("");
                tfScore2.setText("");
            }
        });
    }

    // Method validasiData
    public void validateData(String NIM, String name, String courses1, String score1, String courses2, String score2) throws Error {
        // Ketika semua input kosong akan masuk if
        if (!(NIM.length() > 0 && name.length() > 0 && courses1.length() > 0 && score1.length() > 0 && courses2.length() > 0 && score2.length() > 0)) {
            throw new Error("          input cannot be empty");
        } // ketika nilai score tidak mencakup 1-100 akanmasuk else if
        else if (!((Float.parseFloat(score1)) <= 0 && (Float.parseFloat(score1)) >= 100 && (Float.parseFloat(score2)) <= 0 && (Float.parseFloat(score2)) >= 100)) {
            throw new Error("Enter numbers (1-100) for Score");
        } else {
            throw new Error("");
        }
    }
}
