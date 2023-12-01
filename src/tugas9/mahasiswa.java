package tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class mahasiswa extends JFrame {
    private JTextField tfnama;
    private JComboBox tanggal;
    private JPanel panel;
    private JComboBox bulan;
    private JComboBox tahun;
    private JTextArea taalamat;
    private JButton submit;
    private JTextArea textAreanama;
    private JTextArea textAreattl;
    private JTextArea textAreaalamat;
    private JTextArea usia;
    public mahasiswa() {
        this.setContentPane(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfnama.getText();
                int tltanggal = Integer.parseInt((String) tanggal.getSelectedItem());
                int tlbulan = bulan.getSelectedIndex()+1;
                int tltahun = Integer.parseInt ((String) tahun.getSelectedItem());
                String alamat = taalamat.getText();

                textAreanama.setText("Nama          :" + " " + nama);
                textAreattl.setText("Tanggal Lahir          :" + " " + tltanggal + " " + tlbulan + " " + tltahun);
                textAreaalamat.setText("Alamat          :" + " " + alamat);
                LocalDate birthdate = LocalDate.of(tltahun, tlbulan, tltanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                usia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String [] args) {
    mahasiswa mahasiswa = new mahasiswa();
    mahasiswa.setVisible(true);
    }
}