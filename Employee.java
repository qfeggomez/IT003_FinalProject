/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managements;

/**
 *
 * @author Emmanuel Roda
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame {
    
    static final String USER = "system";
    static final String PASS = "Admins1234";
    static final String DATABASE = "orcl";
    static final String DB_URL = "jdbc:oracle:thin:@192.168.100.6:1521:"+DATABASE;
    
    Connection conn = null;
    Statement stmt = null;

    /**
     * Creates new form RegisterForm
     */
    public Employee() {
        initComponents();
        this.setLocationRelativeTo(null);
        refresh_table();
        clearFields();
    }
    
     public void refresh_table(){
        try{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement ps = conn.prepareStatement("SELECT * from employers");
        ResultSet rs = ps.executeQuery();
        DefaultTableModel tm = (DefaultTableModel) table_list.getModel();
        tm.setRowCount(0);
        while(rs.next()){
        Object row[]={
        rs.getInt("user_id"),
        rs.getString("username"),
        rs.getString("firstname"),
        rs.getString("lastname"),
        rs.getString("address"),
        rs.getString("salary"),
        rs.getString("job")};
           tm.addRow(row);
        }
            conn.close();
        }catch(SQLException se){
            System.out.println(se);
        }
    }
    
    public void clearFields(){
        user_id.setText(null);
        txt_username.setText(null);
        txt_password.setText(null);
        txt_firstname.setText(null);
        txt_lastname.setText(null);
        txt_address.setText(null);
        txt_salary.setText(null);
        txt_job.setText(null);
    
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        Update = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_list = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE DATABASE MANAGEMENT SYSTEM");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose)
                            .addComponent(jLabelMin))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8))))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("First Name:");

        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        txt_firstname.setBackground(new java.awt.Color(108, 122, 137));
        txt_firstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_firstname.setForeground(new java.awt.Color(228, 241, 254));

        txt_password.setBackground(new java.awt.Color(108, 122, 137));
        txt_password.setForeground(new java.awt.Color(228, 241, 254));

        Update.setBackground(new java.awt.Color(34, 167, 240));
        Update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Insert.setBackground(new java.awt.Color(34, 167, 240));
        Insert.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Username:");

        txt_username.setBackground(new java.awt.Color(108, 122, 137));
        txt_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(228, 241, 254));

        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Last Name:");

        txt_lastname.setBackground(new java.awt.Color(108, 122, 137));
        txt_lastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_lastname.setForeground(new java.awt.Color(228, 241, 254));

        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Address:");

        txt_address.setBackground(new java.awt.Color(108, 122, 137));
        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(228, 241, 254));
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        table_list.setBackground(new java.awt.Color(108, 122, 137));
        table_list.setForeground(new java.awt.Color(228, 241, 254));
        table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Username", "Firstname", "Lastname", "Address", "Salary", "Job"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_list);

        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Employee Id:");

        user_id.setBackground(new java.awt.Color(108, 122, 137));
        user_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user_id.setForeground(new java.awt.Color(228, 241, 254));

        Delete.setBackground(new java.awt.Color(34, 167, 240));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(34, 167, 240));
        clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(34, 167, 240));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButtonHome.setBackground(new java.awt.Color(34, 167, 240));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_24px.png"))); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Salary:");

        txt_salary.setBackground(new java.awt.Color(108, 122, 137));
        txt_salary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_salary.setForeground(new java.awt.Color(228, 241, 254));

        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Job:");

        txt_job.setBackground(new java.awt.Color(108, 122, 137));
        txt_job.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_job.setForeground(new java.awt.Color(228, 241, 254));
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_lastname)
                        .addComponent(txt_firstname)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addComponent(txt_username)
                        .addComponent(txt_password))
                    .addComponent(txt_salary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_job, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete)
                            .addComponent(Insert)
                            .addComponent(Update)
                            .addComponent(clear)
                            .addComponent(refresh)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonHome)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(user_id.getText());
        String username = txt_username.getText();
        String password = txt_password.getText();
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        String address = txt_address.getText();
        String salary = txt_salary.getText();
        String job = txt_job.getText();
        
        
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
             String sql = "UPDATE employers set username='"+username+"', password='"+password+"', firstname='"+firstname+"', lastname='"+lastname+"', address='"+address+"', salary='"+salary+"', job='"+job+"' WHERE user_id= "+ id;
            stmt.executeUpdate(sql);
            jOptionPane1.showMessageDialog(null, "Updated records successfully!");
            
            conn.close();
            
        }catch(SQLException se){
            System.out.println(se);
        }//end try
    }//GEN-LAST:event_UpdateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = txt_password.getText();
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        String address = txt_address.getText();
        String salary = txt_salary.getText();
        String job = txt_job.getText();
        
        try{
            
            /*Create connection*/
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            /*Insert statement*/
            String sql = "INSERT INTO employers (username, password, firstname, lastname, address, salary, job) VALUES ('"+username+"', '"+password+"', '"+firstname+"', '"+lastname+"', '"+address+"', '"+salary+"', '"+job+"')";
            stmt.executeUpdate(sql);
            jOptionPane1.showMessageDialog(null, "Inserted records into the table!");
            
         
            
            conn.close();
          
        }catch(SQLException se){
            System.out.println(se);
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        /*Delete record*/
        int id = Integer.parseInt(user_id.getText());
        
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE from employees where user_id = " + id;
            int dialogResult = jOptionPane1.showConfirmDialog (null, "Would you like to delete this record?");
            if(dialogResult == jOptionPane1.YES_OPTION){
                stmt.executeUpdate(sql);
                
                jOptionPane1.showMessageDialog(null, "Deleted successfully!");
                
            }
            conn.close();
            
        }catch(SQLException se){
            System.out.println(se);
        }//end try
    }//GEN-LAST:event_DeleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        refresh_table();
    }//GEN-LAST:event_refreshActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        Main rgf = new Main();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JButton clear;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh;
    private javax.swing.JTable table_list;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}
