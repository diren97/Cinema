
package sinema;

import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;import java.sql.ResultSet;

import javafx.scene.control.ComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;


public class sinemaOtamasyonu extends javax.swing.JFrame {

    private String a ="";
    private double x=0;

    ArrayList ButtonAdlari = new ArrayList();
    public sinemaOtamasyonu() {
        initComponents();
    }
    //bu method buton basılı ise koltuğu ekler
    public void checkNotify(JToggleButton button){
        if(button.isSelected()==true){
            a=a+ button.getText()+ " ";
        }
        //buton seçilmiş şayet seçim kaldırılmışsa siler
        else{
            String yenikoltuk="";
            String[] SandalyeIsmi = a.split(" ");
            for (String sandalyeismi : SandalyeIsmi){
                
                if(sandalyeismi.equals(button.getText())){  
                }else{
                    yenikoltuk= yenikoltuk +sandalyeismi+ " ";      
                }
            }a=yenikoltuk;
            
        }
    }
  //  public ArrayList butonaditutucu (JToggleButton button){
      //  ButtonAdlari.add(button);  
        //return ButtonAdlari;
   // }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filmler = new javax.swing.JComboBox<>();
        seans = new javax.swing.JComboBox<>();
        btnbilet = new javax.swing.JButton();
        jlblSalon = new javax.swing.JLabel();
        salon = new javax.swing.JComboBox<>();
        ogrenci = new javax.swing.JRadioButton();
        tam = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jlblperde = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        tamam = new javax.swing.JButton();
        kisiSayisi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Film:");
        jLabel1.setName("lblFilmler"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Seans:");
        jLabel2.setName("lblSeanslar"); // NOI18N

        filmler.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        filmler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Avengers", "Thor", "Müslüm", "Yıldızlararası", " " }));
        filmler.setName("cbxFilmler"); // NOI18N
        filmler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmlerMouseClicked(evt);
            }
        });
        filmler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmlerActionPerformed(evt);
            }
        });

        seans.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "10:00", "12:45", "15:30", "18:30", "22:00" }));
        seans.setName("cbxSeanslar"); // NOI18N
        seans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seansActionPerformed(evt);
            }
        });

        btnbilet.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnbilet.setText("BİLET KES");
        btnbilet.setName("btnTamam"); // NOI18N
        btnbilet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiletActionPerformed(evt);
            }
        });

        jlblSalon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblSalon.setText("Salon:");
        jlblSalon.setName("lblSalon"); // NOI18N

        salon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Salon1", "Salon2", "Salon3", "Salon4", "Salon5", "Salon6" }));
        salon.setName("cbxSalon"); // NOI18N

        buttonGroup1.add(ogrenci);
        ogrenci.setText("Öğrenci");
        ogrenci.setName("rbtnOgrenci"); // NOI18N
        ogrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciActionPerformed(evt);
            }
        });

        buttonGroup1.add(tam);
        tam.setText("Tam");
        tam.setName("rbtnTam"); // NOI18N

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jlblperde.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlblperde.setText("PERDE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("KAPI");

        jToggleButton1.setText("A1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("A2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("A3");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("A4");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("B1");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("B2");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("B3");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("B4");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setText("C1");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("C2");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("C3");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setText("C4");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setText("D1");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setText("D2");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setText("D3");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setText("D4");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton4)))))
                .addGap(49, 98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton2)
                        .addComponent(jToggleButton3)
                        .addComponent(jToggleButton4))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tamam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tamam.setText("TAMAM");
        tamam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamActionPerformed(evt);
            }
        });

        kisiSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisiSayisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnbilet)
                                .addGap(51, 51, 51)
                                .addComponent(tamam))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 653, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(seans, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(45, 45, 45)
                                            .addComponent(filmler, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(ogrenci)
                                    .addGap(18, 18, 18)
                                    .addComponent(tam)
                                    .addGap(26, 26, 26)
                                    .addComponent(kisiSayisi)))
                            .addComponent(jlblSalon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblperde)
                                .addGap(374, 374, 374))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(filmler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSalon)
                    .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblperde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(seans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogrenci)
                            .addComponent(tam)
                            .addComponent(kisiSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbilet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamam))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seansActionPerformed
  
    }//GEN-LAST:event_seansActionPerformed
 
    String type = null;
    private double fiyat;
    
    private void btnbiletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiletActionPerformed
      if(ogrenci.isSelected()== false && tam.isSelected()== false){
             JOptionPane.showMessageDialog(null, "Müşteri tipi seçmediniz!!");
      }else{
            JOptionPane.showMessageDialog(null, "BİLET KESİLDİ!"); //Bilet kesmek icin uyarı koy. 
      }
    }//GEN-LAST:event_btnbiletActionPerformed

    private void ogrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciActionPerformed

  
    }//GEN-LAST:event_ogrenciActionPerformed

    
    private void tamamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamActionPerformed
        // TODO add your handling code here:
        String uzunluk = kisiSayisi.getText();
        if(uzunluk.length()==0){
            JOptionPane.showMessageDialog(null, "Kişi sayısı giriniz!!");
        }
        else{
               
       if(ogrenci.isSelected()== false && tam.isSelected()== false){
             JOptionPane.showMessageDialog(null, "Müşteri tipi seçmediniz!!");
       }
        else{
        if(ogrenci.isSelected()) {
                fiyat = 15.00;
             
            }else{
                fiyat = 20.00;
            }
            try{
             x=Double.parseDouble(uzunluk);   
                fiyat=hesapla(x);
                //textArea.setText("fiyat:"+fiyat);
            }
            catch(Exception ex) {
				textArea.setText("Düzgün format kullanınız");
				ex.printStackTrace();
			}
        }
     
        
      
        textArea.setText(filmler.getSelectedItem().toString().trim() + "\n" 
                + seans.getSelectedItem().toString().trim() +  "\n"
                + salon.getSelectedItem().toString().trim() + "\n"
                + a +  "\n"
                +"fiyat:"+fiyat)
                ;
      
    }//GEN-LAST:event_tamamActionPerformed
    }
    private double hesapla(double x){
        return  fiyat*x;
        
    }
    
    private void filmlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmlerMouseClicked
  
    }//GEN-LAST:event_filmlerMouseClicked

    private void filmlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmlerActionPerformed
            
        try{
          
            String salonlar=" ";
            String film = " ";
            String seanslar=" ";
            
            int i = filmler.getSelectedIndex();
            ComboBoxModel modelFilm =filmler.getModel();
    
        String filmler1 = modelFilm.getElementAt(i).toString();
            switch(filmler1){
       case "Avengers":
          
           salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------","Salon2", " " }));
           seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "18:30","22:00" ," " }));
           break;
           
       case "Thor":
           salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Salon3"," " }));
           seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "12:45","18:30"," " }));
           break;
           
       case "Müslüm":
           salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Salon1", " " }));
           seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "12:45" ,"22:00"," " }));
           break;
           
       case "Yıldızlararası":
           salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Salon4"," " }));
           seans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "15:30" ,"18:30"," " })); 
           break;
            }} 
        
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                    
    
    }                                       

    }//GEN-LAST:event_filmlerActionPerformed

    private void kisiSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiSayisiActionPerformed
        // TODO add your handling code here:
       
    
    }//GEN-LAST:event_kisiSayisiActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        checkNotify(jToggleButton1);         
          jToggleButton1.setText("A1");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       
        checkNotify(jToggleButton2);           
            jToggleButton2.setText("A2");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
         checkNotify(jToggleButton3);     
            jToggleButton3.setText("A3");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
         checkNotify(jToggleButton4);
           jToggleButton4.setText("A4");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed

          checkNotify(jToggleButton5);

            jToggleButton5.setText("B1");
         

    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        checkNotify(jToggleButton6);

           jToggleButton6.setText("B2");

        
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
        checkNotify(jToggleButton7); 

            jToggleButton7.setText("B3");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed

        checkNotify(jToggleButton8); 

            jToggleButton8.setText("B4");

    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        checkNotify(jToggleButton9);

           jToggleButton9.setText("C1");
 

    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
            checkNotify(jToggleButton10);

            
           jToggleButton10.setText("C2");
          
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
      checkNotify(jToggleButton11);

            
           jToggleButton11.setText("C3");
        

    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
       checkNotify(jToggleButton12);

            
           jToggleButton12.setText("C4");
           

        
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
     
         checkNotify(jToggleButton13);

           jToggleButton13.setText("D1");
 

        
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
           checkNotify(jToggleButton14);
           
           jToggleButton14.setText("D2");


        
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        
           checkNotify(jToggleButton15);

            
           jToggleButton15.setText("D3");
            
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
       
           checkNotify(jToggleButton16);

            
           jToggleButton16.setText("D4");
       

        
        
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sinemaOtamasyonu().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbilet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> filmler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JLabel jlblSalon;
    private javax.swing.JLabel jlblperde;
    private javax.swing.JTextField kisiSayisi;
    private javax.swing.JRadioButton ogrenci;
    private javax.swing.JComboBox<String> salon;
    private javax.swing.JComboBox<String> seans;
    private javax.swing.JRadioButton tam;
    private javax.swing.JButton tamam;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}