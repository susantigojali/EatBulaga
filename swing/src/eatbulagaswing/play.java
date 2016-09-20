package eatbulagaswing;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import eatbulaga.*;

public class play extends javax.swing.JFrame {
    
    private List<Mahasiswa> mhs;
    private List<Kategori> listKategori;
    private List<Pertanyaan> listPertanyaan;
    private Pertanyaan question;
    private int idxAttr;
    private String soal; // Nama yang harus ditebak
    
    public play() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        soal = chooseplayer.nama; 
        MySQLAccess db = new MySQLAccess();
        mhs = db.getMahasiswa(); // Mengambil seluruh list mahasiswa
        listKategori = db.getKategori(); // Mengambil seluruh list kategori
        listPertanyaan = new ArrayList<>();
        
        // Random pilih atribut mahasiswa
        Random rand=new Random();
        question = new Pertanyaan("a","a","a");
        do{
            do{
                idxAttr=rand.nextInt(16);
            }while(idxAttr==9);

            // Membuat pertanyaan
            question.random(listKategori, mhs, idxAttr);
        }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
        listPertanyaan.add(question);

        jTextField1.setText(question.toPrint());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EAT BULAGA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(417, 309));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/YES.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/YES MOUSE.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/playagain.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("KG Drops of Jupiter", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.setMaximumSize(new java.awt.Dimension(450, 30));
        jTextField1.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/NO.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/NO MOUSE.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/MAYBE.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/MAYBE MOUSE.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eatbulagaswing/exit1.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Tombol ya
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        question.setJawaban("y");
        
        // Decrease and Conquer
        List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
        mhs=newmhs;
        
        if(mhs.size()>1)
        {
            // Membuat pertanyaan baru
            Random rand=new Random();
            question = new Pertanyaan("a","a","a");
            do{
                do{
                    idxAttr=rand.nextInt(16);
                }while(idxAttr==9);

                // Membuat pertanyaan
                question.random(listKategori, mhs, idxAttr);
            }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
            listPertanyaan.add(question);

            jTextField1.setText(question.toPrint());
        }
        else 
        {
            if(mhs.size()==1)
            {
                if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                {
                    jTextField1.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                }
                else
                {
                    jTextField1.setText("Anda salah memberikan kriteria!!");
                }
            }
            else
            {
                jTextField1.setText("Tidak ada orang dengan kriteria tersebut!!");
            }
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Tombol tidak
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        question.setJawaban("t");
        
        // Decrease and Conquer
        List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
        mhs=newmhs;
        
        if(mhs.size()>1)
        {
            // Membuat pertanyaan baru
            Random rand=new Random();
            question = new Pertanyaan("a","a","a");
            do{
                do{
                    idxAttr=rand.nextInt(16);
                }while(idxAttr==9);

                // Membuat pertanyaan
                question.random(listKategori, mhs, idxAttr);
            }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
            listPertanyaan.add(question);

            jTextField1.setText(question.toPrint());
        }
        else 
        {
            if(mhs.size()==1)
            {
                if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                {
                    jTextField1.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                }
                else
                {
                    jTextField1.setText("Anda salah memberikan kriteria!!");
                }
            }
            else
            {
                jTextField1.setText("Tidak ada orang dengan kriteria tersebut!!");
            }
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Tombol bisa jadi
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        question.setJawaban("b");
        
        // Decrease and Conquer
        List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
        mhs=newmhs;
        
        if(mhs.size()>1)
        {
            // Membuat pertanyaan baru
            Random rand=new Random();
            question = new Pertanyaan("a","a","a");
            do{
                do{
                    idxAttr=rand.nextInt(16);
                }while(idxAttr==9);

                // Membuat pertanyaan
                question.random(listKategori, mhs, idxAttr);
            }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
            listPertanyaan.add(question);

            jTextField1.setText(question.toPrint());
        }
        else 
        {
            if(mhs.size()==1)
            {
                if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                {
                    jTextField1.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                }
                else
                {
                    jTextField1.setText("Anda salah memberikan kriteria!!");
                }
            }
            else
            {
                jTextField1.setText("Tidak ada orang dengan kriteria tersebut!!");
            }
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Tombol Play Again
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        int x = this.getX();
        int y = this.getY();
        MenuUtama.cp.pack();
        MenuUtama.cp.setLocation(x, y);
        MenuUtama.cp.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    // Tombol Exit
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new play().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
