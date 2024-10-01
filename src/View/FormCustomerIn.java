/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import repository.*;
import java.awt.Dimension;
import static java.awt.Frame.NORMAL;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class FormCustomerIn extends javax.swing.JFrame {

    //Referncae Variabel
    private DefaultTableModel tableModel;
    private List<Room> dataComboBoxRoom = new ArrayList<>();
    private FromCustomerOut fromCustomerOut;
//    RoomCRUD_list service1;
//    int index;
//    int tag = 0;

    /**
     * Creates new form FromCustomerOut
     */
    /**
     * Creates new form FormCustomerIn
     */
    public FormCustomerIn() {
        initComponents();
//        save();
//        service = new GuestCRUD();
//        service1 = new RoomCRUD();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();

        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }

        this.setLocation(
                (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        
        this.fromCustomerOut = new FromCustomerOut();

    }

    //Referncae this.Variabel
    public FormCustomerIn(FromCustomerOut fromCustomerOut) {
        this.fromCustomerOut = fromCustomerOut;
    }


    //Method multi insert data guest, room, dan reservasi
    private void saveReservasi() {
        try {

//            // Ambil data Guest
            int guestId = Integer.parseInt(txtID.getText().toString());
            String name = txtNama.getText();
            int noHp = Integer.parseInt(txtNo.getText());
            String addres = txtAlamat.getText();
            String country = txtNegara.getText();
            String gender = jk.getSelectedItem().toString();
            
            //simpan dalam list guest
            Guest guest = new Guest(guestId, name, noHp, addres, country, gender);
            boolean guestSuccess = GuestRepo.insert(guest);

            // Ambil data Room
            int roomId = Integer.valueOf(jNoRoom.getSelectedItem().toString());
            String type = jType.getSelectedItem().toString();
            double price = Double.valueOf(txtHarga.getText());
            List<Room> rooms = RoomRepo.getByType(type);

            // Ambil data Reservasi
            int id = Integer.parseInt(idRes.getText());
            String tglCheckin = (tglCheckInDay.getText()+"-"+tglCheckInMonth.getText()+"-"+tglCheckInYear.getText());
            double jumlahBayar = Double.parseDouble(txtJumlahPay.getText());
            String methodeBayar = methodePay.getSelectedItem().toString();
            int totalHari = Integer.parseInt(txtLamaInap.getText());
            int dd = (Integer.valueOf(tglCheckInDay.getText())+totalHari);
            String tglChecekOut = (Integer.toString(dd)+"-"+tglCheckInMonth.getText()+"-"+tglCheckInYear.getText());
            System.out.println(tglChecekOut);
            Reservasi reservasi = new Reservasi(Integer.valueOf(idRes.getText()), Integer.valueOf(txtID.getText()), Integer.valueOf(jNoRoom.getSelectedItem().toString()), tglCheckin, tglChecekOut, jumlahBayar, methodeBayar, totalHari);
            boolean success = ReservasiRepo.insert(reservasi);

            if (guestSuccess && success) {
                JOptionPane.showMessageDialog(this, "Reservasi saved successfully!");
                
//                fromCustomerOut.updateTable(id); // Update the table in AnotherGUI
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save reservasi.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check your data.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }


    //method menghitung harga total dari lama inap x price
    private void calculateTotal() {
        try {
            double harga = Double.parseDouble(txtHarga.getText().trim());
            int lamaInap = Integer.parseInt(txtLamaInap.getText().trim());
            double total = harga * lamaInap;
            txtJumlahPay.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            // Handle potential parse exceptions
            txtJumlahPay.setText("Invalid input");
        }
    }
    
    //Method menghapus semua inputan
     private void clearFields() {
        idRes.setText("");
        tglCheckInDay.setText("");
        tglCheckInMonth.setText("");
        tglCheckInYear.setText("");
        txtAlamat.setText("");
        txtHarga.setText("");
        txtID.setText("");
        txtJumlahPay.setText("");
        txtLamaInap.setText("");
        txtNama.setText("");
        txtNegara.setText("");
        txtNo.setText("");
        jNoRoom.setSelectedIndex(0);
        jType.setSelectedIndex(0);
        jk.setSelectedIndex(0);
        methodePay.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mangeRoom = new javax.swing.JButton();
        C_CheckOut = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtNo = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        bookNow = new javax.swing.JButton();
        txtNama = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        txtAlamat = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtNegara = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jk = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tglCheckInDay = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        methodePay = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtJumlahPay = new java.awt.TextField();
        clear = new javax.swing.JButton();
        txtLamaInap = new java.awt.TextField();
        jLabel14 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();
        jNoRoom = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        idRes = new java.awt.TextField();
        tglCheckInMonth = new java.awt.TextField();
        tglCheckInYear = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        C_CheckIN = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mangeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/manage room.png"))); // NOI18N
        mangeRoom.setText("Manage Room");
        mangeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangeRoomActionPerformed(evt);
            }
        });
        getContentPane().add(mangeRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 11, 145, 43));

        C_CheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/Customer Check Out.png"))); // NOI18N
        C_CheckOut.setText("Customer Check-Out");
        C_CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(C_CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 11, 145, 43));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/exit.png"))); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 11, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/6479339.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No Identitas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 12, -1, 24));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 46, 294, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nama Lengkap");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, -1, 24));
        jPanel1.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 189, 294, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nomer Hp");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 155, -1, 24));

        bookNow.setBackground(new java.awt.Color(255, 255, 0));
        bookNow.setText("Book Now !");
        bookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowActionPerformed(evt);
            }
        });
        jPanel1.add(bookNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 316, 98, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 117, 294, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 227, -1, 24));
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 261, 294, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 371, -1, 24));
        jPanel1.add(txtNegara, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 333, 294, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Negara");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 299, -1, 24));

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Laki-laki", "Perempuan" }));
        jPanel1.add(jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 401, 153, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nomor Kamar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 12, -1, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Type Kamar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 85, -1, 24));

        jType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Type Kamar", "Deluxe", "Standard", "Exclusive" }));
        jType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(jType, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 115, 191, 29));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Harga");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 155, -1, 24));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Check In (Today)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 11, -1, 24));

        tglCheckInDay.setText("dd");
        tglCheckInDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglCheckInDayActionPerformed(evt);
            }
        });
        jPanel1.add(tglCheckInDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 45, 60, 28));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Methode Pembayaran");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 83, -1, 24));

        methodePay.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        methodePay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Methode", "Tunai", "Non Tunai" }));
        methodePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodePayActionPerformed(evt);
            }
        });
        jPanel1.add(methodePay, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 113, 191, 29));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Jumlah Bayar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 227, -1, 24));

        txtJumlahPay.setText("...");
        jPanel1.add(txtJumlahPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 261, 294, 28));

        clear.setBackground(new java.awt.Color(255, 0, 0));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 316, 98, -1));

        txtLamaInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLamaInapActionPerformed(evt);
            }
        });
        txtLamaInap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLamaInapKeyTyped(evt);
            }
        });
        jPanel1.add(txtLamaInap, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 189, 294, 28));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Hari");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 155, -1, 24));

        txtHarga.setText("...");
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 189, 294, 28));

        jNoRoom.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jNoRoom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jNoRoomItemStateChanged(evt);
            }
        });
        jPanel1.add(jNoRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 45, 277, 29));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Id Reservasi");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 227, -1, 24));
        jPanel1.add(idRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 261, 294, 28));

        tglCheckInMonth.setText("mm");
        jPanel1.add(tglCheckInMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 45, 60, 28));

        tglCheckInYear.setText("yyyy");
        jPanel1.add(tglCheckInYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 45, 83, 28));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/all pages background.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1000, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 86, -1, -1));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/logout.png"))); // NOI18N
        Logout.setText("Log Out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 11, 100, 40));

        C_CheckIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/Customer Registration & Check IN.png"))); // NOI18N
        C_CheckIN.setText("Customer Check-In");
        C_CheckIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CheckINActionPerformed(evt);
            }
        });
        getContentPane().add(C_CheckIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 11, 145, 43));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel Images & Icon/home.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowActionPerformed
        saveReservasi();
        
        //Main Object Method Interface
        GuestRepo Guest = new GuestRepo();
        Guest.ToString();
        
        ReservasiRepo Reservasi = new ReservasiRepo();
        Reservasi.ToString();
    }//GEN-LAST:event_bookNowActionPerformed

    private void methodePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodePayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_methodePayActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int kembali = JOptionPane.showConfirmDialog(null, "Anda akan LogOut?", "Question", JOptionPane.YES_NO_OPTION);
        if (kembali == 0) {
            FormReservasi beck = new FormReservasi();
            beck.setVisible(true);
            this.dispose();
        } else {
            return;

        }
    }//GEN-LAST:event_exitActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Anda akan Kembali?", "Question", JOptionPane.YES_NO_OPTION);
        if (keluar == 0) {
            Login1 exit = new Login1();
            exit.setVisible(true);
            this.dispose();
        } else {
            return;

        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void jTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTypeItemStateChanged
        //Main object polimorfisme di class reservasi
        
        String type = jType.getSelectedItem().toString();
        Deluxe dx = new Deluxe(0, "", 0.0);
        Standard st = new Standard(0, "", 0.0);
        Exclusive ex = new Exclusive(0, "", 0.0);

        if (type == "Deluxe") {
            txtHarga.setText(String.valueOf(dx.getPrice()));
        } else if (type == "Standard") {
            txtHarga.setText(String.valueOf(st.getPrice()));
        } else if (type == "Exclusive") {
            txtHarga.setText(String.valueOf(ex.getPrice()));
        }

        this.dataComboBoxRoom = RoomRepo.getByType(type);
//        masukin ke combobox datanya jNoRoom
        jNoRoom.removeAllItems();
        for (Room room : dataComboBoxRoom) {
            jNoRoom.addItem(String.valueOf(room.getId()));
        }

        if (dataComboBoxRoom.isEmpty()) {
            jNoRoom.addItem("No rooms available");
        }
    }//GEN-LAST:event_jTypeItemStateChanged

    private void jNoRoomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jNoRoomItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jNoRoomItemStateChanged

    private void C_CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CheckOutActionPerformed
        FromCustomerOut next = new FromCustomerOut();
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_C_CheckOutActionPerformed

    private void mangeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangeRoomActionPerformed
        FormRoom next = new FormRoom();
        next.setVisible(true);
        this.dispose();
     }//GEN-LAST:event_mangeRoomActionPerformed

    private void C_CheckINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CheckINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_CheckINActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_clearActionPerformed

    private void txtLamaInapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLamaInapKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLamaInapKeyTyped

    private void txtLamaInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLamaInapActionPerformed
        calculateTotal();
    }//GEN-LAST:event_txtLamaInapActionPerformed

    private void tglCheckInDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglCheckInDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglCheckInDayActionPerformed

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
            java.util.logging.Logger.getLogger(FormCustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCustomerIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_CheckIN;
    private javax.swing.JButton C_CheckOut;
    private javax.swing.JButton Logout;
    private javax.swing.JButton bookNow;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private java.awt.TextField idRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jNoRoom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jType;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JButton mangeRoom;
    private javax.swing.JComboBox<String> methodePay;
    private java.awt.TextField tglCheckInDay;
    private java.awt.TextField tglCheckInMonth;
    private java.awt.TextField tglCheckInYear;
    private java.awt.TextField txtAlamat;
    private javax.swing.JLabel txtHarga;
    private java.awt.TextField txtID;
    private java.awt.TextField txtJumlahPay;
    private java.awt.TextField txtLamaInap;
    private java.awt.TextField txtNama;
    private java.awt.TextField txtNegara;
    private java.awt.TextField txtNo;
    // End of variables declaration//GEN-END:variables
}
