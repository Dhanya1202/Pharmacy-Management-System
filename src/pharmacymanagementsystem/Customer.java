
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Customer() {
        initComponents();
        GetAllCustomers();
    }
    
    /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbCustomerAge = new javax.swing.JTextField();
        tbCustomerId = new javax.swing.JTextField();
        tbCustomerName = new javax.swing.JTextField();
        ddlGender = new javax.swing.JComboBox<>();
        btnAddCustomer = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tbCustomerPhone = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        tbAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        lblBilling = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblAlerts = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CUSTOMERS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("AGE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("PHONE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("GENDER");

        tbCustomerAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCustomerAge.setForeground(new java.awt.Color(51, 0, 51));

        tbCustomerId.setEditable(false);
        tbCustomerId.setBackground(new java.awt.Color(255, 255, 255));
        tbCustomerId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCustomerId.setForeground(new java.awt.Color(51, 0, 51));
        tbCustomerId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCustomerName.setForeground(new java.awt.Color(51, 0, 51));

        ddlGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ddlGender.setForeground(new java.awt.Color(51, 0, 51));
        ddlGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        ddlGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlGenderActionPerformed(evt);
            }
        });

        btnAddCustomer.setBackground(new java.awt.Color(204, 204, 255));
        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddCustomer.setText("ADD");
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });

        btnUpdateCustomer.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdateCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateCustomer.setText("UPDATE");
        btnUpdateCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateCustomerMouseClicked(evt);
            }
        });

        btnDeleteCustomer.setBackground(new java.awt.Color(204, 204, 255));
        btnDeleteCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteCustomer.setText("DELETE");
        btnDeleteCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCustomerMouseClicked(evt);
            }
        });

        CustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Phone", "Gender", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomersTable.setColumnSelectionAllowed(true);
        CustomersTable.setRowHeight(25);
        CustomersTable.setSelectionBackground(new java.awt.Color(204, 153, 255));
        CustomersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomersTable);
        CustomersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("CUSTOMERS LIST");

        tbCustomerPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCustomerPhone.setForeground(new java.awt.Color(51, 0, 51));

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        tbAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbAddress.setForeground(new java.awt.Color(51, 0, 51));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("ADDRESS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnAddCustomer)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdateCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(tbCustomerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tbCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCustomerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblCompany.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany.setText("COMPANY");
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompanyMouseClicked(evt);
            }
        });

        lblMedicine.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicine.setText("MEDICINES");
        lblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicineMouseClicked(evt);
            }
        });

        lblBilling.setBackground(new java.awt.Color(255, 255, 255));
        lblBilling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBilling.setText("BILLING");
        lblBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillingMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        lblAlerts.setBackground(new java.awt.Color(255, 255, 255));
        lblAlerts.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblAlerts.setForeground(new java.awt.Color(255, 0, 51));
        lblAlerts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlerts.setText("ALERTS");
        lblAlerts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlertsMouseClicked(evt);
            }
        });

        lblCustomer.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomer.setText("CUSTOMER");
        lblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedicine)
                            .addComponent(lblCompany)
                            .addComponent(lblAlerts)
                            .addComponent(lblCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBilling)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void GetAllCustomers()
    {
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from pharmacydb.manage_customer");
           CustomersTable.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
     /* insert new customer */
    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
       try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
        
        // Check if the customer ID already exists (assuming "manage_customer" has an "id" field as the primary key)
        //int customerId = Integer.parseInt(tbCustomerId.getText());
        int generatedId =CustomerIDGenerator.generateUniqueMedicineID();
  
        int id=generatedId;
        
        
        PreparedStatement ps = conn.prepareStatement("INSERT INTO manage_customer VALUES(?,?,?,?,?,?)");
        
        ps.setInt(1, id);
        ps.setString(2, tbCustomerName.getText());
        ps.setInt(3, Integer.parseInt(tbCustomerAge.getText()));
        ps.setString(4, tbCustomerPhone.getText());
        ps.setString(5, ddlGender.getSelectedItem().toString());
        ps.setString(6, tbAddress.getText());

        int row = ps.executeUpdate();
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Customer Successfully Added!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add the customer.");
        }

        conn.close();
        GetAllCustomers();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
        /*
           try {          
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
            PreparedStatement ps = conn.prepareStatement("insert into manage_customer values(?,?,?,?,?,?)");
            
            ps.setInt(1, Integer.parseInt(tbCustomerId.getText()));
            ps.setString(2, tbCustomerName.getText());
            ps.setInt(3, Integer.parseInt(tbCustomerAge.getText()));
            ps.setString(4, tbCustomerPhone.getText());
            //ps.setString(5, tbCustomer.getText());
            ps.setString(5, ddlGender.getSelectedItem().toString());
            ps.setString(6, tbAddress.getText());
        
            
            int row =  ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Successfully Added!");
            conn.close();
            GetAllCustomers();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }       
        */
        
    }//GEN-LAST:event_btnAddCustomerMouseClicked
