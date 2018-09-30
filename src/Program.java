
import com.sun.org.apache.xpath.internal.operations.Plus;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Program extends javax.swing.JFrame {

    public Program() {
        initComponents();
        prikaziSve();
        inicijalizujKomponente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnSacuvaj = new javax.swing.JButton();
        txtKomentar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textFieldPretraga = new javax.swing.JTextField();
        btnPretraga = new javax.swing.JButton();
        btnOcistiPretragu = new javax.swing.JButton();
        btnPrikaziSve = new javax.swing.JButton();
        btnPretraga1 = new javax.swing.JButton();
        btnPretraga2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proizvodjac", "Tip", "Proizvod", "Oznaka", "Stampaci", "Kolicina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Komentar", "Datum"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        txtKomentar.setToolTipText("Komentar");

        jLabel1.setText("Proizvodjac");

        jLabel2.setText("Tip");

        jLabel3.setText("Proizvod");

        jLabel4.setText("Oznaka");

        jLabel5.setText("Stampaci");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton1.setText("Ocisti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Komentar");

        textFieldPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPretragaActionPerformed(evt);
            }
        });

        btnPretraga.setText("Pretrazi proizvod");
        btnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaActionPerformed(evt);
            }
        });

        btnOcistiPretragu.setText("Ocisti sve");
        btnOcistiPretragu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPretraguActionPerformed(evt);
            }
        });

        btnPrikaziSve.setText("Prikazi sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        btnPretraga1.setText("Pretrazi oznaku");
        btnPretraga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraga1ActionPerformed(evt);
            }
        });

        btnPretraga2.setText("Pretrazi stampac");
        btnPretraga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraga2ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pretraga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1548, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSacuvaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKomentar))
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(124, 124, 124)
                                .addComponent(btnPretraga))
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrikaziSve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldPretraga)
                            .addComponent(btnPretraga1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOcistiPretragu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPretraga2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzmeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plus)
                            .addComponent(minus)
                            .addComponent(btnSacuvaj)
                            .addComponent(txtKomentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPretraga)
                            .addComponent(btnPretraga1)
                            .addComponent(btnPretraga2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrikaziSve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOcistiPretragu)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnIzmeni)
                    .addComponent(btnObrisi)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        int i = Integer.parseInt(jTextField6.getText()) + 1;
        jTextField6.setText(Integer.toString(i));
    }//GEN-LAST:event_plusActionPerformed
    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        int i = Integer.parseInt(jTextField6.getText()) - 1;
        jTextField6.setText(Integer.toString(i));
    }//GEN-LAST:event_minusActionPerformed

    //insert update delete dugmad i dodavanje komentara
    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        int i = jTable1.getSelectedRow();
        //TableModel model = jTable1.getModel();  //nisam siguran zasto sam ovo pisao
        //String b = model.getValueAt(i, 0).toString();//ni ovo
        String query = "INSERT INTO `zeleznica`.`toneri` (`proizvodjac`, tip, `proizvod`, `oznaka`, `stampaci`, `kolicina`) VALUES ('" + jTextField1.getText() + "','" + jTextField2.getText() + "', '" + jTextField3.getText() + "', '" + jTextField4.getText() + "', '" + jTextField5.getText() + "', '" + jTextField6.getText() + "');";
        executeSQlQuery(query, "Inserted");
        prikaziSve();


    }//GEN-LAST:event_btnDodajActionPerformed

	private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = jTable1.getSelectedRow();
            String b = model.getValueAt(i, 0).toString();
            //txtKomentar.setText(b);

            String query = "UPDATE toneri SET "
                    + "`proizvodjac` = '" + jTextField1.getText() + "', "
                    + "tip = '" + jTextField2.getText() + "',  "
                    + "`proizvod` = '" + jTextField3.getText() + "', "
                    + "`oznaka` = '" + jTextField4.getText() + "', "
                    + "`stampaci` = '" + jTextField5.getText() + "' "
                    + "WHERE `toneriid` = " + b;
            executeSQlQuery(query, "Inserted");
            jTable1.setRowSelectionInterval(i, i);
    }//GEN-LAST:event_btnIzmeniActionPerformed

	private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
            // TODO add your handling code here:
            //String query = "INSERT INTO `users`(`fname`, `lname`, `age`) VALUES ('" + jTextField_FirstName.getText() + "','" + jTextField_LastName.getText() + "'," + jTextField_Age.getText() + ")";
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int i = jTable1.getSelectedRow();
            String b = model.getValueAt(i, 0).toString();
            //txtKomentar.setText(b);

            String query = "delete from toneri where toneriid = " + b;
            executeSQlQuery(query, "Inserted");
            jTable1.setRowSelectionInterval(i, i);
    }//GEN-LAST:event_btnObrisiActionPerformed

	private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
            int i = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();
            String b = model.getValueAt(i, 0).toString();

            String query1 = "UPDATE toneri SET `kolicina` = " + jTextField6.getText() + " where toneriid = " + b;

            String query2 = "INSERT INTO komentari (`toneriid`, `Komentar`, `DatumIzmene`) "
                    + "VALUES ("
                    + "'" + b + "', '" + txtKomentar.getText() + "', NOW());";

            executeSQlQuery(query1, "Izmenjeno");
            executeSQlQuery(query2, "Ubaceno");
            jTable1.setRowSelectionInterval(i, i);
            prikaziKomentare();

    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ocistiSve();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaActionPerformed
        // TODO add your handling code here:
        pretragaProizvod();
    }//GEN-LAST:event_btnPretragaActionPerformed

    private void textFieldPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPretragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPretragaActionPerformed

    private void btnOcistiPretraguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPretraguActionPerformed
        textFieldPretraga.setText(null);
    }//GEN-LAST:event_btnOcistiPretraguActionPerformed

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        // TODO add your handling code here:
        prikaziSve();
    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    private void btnPretraga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraga1ActionPerformed
        // TODO add your handling code here:
        pretragaOznaka();
    }//GEN-LAST:event_btnPretraga1ActionPerformed

    private void btnPretraga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraga2ActionPerformed
        // TODO add your handling code here:
        pretragaStampac();
    }//GEN-LAST:event_btnPretraga2ActionPerformed

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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }
//

    public ArrayList<Toneri> getStampac() {
        ArrayList<Toneri> stampaciList = new ArrayList<Toneri>();
        Connection connection = getKonekcija();

        String query2 = "SELECT toneriid, ifnull(proizvodjac, '/'), ifnull(tip, '/'), ifnull(proizvod, '/'), ifnull(oznaka, '/'), ifnull(stampaci, '/'), ifnull(kolicina, '0') from toneri order by proizvodjac asc;";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query2);
            Toneri stampaci;
            while (rs.next()) {
                stampaci = new Toneri(rs.getInt("toneriid"), rs.getString("ifnull(proizvodjac, '/')"), rs.getString("ifnull(tip, '/')"), rs.getString("ifnull(proizvod, '/')"), rs.getString("ifnull(oznaka, '/')"), rs.getString("ifnull(stampaci, '/')"), rs.getInt("ifnull(kolicina, '0')"));
                stampaciList.add(stampaci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stampaciList;
    }

    public void pretragaProizvod() {
        ArrayList<Toneri> list = getPretragaProizvod();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStampacID();
            row[1] = list.get(i).getProizvodjac();
            row[2] = list.get(i).getTip();
            row[3] = list.get(i).getProizvod();
            row[4] = list.get(i).getOznaka();
            row[5] = list.get(i).getStampaci();
            row[6] = list.get(i).getKolicina();

            model.addRow(row);
            //
        }
    }

    public ArrayList<Toneri> getPretragaProizvod() {
        ArrayList<Toneri> stampaciList = new ArrayList<Toneri>();
        Connection connection = getKonekcija();

        String query = "SELECT toneriid, ifnull(proizvodjac, '/'), ifnull(tip, '/'), ifnull(proizvod, '/'), ifnull(oznaka, '/'), ifnull(stampaci, '/'), ifnull(kolicina, '0') from toneri where proizvod like '%" + textFieldPretraga.getText() + "%';";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Toneri stampaci;
            while (rs.next()) {
                stampaci = new Toneri(rs.getInt("toneriid"), rs.getString("ifnull(proizvodjac, '/')"), rs.getString("ifnull(tip, '/')"), rs.getString("ifnull(proizvod, '/')"), rs.getString("ifnull(oznaka, '/')"), rs.getString("ifnull(stampaci, '/')"), rs.getInt("ifnull(kolicina, '0')"));
                stampaciList.add(stampaci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stampaciList;
    }

    //
    public void pretragaOznaka() {
        ArrayList<Toneri> list = getPretragaOznaka();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStampacID();
            row[1] = list.get(i).getProizvodjac();
            row[2] = list.get(i).getTip();
            row[3] = list.get(i).getProizvod();
            row[4] = list.get(i).getOznaka();
            row[5] = list.get(i).getStampaci();
            row[6] = list.get(i).getKolicina();

            model.addRow(row);
            //
        }
    }

    public ArrayList<Toneri> getPretragaOznaka() {
        ArrayList<Toneri> stampaciList = new ArrayList<Toneri>();
        Connection connection = getKonekcija();

        String query = "SELECT toneriid, ifnull(proizvodjac, '/'), ifnull(tip, '/'), ifnull(proizvod, '/'), ifnull(oznaka, '/'), ifnull(stampaci, '/'), ifnull(kolicina, '0') from toneri where oznaka like '%" + textFieldPretraga.getText() + "%';";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Toneri stampaci;
            while (rs.next()) {
                stampaci = new Toneri(rs.getInt("toneriid"), rs.getString("ifnull(proizvodjac, '/')"), rs.getString("ifnull(tip, '/')"), rs.getString("ifnull(proizvod, '/')"), rs.getString("ifnull(oznaka, '/')"), rs.getString("ifnull(stampaci, '/')"), rs.getInt("ifnull(kolicina, '0')"));
                stampaciList.add(stampaci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stampaciList;
    }

    //
    public void pretragaStampac() {
        ArrayList<Toneri> list = getPretragaStampac();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStampacID();
            row[1] = list.get(i).getProizvodjac();
            row[2] = list.get(i).getTip();
            row[3] = list.get(i).getProizvod();
            row[4] = list.get(i).getOznaka();
            row[5] = list.get(i).getStampaci();
            row[6] = list.get(i).getKolicina();

            model.addRow(row);
            //
        }
    }

    public ArrayList<Toneri> getPretragaStampac() {
        ArrayList<Toneri> stampaciList = new ArrayList<Toneri>();
        Connection connection = getKonekcija();

        String query = "SELECT toneriid, ifnull(proizvodjac, '/'), ifnull(tip, '/'), ifnull(proizvod, '/'), ifnull(oznaka, '/'), ifnull(stampaci, '/'), ifnull(kolicina, '0') from toneri where stampaci like '%" + textFieldPretraga.getText() + "%';";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Toneri stampaci;
            while (rs.next()) {
                stampaci = new Toneri(rs.getInt("toneriid"), rs.getString("ifnull(proizvodjac, '/')"), rs.getString("ifnull(tip, '/')"), rs.getString("ifnull(proizvod, '/')"), rs.getString("ifnull(oznaka, '/')"), rs.getString("ifnull(stampaci, '/')"), rs.getInt("ifnull(kolicina, '0')"));
                stampaciList.add(stampaci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stampaciList;
    }

    public void prikaziSve() {
        ArrayList<Toneri> list = getStampac();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStampacID();
            row[1] = list.get(i).getProizvodjac();
            row[2] = list.get(i).getTip();
            row[3] = list.get(i).getProizvod();
            row[4] = list.get(i).getOznaka();
            row[5] = list.get(i).getStampaci();
            row[6] = list.get(i).getKolicina();

            model.addRow(row);
        }
    }

    public Connection getKonekcija() {
        try {

            Connection konekcija = DriverManager.getConnection("jdbc:mysql://localhost/zeleznica", "root", "root");
            return konekcija;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ArrayList<Komentari> getKomentar() {
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String b = model.getValueAt(i, 0).toString();

        ArrayList<Komentari> komentariList = new ArrayList<Komentari>();
        Connection connection = getKonekcija();

        String query = "select komentar, DATE_FORMAT(datumizmene,'%d.%m.%Y') FROM  komentari where toneriid = " + b + " order by komentariid desc";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Komentari komentari;
            while (rs.next()) {
                komentari = new Komentari(rs.getString("Komentar"), rs.getString("DATE_FORMAT(datumizmene,'%d.%m.%Y')"));
                komentariList.add(komentari);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return komentariList;
    }

    //  
    public void prikaziKomentare() {
        ArrayList<Komentari> list = getKomentar();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getKomentar();
            row[1] = list.get(i).getDatum();
            model.addRow(row);
        }
    }

    public void executeSQlQuery(String query, String message) {
        Connection con = getKonekcija();
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                prikaziSve();
                JOptionPane.showMessageDialog(null, "Data " + message + " uspesno");
            } else {
                JOptionPane.showMessageDialog(null, "Doslo je do neke greske. " + message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        ocistiSve(); //da ne prikazuje podatke koji su ostali u bufferu

        jTextField1.setText(model.getValueAt(i, 1).toString());
        jTextField2.setText(model.getValueAt(i, 2).toString());
        jTextField3.setText(model.getValueAt(i, 3).toString());
        //pokusaj
        if (model.getValueAt(i, 4).toString().equals("")) {
            jTextField4.setText("/");
        } else {
            jTextField4.setText(model.getValueAt(i, 4).toString());
        }
        jTextField5.setText(model.getValueAt(i, 5).toString());
        jTextField6.setText(model.getValueAt(i, 6).toString());
        prikaziKomentare();
    }

    public void ocistiSve() {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPretragu;
    private javax.swing.JButton btnPretraga;
    private javax.swing.JButton btnPretraga1;
    private javax.swing.JButton btnPretraga2;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton minus;
    private javax.swing.JButton plus;
    private javax.swing.JTextField textFieldPretraga;
    private javax.swing.JTextField txtKomentar;
    // End of variables declaration//GEN-END:variables

    private void inicijalizujKomponente() {
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });
    }
}
