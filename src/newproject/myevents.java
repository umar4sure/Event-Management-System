/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
    /**
 *
 * @author Admin
 */
public class myevents extends javax.swing.JInternalFrame {

    /**
     * Creates new form myevents
     */
    
    connection objcon;
    public myevents() {
        initComponents();
        
     objcon=new connection(); 
  date();
    txtname.setText(usernME.nm); 
    }

//date and time funtion
    public void date(){
    Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String today = formatter.format(date);
       lbl_date.setText(today); 
       
        
        }

            /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        lbl_date = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1160, 460));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Event_ID", "user_name", "Event_Title", "Event_Date", "Event_Time", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 270, 703, 124);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date_icon.png"))); // NOI18N
        jLabel1.setText("Comming Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 200, 190, 48);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date_icon.png"))); // NOI18N
        jLabel4.setText("Current Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 130, 180, 48);

        txtdate.setDateFormatString("yyyy-MM-d ");
        txtdate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtdateCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(txtdate);
        txtdate.setBounds(530, 200, 190, 40);

        lbl_date.setEditable(false);
        lbl_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_dateActionPerformed(evt);
            }
        });
        getContentPane().add(lbl_date);
        lbl_date.setBounds(530, 130, 190, 40);

        txtname.setEditable(false);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(530, 60, 190, 40);

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-find-icon (1).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 170, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin-icon.png"))); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 50, 160, 50);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 0, 830, 460);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1160, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdateCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtdateCaretPositionChanged
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_txtdateCaretPositionChanged

    private void lbl_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_dateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
//         try
//        {
//            DefaultTableModel ObjhomeTbl = new DefaultTableModel();
//            ObjhomeTbl.addColumn("Event ID");
//            ObjhomeTbl.addColumn("Title");
//            ObjhomeTbl.addColumn("Date");
//            ObjhomeTbl.addColumn("Time");
//            
//            ObjhomeTbl.addColumn("Description");
//            
//            Date d = new Date();        
//            Date dateBefore = new Date(d.getTime() -1 * 24 * 3600 * 1000 );
//            Date dateAfter = new Date(d.getTime() + 7 * 24 * 3600 * 1000 );
//            String bDate = new SimpleDateFormat("yyyy-MM-dd").format(dateBefore);
//            String aDate = new SimpleDateFormat("yyyy-MM-dd").format(dateAfter);
//           ResultSet rs =connection.stat.executeQuery("select Event_ID, user_name, Event_Title, Event_Date, Event_Time, Event_Description from tbl_event where user_name='"+txtname+"' and Event_Date between '"+lbl_date+"' and '"+txtdate+"' order by Event_Date asc");
//         if(rs.next()){
//         
//             ObjhomeTbl.addRow(new Object[]{rs.getInt("Event_ID"), rs.getString("Event_Title") ,rs.getDate("Event_Date"),
//                    rs.getString("Event_Time"), rs.getString("Event_Description")});
//             
//         }
//         
//         
//        }
//         catch(Exception ex){
//             JOptionPane.showMessageDialog(this, ex);
//         }
        if(txtname.getText().equals("admin")){
         
             Date d=new java.sql.Date(-1);
        if(txtdate.getDate().after(d)){  
        try{
            
           DefaultTableModel df=new DefaultTableModel();
           
           df.addColumn("Event_ID");
           df.addColumn("user_name");
           df.addColumn("Event_Title");
           df.addColumn("Event_Date");
           df.addColumn("Event_Time");
           df.addColumn("Event_Color");
           df.addColumn("Event_Description"); 
            
           
          ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Color,Event_Description  from tbl_event where Event_Date between '"+lbl_date.getText()+"' and '"+((JTextField)txtdate.getDateEditor().getUiComponent()).getText()+"'");
        while(rs.next()){
          df.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getString("Event_Date"),rs.getString("Event_Time"),rs.getString("Event_Color"),rs.getString("Event_Description")});
        }
          jTable1.setModel(df);
           
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex);
        }
      
            
        }
       else{
        
        JOptionPane.showMessageDialog(this, "invalid Selected Date");
                
        }
            
            
        }
        else{
     Date d=new java.sql.Date(-1);
        if(txtdate.getDate().after(d)){  
        try{
            
           DefaultTableModel df=new DefaultTableModel();
           
           df.addColumn("Event_ID");
           df.addColumn("user_name");
           df.addColumn("Event_Title");
           df.addColumn("Event_Date");
           df.addColumn("Event_Time");
           df.addColumn("Event_Color");
           df.addColumn("Event_Description"); 
            
           
          ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Color,Event_Description  from tbl_event where user_name='"+txtname.getText()+"'and Event_Date between '"+lbl_date.getText()+"' and '"+((JTextField)txtdate.getDateEditor().getUiComponent()).getText()+"'");
        while(rs.next()){
          df.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getString("Event_Date"),rs.getString("Event_Time"),rs.getString("Event_Color"),rs.getString("Event_Description")});
        }
          jTable1.setModel(df);
           
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex);
        }
       
     
        }   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lbl_date;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