/* Check if a customer with the given ID already exists in the database */
private boolean isCustomerIdExists(int customerId) throws SQLException {
    PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM manage_customer WHERE id = ?");
    checkStmt.setInt(1, customerId);
    ResultSet resultSet = checkStmt.executeQuery();
    resultSet.next();
    int count = resultSet.getInt(1);
    return count > 0;
}
      /* clear fields */
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
       
            tbCustomerId.setText("");
            tbCustomerName.setText("");
            tbCustomerAge.setText("");
            tbCustomerPhone.setText("");
            tbAddress.setText("");
            //tbAgentPass.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

      /* delete existing agent */
    private void btnDeleteCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCustomerMouseClicked
       
         if (tbCustomerId.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Enter ID of the Customer To Be Deleted....");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
                String id = tbCustomerId.getText();
                String query = "Delete from pharmacydb.manage_customer where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                
                GetAllCustomers();
                JOptionPane.showMessageDialog(this, "customer Successfully Deleted!");
           
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }      
    }//GEN-LAST:event_btnDeleteCustomerMouseClicked

    /* update existing customer by click on wanted table row*/
    private void CustomersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomersTable.getModel();
        int myIndex = CustomersTable.getSelectedRow();
        tbCustomerId.setText(model.getValueAt(myIndex, 0).toString());
        tbCustomerName.setText(model.getValueAt(myIndex, 1).toString());
        tbCustomerAge.setText(model.getValueAt(myIndex, 2).toString());
        tbCustomerPhone.setText(model.getValueAt(myIndex, 3).toString());
        //ddlGender.setText(model.getValueAt(myIndex, 4).toString());
        tbAddress.setText(model.getValueAt(myIndex, 5).toString());
    }//GEN-LAST:event_CustomersTableMouseClicked

    
    /* update existing customer */
    private void btnUpdateCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCustomerMouseClicked
           if (tbCustomerId.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Customer ID to update.");
    } else {
        try {
            int customerId = Integer.parseInt(tbCustomerId.getText());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");

            // Check if the customer exists before updating
            if (!isCustomerExists(customerId)) {
                JOptionPane.showMessageDialog(this, "Customer with this ID does not exist.");
                return; // Exit the method
            }

            PreparedStatement ps = conn.prepareStatement("UPDATE manage_customer SET name=?, age=?, phone=?, gender=?, address=? WHERE id=?");

            ps.setString(1, tbCustomerName.getText());
            ps.setInt(2, Integer.parseInt(tbCustomerAge.getText()));
            ps.setString(3, tbCustomerPhone.getText());
            ps.setString(4, ddlGender.getSelectedItem().toString());
            ps.setString(5, tbAddress.getText());
            ps.setInt(6, customerId); // Set the customer ID for the WHERE clause

            int updatedRows = ps.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(this, "Customer Successfully Updated!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update the customer.");
            }

            GetAllCustomers();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
         /*if (tbCustomerId.getText().isEmpty() || tbCustomerName.getText().isEmpty() || tbCustomerAge.getText().isEmpty() || tbCustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information about Agent");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
                PreparedStatement ps = conn.prepareStatement("update manage_customer set name=?, age=?, phone=?,gender=? ,address=? where id=?");

                ps.setString(1, tbCustomerName.getText());
                ps.setInt(2, Integer.parseInt(tbCustomerAge.getText()));
                ps.setString(3, tbCustomerPhone.getText());
               // ps.setString(4, tbAgentPass.getText());
                ps.setString(4, ddlGender.getSelectedItem().toString());
                ps.setInt(5, Integer.parseInt(tbAddress.getText()));


                ps.executeUpdate();
                
                
                GetAllCustomers();
                JOptionPane.showMessageDialog(this, "Customer Successfully Updated!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }   */
    }//GEN-LAST:event_btnUpdateCustomerMouseClicked
private boolean isCustomerExists(int customerId) throws SQLException {
    PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM manage_customer WHERE id = ?");
    checkStmt.setInt(1, customerId);
    ResultSet resultSet = checkStmt.executeQuery();
    resultSet.next();
    int count = resultSet.getInt(1);
    return count > 0;
}
    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void lblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMedicineMouseClicked

    private void lblBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillingMouseClicked
         new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBillingMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void ddlGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlGenderActionPerformed

    private void lblAlertsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertsMouseClicked
               Alerts alertsWindow = new Alerts();

    // Display the Prescription window
    alertsWindow.setVisible(true);
    }//GEN-LAST:event_lblAlertsMouseClicked

    private void lblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseClicked
         new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCustomerMouseClicked

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
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomersTable;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JComboBox<String> ddlGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlerts;
    private javax.swing.JLabel lblBilling;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JTextField tbAddress;
    private javax.swing.JTextField tbCustomerAge;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbCustomerName;
    private javax.swing.JTextField tbCustomerPhone;
    // End of variables declaration//GEN-END:variables
}
