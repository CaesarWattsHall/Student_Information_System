/*
*By: Caesar W. & Obina E.
*Class: JAVA 1
*Instructor: Dr.Primo
*Assignment: Group-Project
*Date: 12/05/2018
*Due: 12/06/2018 @9:30AM
*/
//START
package groupproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GroupProject extends javax.swing.JFrame {

    public GroupProject() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Middle Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Last Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Click here to save student records.");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Click here to clear the text box.");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuit.setText("Quit ");
        btnQuit.setToolTipText("Click here to quit the program");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Click here to update the student record.");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Click here to remove the student record.");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Course");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Student Information System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 91, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtMiddleName)
                                    .addComponent(txtCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtLastName))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnDelete))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnQuit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold> 
    
    /* Specifically, the (unchecked) category allows suppression of compiler 
    warnings generated as a result of unchecked type casts. 
    Simply: It's a warning by which the compiler indicates that it cannot 
    ensure type safety.
    */

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // No code needs to be inputed here.
    }                                            
    
    DefaultTableModel mod;
    String crwhId, crwhFName, crwhMName, obiLastName, obiCourse, line;
  
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        mod = (DefaultTableModel)Table.getModel();
        mod.addColumn("ID");
        mod.addColumn("FIRST NAME");
        mod.addColumn("MIDDLE NAME");
        mod.addColumn("LAST NAME");
        mod.addColumn("COURSE");        
        
        try{
        BufferedReader bfw = new BufferedReader(new FileReader("student_db.txt"));
        while( (line = bfw.readLine() ) != null ) {
        mod.addRow( line.split(",") );
        }
            bfw.close();
        }
        catch(Exception ex){
        }

    }                                 

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.crwhId = txtID.getText().toUpperCase();
        this.crwhFName = txtFirstName.getText().toUpperCase();
        this.crwhMName = txtMiddleName.getText().toUpperCase();
        this.obiLastName = txtLastName.getText().toUpperCase();
        this.obiCourse = txtCourse.getText().toUpperCase();
              
        this.txtID.setText("");
        this.txtFirstName.setText("");
        this.txtMiddleName.setText("");
        this.txtLastName.setText("");
        this.txtCourse.setText("");
        
        String st[] = {crwhId, crwhFName, crwhMName, obiLastName,obiCourse};
        mod.addRow(st);
        saveFile();
        
        this.txtID.requestFocus();
        
        /* As for requestFocus(), this method is used to make the component get 
         * input focus. This means that if you press any kind of key or give any 
         * input, the input is heard by the respective Listener for that 
         * component.
        **/
    }                                      

    private void saveFile(){
        try{
          File file = new File("student_db.txt");
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw = new FileWriter(file.getAbsoluteFile());
          BufferedWriter bw = new BufferedWriter(fw);
          
          for(int i=0; i<Table.getRowCount(); i++){
              for(int j=0; j<Table.getColumnCount(); j++){
                  bw.write((String)Table.getModel().getValueAt(i,j)+",");
              }
              bw.write("\n");
          }
        bw.close();
        fw.close();
      }catch(Exception ex){
          
      }
    }
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String message = "Do you want to quit the program?";
       String title = "Really Program Quit?";

    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
    
    if (reply ==JOptionPane.NO_OPTION)
    {
        this.txtID.setText("");
        this.txtFirstName.setText("");
        this.txtMiddleName.setText("");
        this.txtLastName.setText("");
        this.txtCourse.setText(""); 
        this.txtID.requestFocus();
    }
    
    if (reply == JOptionPane.YES_OPTION)
    {
      System.exit(0);
    }
         
    }                                       

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        int index =Table.getSelectedRow();
        TableModel model = Table.getModel();
        crwhId = model.getValueAt(index, 0).toString().toUpperCase();
        crwhFName = model.getValueAt(index, 1).toString().toUpperCase();
        crwhMName = model.getValueAt(index, 2).toString().toUpperCase();
        obiLastName = model.getValueAt(index, 3).toString().toUpperCase();
        obiCourse = model.getValueAt(index, 4).toString().toUpperCase();
               
        txtID.setText(crwhId);
        txtFirstName.setText(crwhFName);
        txtMiddleName.setText(crwhMName);
        txtLastName.setText(obiLastName);
        txtCourse.setText(obiCourse);
    }                                  

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        mod = (DefaultTableModel) Table.getModel();
        
        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            mod.setValueAt(txtID.getText().toUpperCase(),Table.getSelectedRow(), 0);
            mod.setValueAt(txtFirstName.getText().toUpperCase(), Table.getSelectedRow(), 1);
            mod.setValueAt(txtMiddleName.getText().toUpperCase(), Table.getSelectedRow(), 2);
            mod.setValueAt(txtLastName.getText().toUpperCase(), Table.getSelectedRow(), 3);
            mod.setValueAt(txtCourse.getText().toUpperCase(), Table.getSelectedRow(), 4);
        }
              
        saveFile();
    }                                         

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        mod = (DefaultTableModel) Table.getModel();
        
        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Record is deleted!");
            mod.removeRow(Table.getSelectedRow());
            this.txtID.setText("");
            this.txtFirstName.setText("");
            this.txtMiddleName.setText("");
            this.txtLastName.setText("");
            this.txtCourse.setText("");
            
            this.txtID.requestFocus();
        }
        saveFile();
    }                                         

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
            this.txtID.setText("");
            this.txtFirstName.setText("");
            this.txtMiddleName.setText("");
            this.txtLastName.setText("");
            this.txtCourse.setText("");
            
            this.txtID.requestFocus();
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* This creates and displays the form. */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupProject().setVisible(true);
            }
        });
    }

    // Here are the variables declaration, which do 
    // not need to be modified in any form.                
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    // This is the end of variables declaration                   
}
//END