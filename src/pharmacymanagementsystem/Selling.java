
package pharmacymanagementsystem;

import java.awt.print.PrinterException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;




public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
    initComponents();
    GetAllMedicines();
    ShowDate();
    ShowMedicineCatalog(); // Call this method to populate the MedicineTable.
    }
    public void ShowMedicineCatalog() {
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
        st = conn.createStatement();
        rs = st.executeQuery("SELECT ID, MEDNAME, PRICE, QUANTITY, FABDATE, EXPDATE, COMPANY FROM pharmacydb.manage_medicine");

        // Set the ResultSet as the model for the MedicineTable.
        MedicineTable.setModel(DbUtils.resultSetToTableModel(rs));

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}

    public void ShowDate()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lblDate.setText(sdf.format(date));
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
        jLabel6 = new javax.swing.JLabel();
        tbMedicine = new javax.swing.JTextField();
        btnAddBill = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        tbQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBill = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tbCustomerId = new javax.swing.JTextField();
        btnGetPrescriptions = new javax.swing.JButton();
        lblAlerts = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblBilling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 630));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1070, 630));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILLING");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("MEDICINE");

        tbMedicine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedicine.setForeground(new java.awt.Color(51, 0, 51));

        btnAddBill.setBackground(new java.awt.Color(204, 204, 255));
        btnAddBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAddBill.setForeground(new java.awt.Color(51, 0, 51));
        btnAddBill.setText("ADD TO BILL");
        btnAddBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBillMouseClicked(evt);
            }
        });
        btnAddBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillActionPerformed(evt);
            }
        });

        btnPrintBill.setBackground(new java.awt.Color(204, 204, 255));
        btnPrintBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrintBill.setText("PRINT");
        btnPrintBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintBillMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setText("BILL");

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(102, 102, 102));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("dd-MM-yyyy");

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "PRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MedicineTable.setRowHeight(25);
        MedicineTable.setSelectionBackground(new java.awt.Color(204, 153, 255));
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MedicineTable);
        if (MedicineTable.getColumnModel().getColumnCount() > 0) {
            MedicineTable.getColumnModel().getColumn(0).setResizable(false);
            MedicineTable.getColumnModel().getColumn(1).setResizable(false);
            MedicineTable.getColumnModel().getColumn(2).setResizable(false);
            MedicineTable.getColumnModel().getColumn(3).setResizable(false);
            MedicineTable.getColumnModel().getColumn(4).setResizable(false);
            MedicineTable.getColumnModel().getColumn(5).setResizable(false);
            MedicineTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setText("MEDICINES LIST");

        tbQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbQty.setForeground(new java.awt.Color(51, 0, 51));
        tbQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbQtyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("QUANTITY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bill Date:");

        taBill.setEditable(false);
        taBill.setColumns(20);
        taBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taBill.setRows(10);
        jScrollPane1.setViewportView(taBill);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("CUSTOMER ID");

        tbCustomerId.setToolTipText("");
        tbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCustomerIdActionPerformed(evt);
            }
        });

        btnGetPrescriptions.setBackground(new java.awt.Color(204, 204, 255));
        btnGetPrescriptions.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGetPrescriptions.setText("PRESCRIPTIONS");
        btnGetPrescriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetPrescriptionsMouseClicked(evt);
            }
        });
        btnGetPrescriptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPrescriptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(280, 280, 280))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbMedicine, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbCustomerId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addComponent(tbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGetPrescriptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnPrintBill)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnGetPrescriptions, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnAddBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnPrintBill)
                .addGap(23, 23, 23))
        );

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

        lblMedicine.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicine.setText("MEDICINE");
        lblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicineMouseClicked(evt);
            }
        });

        lblCompany.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany.setText("COMPANY");
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompanyMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
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

        lblBilling.setBackground(new java.awt.Color(255, 255, 255));
        lblBilling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBilling.setText("BILLING");
        lblBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomer)
                    .addComponent(lblAlerts)
                    .addComponent(lblBilling)
                    .addComponent(lblCompany)
                    .addComponent(lblMedicine))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(lblBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void GetAllMedicines()
    {
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb","root","kishoremyna");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from pharmacydb.manage_medicine");
           MedicineTable.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public int UpdateQty() {
    // Calculate the new quantity
    int newQty = oldQty - Integer.parseInt(tbQty.getText());
    if(newQty<0){
        JOptionPane.showMessageDialog(this, "Quantity not available!!");
        return -1;
    }
    try {
        // Establish a database connection
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
        
        // Build the SQL update query
        String queryUpdate = "UPDATE pharmacydb.manage_medicine SET quantity = " + newQty + " WHERE id = " + medId;

        // Create a statement object and execute the SQL update query
        Statement st = conn.createStatement();
        st.executeUpdate(queryUpdate);

        // Refresh the medicine data from the database
        GetAllMedicines();

        // Display a success message
        JOptionPane.showMessageDialog(this, "Quantity of medicine has been successfully updated!");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
    return 1;
}

    
    int i = 0, medId, oldQty;
    double price;
    private void btnAddBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBillMouseClicked
     if (tbMedicine.getText().isEmpty() || tbQty.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Information about Bill");
    } else {
        if (i == 0) {
            // Get the current date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            // Construct the header for the bill
            String header = String.format("Date: %s\nCustomer ID: %s\n\n", date, tbCustomerId.getText());
            // Set the header as the initial content of the JTextArea
            taBill.setText(header);
            i++;
        }
        // Rest of your code to add bill details as before
        String line = String.format("    %2d %15s %10s %10.2f %10.2f%n",i, tbMedicine.getText(), tbQty.getText(), price, Integer.parseInt(tbQty.getText()) * price);
        if (i == 1) {
            taBill.append("ID       MEDICINE         QUANTITY       PRICE         TOTAL\n");
        }
        int s=UpdateQty();
        if(s>=0){
        taBill.append(line);
        i++;
        }
        
    }                                     
    }//GEN-LAST:event_btnAddBillMouseClicked

    private void btnPrintBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintBillMouseClicked
   try {
         // Calculate the total amount
        BigDecimal totalAmount = calculateTotalAmount();
       String line = String.format("Bill Amount = %f",totalAmount);
        taBill.append(line);
        taBill.print();
        // Prompt the user to confirm billing
        int confirmResult = JOptionPane.showConfirmDialog(this, "Do you want to confirm the billing?", "Confirm Billing", JOptionPane.YES_OPTION);
        
        if (confirmResult == JOptionPane.YES_OPTION) {
            // Insert the billing record into the billing table
            insertBillingRecord(totalAmount);
        }

    } catch (PrinterException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
    }//GEN-LAST:event_btnPrintBillMouseClicked
private void insertBillingRecord(BigDecimal totalAmount) {
    // Get the customer ID from your UI or wherever it's stored
    int customerId =  Integer.parseInt(tbCustomerId.getText()); 

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna")) {
        // Create a query to insert a new billing record into the billing table
        String insertBillingQuery = "INSERT INTO billing (customerID, transaction_date, total_amount) VALUES (?, NOW(), ?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertBillingQuery, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, customerId);
            preparedStatement.setBigDecimal(2, totalAmount);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Billing record successfully added.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add billing record.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked

        tbMedicine.setText("");
        tbQty.setText("");
        taBill.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void lblAlertsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertsMouseClicked
        Alerts alertsWindow = new Alerts();

    // Display the Prescription window
    alertsWindow.setVisible(true);
    }//GEN-LAST:event_lblAlertsMouseClicked

    private void lblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMedicineMouseClicked

    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
         new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int myIndex = MedicineTable.getSelectedRow();
        medId = Integer.parseInt(model.getValueAt(myIndex, 0).toString());
        tbMedicine.setText(model.getValueAt(myIndex, 1).toString());
        oldQty = Integer.parseInt(model.getValueAt(myIndex, 3).toString());
        price = Double.parseDouble(model.getValueAt(myIndex, 2).toString());
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void lblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCustomerMouseClicked

    private void lblBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillingMouseClicked
         new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBillingMouseClicked

    private void tbQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbQtyActionPerformed

    private void btnAddBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBillActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void tbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCustomerIdActionPerformed

    private void btnGetPrescriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetPrescriptionsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGetPrescriptionsMouseClicked

    private void btnGetPrescriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPrescriptionsActionPerformed
        // TODO add your handling code here:
         int customerId = Integer.parseInt(tbCustomerId.getText());

     // Create an instance of the Prescription class
    Prescription prescriptionWindow = new Prescription(customerId);

    // Display the Prescription window
    prescriptionWindow.setVisible(true);
    }//GEN-LAST:event_btnGetPrescriptionsActionPerformed

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton btnAddBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnGetPrescriptions;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlerts;
    private javax.swing.JLabel lblBilling;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JTextArea taBill;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbMedicine;
    private javax.swing.JTextField tbQty;
    // End of variables declaration//GEN-END:variables

    private BigDecimal calculateTotalAmount() {
    BigDecimal totalAmount = BigDecimal.ZERO;
    String text = taBill.getText();
    String[] lines = text.split("\n");
    
    for (String line : lines) {
        String[] values = line.split("\\s+");
        
        if (values.length >= 5) {
            String totalValue = values[values.length - 1];
            try {
                BigDecimal lineTotal = new BigDecimal(totalValue);
                totalAmount = totalAmount.add(lineTotal);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
    
    return totalAmount;
}

}

