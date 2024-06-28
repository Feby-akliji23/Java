/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormNilai;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class FormNilai extends JFrame {
    
    private Object[][] dataTable = null;
    private String[] header = {"NIM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS", 
        "Nilai Akhir", "Nilai Huruf", "Predikat"};

    /**
     * Creates new form FormNilai
     */
    public FormNilai() {
        initComponents();
        setTableModel();
        aktif(true);
        addDocumentListeners();
    }
    
    private void setTableModel() {
        // Set model untuk tabel frmNilai dengan header yang telah didefinisikan
        frmNilai.setModel(new DefaultTableModel(dataTable, header));
    }
    
    private void kosong()
    {   txtNim.setText("");
        txtNama.setText("");
        txtTugas.setText("");
        txtUts.setText("");
        txtUas.setText("");
    }
    
    //mengset aktif tidak isian data
    private void aktif(boolean x)
    {
        txtNim.setEditable(x);
        txtNama.setEditable(x);
        txtTugas.setEditable(x);
        txtUts.setEditable(x);
        txtUas.setEditable(x);
        
        txtAkhir.setEditable(false);
        txtHuruf.setEditable(false);
        txtPredikat.setEditable(false);
        txtFixTugas.setEditable(false);
        txtFixUts.setEditable(false);
        txtFixUas.setEditable(false);
        
    }
    
    private void addDocumentListeners() {
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hitungNilaiAkhir();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hitungNilaiAkhir();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hitungNilaiAkhir();
            }
        };

        txtTugas.getDocument().addDocumentListener(documentListener);
        txtUts.getDocument().addDocumentListener(documentListener);
        txtUas.getDocument().addDocumentListener(documentListener);
    }
    
    private void hitungNilaiAkhir() {
        try {
            double nilaiTugas = parseNilai(txtTugas.getText());
            double nilaiUts = parseNilai(txtUts.getText());
            double nilaiUas = parseNilai(txtUas.getText());

            double nilaiFixTugas = 0.20 * nilaiTugas;
            double nilaiFixUts = 0.35 * nilaiUts;
            double nilaiFixUas = 0.45 * nilaiUas;
            double nilaiAkhir = nilaiFixTugas + nilaiFixUts + nilaiFixUas;

            String nilaiHuruf;
            String predikat;

            if (nilaiAkhir >= 85) {
                nilaiHuruf = "A";
                predikat = "Sangat Memuaskan";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
                predikat = "Memuaskan";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
                predikat = "Cukup";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "D";
                predikat = "Kurang";
            } else {
                nilaiHuruf = "E";
                predikat = "Gagal";
            }

            txtFixTugas.setText(String.format("%.2f", nilaiFixTugas));
            txtFixUts.setText(String.format("%.2f", nilaiFixUts));
            txtFixUas.setText(String.format("%.2f", nilaiFixUas));
            txtAkhir.setText(String.format("%.2f", nilaiAkhir));
            txtHuruf.setText(nilaiHuruf);
            txtPredikat.setText(predikat);

        } catch (IllegalArgumentException e) {
            txtFixTugas.setText("");
            txtFixUts.setText("");
            txtFixUas.setText("");
            txtAkhir.setText("");
            txtHuruf.setText("");
            txtPredikat.setText("");
        }
    }

    // Method untuk parsing nilai dengan pengecekan
    private double parseNilai(String nilai) throws IllegalArgumentException {
        if (nilai.isEmpty()) {
            return 0;
        }
        try {
            double parsedNilai = Double.parseDouble(nilai);
            if (parsedNilai < 0 || parsedNilai > 100) {
                throw new IllegalArgumentException("Nilai harus antara 0 dan 100");
            }
            return parsedNilai;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input nilai harus berupa angka");
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTugas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUts = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAkhir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHuruf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPredikat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFixTugas = new javax.swing.JTextField();
        txtFixUts = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        frmNilai = new javax.swing.JTable();
        cmdTambah = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtFixUas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Form Nilai");

        jLabel2.setText("NIM");

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama");

        jLabel5.setText("Nilai Tugas");

        jLabel6.setText("Nilai UTS");

        jLabel7.setText("Nilai UAS");

        jLabel8.setText("Nilai Akhir");

        jLabel9.setText("Nilai Huruf");

        jLabel10.setText("Predikat");

        jLabel3.setText("20%       :");

        jLabel11.setText("35%       :");

        jLabel12.setText("45%       :");

        frmNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Nilai Akhir", "Nilai Huruf", "Predikat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(frmNilai);

        cmdTambah.setText("Tambah");
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmdHapus.setText("Hapus");
        cmdHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapusActionPerformed(evt);
            }
        });

        jLabel14.setText("45%       :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdTambah)
                                .addGap(18, 18, 18)
                                .addComponent(cmdHapus))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTugas, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtNim)
                            .addComponent(txtNama)
                            .addComponent(txtUts)
                            .addComponent(txtUas)
                            .addComponent(jLabel12)
                            .addComponent(txtPredikat)
                            .addComponent(txtHuruf)
                            .addComponent(txtAkhir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFixTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFixUts, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFixUas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFixTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFixUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(txtFixUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtPredikat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdTambah)
                    .addComponent(cmdHapus))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        try {
            String nim = txtNim.getText();
            String nama = txtNama.getText();
            
            // Validasi input
            if (nim.isEmpty() || nama.isEmpty() || txtTugas.getText().isEmpty() || txtUts.getText().isEmpty() || txtUas.getText().isEmpty()) {
                throw new IllegalArgumentException("Semua field harus diisi");
            }

            double nilaiTugas = parseNilai(txtTugas.getText());
            double nilaiUts = parseNilai(txtUts.getText());
            double nilaiUas = parseNilai(txtUas.getText());

            double nilaiAkhir = Double.parseDouble(txtAkhir.getText());
            String nilaiHuruf = txtHuruf.getText();
            String predikat = txtPredikat.getText();

            DefaultTableModel model = (DefaultTableModel) frmNilai.getModel();
            model.addRow(new Object[]{nim, nama, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir, nilaiHuruf, predikat});

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) frmNilai.getModel();
        int selectedRow = frmNilai.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Pilih baris yang akan dihapus", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_cmdHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JTable frmNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAkhir;
    private javax.swing.JTextField txtFixTugas;
    private javax.swing.JTextField txtFixUas;
    private javax.swing.JTextField txtFixUts;
    private javax.swing.JTextField txtHuruf;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtPredikat;
    private javax.swing.JTextField txtTugas;
    private javax.swing.JTextField txtUas;
    private javax.swing.JTextField txtUts;
    // End of variables declaration//GEN-END:variables
}
