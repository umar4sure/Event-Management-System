/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class home extends javax.swing.JInternalFrame {

    /**
     * Creates new form home
     */
    connection con;
    public home() {
        initComponents();
        con=new connection();
      
        txtname.setText(usernME.nm);
        timedate();
         Top3Events();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    public void Top3Events() //Method for displaying upcoming top 3 events within next 7 days
{
        try
        {
            DefaultTableModel obj=new DefaultTableModel();
   
   obj.addColumn("Event Id");
   obj.addColumn("User Name");

   obj.addColumn("Event Title"); 
      obj.addColumn("Event Date");
   obj.addColumn("Event Time");
   obj.addColumn("Event Colour");
   obj.addColumn("Event Description");
   
   Date d=new Date();
        
        Date datebefore = new Date(d.getTime() -1 * 24 * 3600 * 1000);
        Date dateAfter = new Date(d.getTime() +7 * 24 * 3600 * 1000);
        String bDate= new SimpleDateFormat().format(datebefore);
        String aDate= new SimpleDateFormat().format(dateAfter);

 ResultSet rs=connection.stat.executeQuery("select Event_ID,[user_name],Event_Title,Event_Date,Event_Time,Event_Color,Event_Description from tbl_event where user_name='"+txtname.getText()+"' and Event_Date between '"+bDate+"' and '"+aDate+"' order by Event_Date asc");
        while (rs.next()) {            
 obj.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getDate("Event_Date"),
 rs.getString("Event_Time"),rs.getString("Event_Color"),rs.getString("Event_Description")});
                          }
  jTable1.setModel(obj);
        }
         catch(Exception ex)
         {
            System.out.println(ex);
         }
    
}
    
    
//    else{
//    
//      try
//        {
//            DefaultTableModel ObjhomeTbl = new DefaultTableModel();
//            ObjhomeTbl.addColumn("Event ID");
//            ObjhomeTbl.addColumn("User_name");
//            ObjhomeTbl.addColumn("Title");
//            ObjhomeTbl.addColumn("Date");
//            ObjhomeTbl.addColumn("Time");
//            ObjhomeTbl.addColumn("Colour");
//            ObjhomeTbl.addColumn("Description");
//            
//           
//        ResultSet rs =connection.stat.executeQuery("select Event_ID, user_name, Event_Title, Event_Date, Event_Time, Event_Color, Event_Description from tbl_event where user_name='"+txtname+"' order by Event_Date asc");
//            
//            while(rs.next())
//            {
//                ObjhomeTbl.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"), rs.getString("Event_Title"), rs.getDate("Event_Date"),
//                    rs.getString("Event_Time"), rs.getString("Event_Color"), rs.getString("Event_Description")});
//                
//            }
//            jTable1.setModel(ObjhomeTbl);
//        }
//        catch(Exception ex)
//        {
//            JOptionPane.showMessageDialog(this, ex);
//        }
//    }
//    
//}
    
    
//    public void tab(){
//        try{
//            
//            DefaultTableModel df=new DefaultTableModel();
//            
//            df.addColumn("Event_ID");
//            df.addColumn("user_name");
//            df.addColumn("Event Title");
//           df.addColumn("Event_Date");
//           df.addColumn("Event_Time");
//           df.addColumn("Event_Description"); 
//           
//           ResultSet rs=connection.stat.executeQuery("select Event_ID,user_name,Event_Title,Event_Date,Event_Time,Event_Description from tbl_event where user_name='"+txtname.getText()+"'");
//            
//           while(rs.next()){
//          df.addRow(new Object[]{rs.getInt("Event_ID"),rs.getString("user_name"),rs.getString("Event_Title"),rs.getDate("Event_Date"),rs.getString("Event_Time"),rs.getString("Event_Description")});
//        }
//          jTable1.setModel(df);
//            
//        }
//        catch(Exception ex){
//            JOptionPane.showMessageDialog(this, ex);
//        }
//    }
//    
    
     public void timedate() {
        Thread t=new Thread(){
         //
        // Formatting date with full day and month name and show time up to
        // milliseconds with AM/PM
        //
            public void run(){
        for(;;){  
         Date date = Calendar.getInstance().getTime();   
        DateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        DateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String today = formatter.format(date);
        String aaj = form.format(date);
        lbl_time.setText(today);
        lbl_date.setText(aaj);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(mainp.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
            }
        };
        t.start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtname = new javax.swing.JTextField();
        lbl_date = new javax.swing.JTextField();
        lbl_time = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1160, 460));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clander.png"))); // NOI18N
        jLabel2.setText("Current Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 110, 250, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock-icon.png"))); // NOI18N
        jLabel3.setText("Current Time");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 110, 260, 48);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 260, 620, 100);

        txtname.setEditable(false);
        getContentPane().add(txtname);
        txtname.setBounds(500, 30, 200, 40);
        getContentPane().add(lbl_date);
        lbl_date.setBounds(300, 170, 210, 40);
        getContentPane().add(lbl_time);
        lbl_time.setBounds(650, 170, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin-icon.png"))); // NOI18N
        jLabel5.setText("User Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 30, 240, 50);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 0, 830, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 460));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lbl_date;
    private javax.swing.JTextField lbl_time;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}