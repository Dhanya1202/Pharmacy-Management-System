
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
public class Medicine extends javax.swing.JFrame {  
    public Medicine() {
        initComponents();
        GetAllMedicines();
        GetCompany();
    }
    /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    java.util.Date fabDate,expDate;
    java.util.Date myFabDate, myExpDate;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBilling = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbMedPrice = new javax.swing.JTextField();
        tbMedId = new javax.swing.JTextField();
        tbMedName = new javax.swing.JTextField();
        tbMedQty = new javax.swing.JTextField();
        ddlCompany = new javax.swing.JComboBox<>();
        dpFabDate = new com.toedter.calendar.JDateChooser();
        dpExpDate = new com.toedter.calendar.JDateChooser();
        btnAddMedicine = new javax.swing.JButton();
        btnUpdateMedicine = new javax.swing.JButton();
        btnDeleteMedicine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblMedicine = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblAlerts = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblBilling.setBackground(new java.awt.Color(255, 255, 255));
        lblBilling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBilling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBilling.setText("BILLING");
        lblBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillingMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE MEDICINE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("MEDNAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("QUANTITY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("FABDATE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("EXPDATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("COMPANY");

        tbMedPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedPrice.setForeground(new java.awt.Color(51, 0, 51));

        tbMedId.setEditable(false);
        tbMedId.setBackground(new java.awt.Color(255, 255, 255));
        tbMedId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedId.setForeground(new java.awt.Color(51, 0, 51));
        tbMedId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbMedName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedName.setForeground(new java.awt.Color(51, 0, 51));

        tbMedQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedQty.setForeground(new java.awt.Color(51, 0, 51));

        ddlCompany.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ddlCompany.setForeground(new java.awt.Color(0, 153, 0));

        btnAddMedicine.setBackground(new java.awt.Color(204, 204, 255));
        btnAddMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddMedicine.setText("ADD");
        btnAddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMedicineMouseClicked(evt);
            }
        });

        btnUpdateMedicine.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdateMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateMedicine.setText("UPDATE");
        btnUpdateMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMedicineMouseClicked(evt);
            }
        });

        btnDeleteMedicine.setBackground(new java.awt.Color(204, 204, 255));
        btnDeleteMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteMedicine.setText("DELETE");
        btnDeleteMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMedicineMouseClicked(evt);
            }
        });

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
        jScrollPane1.setViewportView(MedicineTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setText("MEDICINES LIST");

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddMedicine)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbMedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(74, 74, 74)
                                        .addComponent(tbMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dpFabDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ddlCompany, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dpExpDate, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateMedicine)
                                .addGap(10, 10, 10)
                                .addComponent(btnDeleteMedicine)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)))
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(tbMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tbMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(dpFabDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(ddlCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tbMedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(tbMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );

        lblMedicine.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicine.setText("MEDICINE");
        lblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicineMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompany)
                            .addComponent(lblBilling)
                            .addComponent(lblAlerts)
                            .addComponent(lblMedicine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCustomer)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(lblBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void GetAllMedicines()
    {
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from pharmacydb.manage_medicine");
           MedicineTable.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public void GetCompany()
    {
        try {
              
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from pharmacydb.manage_company");
           
           while(rs.next())
           {
               String myCompany = rs.getString("name");
               ddlCompany.addItem(myCompany);
           }
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    /* insert new medicine */
    private void btnAddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMedicineMouseClicked
        try {
        // Get the selected date from date pickers
        Date fabDate = new Date(dpFabDate.getDate().getTime());
        Date expDate = new Date(dpExpDate.getDate().getTime());
        int generatedId = MedicineIDGenerator.generateUniqueMedicineID();
        // Parse user input
        //int id = Integer.parseInt(tbMedId.getText());
        int id=generatedId;
        String name = tbMedName.getText();
        int quantity = Integer.parseInt(tbMedQty.getText());
        String company = ddlCompany.getSelectedItem().toString();
        double price = Double.parseDouble(tbMedPrice.getText());

        // Establish a connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna")) {
            // Prepare the SQL statement
            String sql = "INSERT INTO manage_medicine (MEDNAME, PRICE, QUANTITY, FABDATE, EXPDATE, COMPANY,ID) VALUES (?, ?, ?, ?, ?, ?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(7, id);
                preparedStatement.setString(1, name);
                preparedStatement.setDouble(2, price);
                preparedStatement.setInt(3, quantity);
                preparedStatement.setDate(4, fabDate);
                preparedStatement.setDate(5, expDate);
                preparedStatement.setString(6, company);

                // Execute the SQL statement
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Medicine Successfully Added!");
                }  else {
            JOptionPane.showMessageDialog(this, "Failed to add medicine.");
        }
            }
        }
        
        // Refresh the medicine list
        GetAllMedicines();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to add medicine: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnAddMedicineMouseClicked

    /* delete existing medicine */
    private void btnDeleteMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMedicineMouseClicked
        
         String medicineId = tbMedId.getText();

    if (medicineId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter ID of the Medicine To Be Deleted.");
        return; // Exit the method early as input validation failed.
    }

    try {
        // Establish a connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna")) {
            String deleteQuery = "DELETE FROM manage_medicine WHERE ID = ?";
            
            // Prepare the SQL statement with a parameter
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, Integer.parseInt(medicineId));
                
                int rowsDeleted = preparedStatement.executeUpdate();
                
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Medicine Successfully Deleted!");
                    // Refresh the medicine list
                    GetAllMedicines();
                } else {
                    JOptionPane.showMessageDialog(this, "No medicine found with the provided ID.");
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to delete medicine: " + ex.getMessage());
    } 
    }//GEN-LAST:event_btnDeleteMedicineMouseClicked

    /* update existing medicine by click on wanted table row*/
    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
       
        DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int myIndex = MedicineTable.getSelectedRow();
        tbMedId.setText(model.getValueAt(myIndex, 0).toString());
        tbMedName.setText(model.getValueAt(myIndex, 1).toString());
        tbMedQty.setText(model.getValueAt(myIndex, 3).toString());
        dpFabDate.setDate((Date)model.getValueAt(myIndex, 4));
        dpExpDate.setDate((Date)model.getValueAt(myIndex, 5));
        tbMedPrice.setText(model.getValueAt(myIndex, 2).toString());

    }//GEN-LAST:event_MedicineTableMouseClicked

    
    /* update existing medicine */
    private void btnUpdateMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMedicineMouseClicked
        if (tbMedId.getText().isEmpty() || tbMedName.getText().isEmpty() || tbMedPrice.getText().isEmpty() || tbMedQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information about Medicine");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "kishoremyna");
                String id = tbMedId.getText();
                fabDate = dpFabDate.getDate();
                myFabDate = new java.sql.Date(fabDate.getTime());
                expDate = dpExpDate.getDate();
                myExpDate = new java.sql.Date(expDate.getTime());
                
                String queryUpdate = "Update pharmacydb.manage_medicine set medname = '" + tbMedName.getText() + "'" + ",price = " + tbMedPrice.getText() + "" + ",quantity = " + tbMedQty.getText() + "" + ",fabdate = '" + myFabDate + "'" + ",expdate = '" + myExpDate + "'" + ",company = '" + ddlCompany.getSelectedItem().toString() + "'" + "where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(queryUpdate);
                
                GetAllMedicines();
                JOptionPane.showMessageDialog(this, "Medicine Successfully Updated!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }     
    }//GEN-LAST:event_btnUpdateMedicineMouseClicked

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

    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void lblAlertsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlertsMouseClicked
               Alerts alertsWindow = new Alerts();

    // Display the Prescription window
    alertsWindow.setVisible(true);
    }//GEN-LAST:event_lblAlertsMouseClicked

    private void lblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCustomerMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked

        tbMedId.setText("");
        tbMedName.setText("");
        dpFabDate.setDate(null);
        dpExpDate.setDate(null);
        tbMedQty.setText("");
        tbMedPrice.setText("");
        //ddlCompany.setTe(" ");
        
    }//GEN-LAST:event_btnClearMouseClicked

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteMedicine;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnUpdateMedicine;
    private javax.swing.JComboBox<String> ddlCompany;
    private com.toedter.calendar.JDateChooser dpExpDate;
    private com.toedter.calendar.JDateChooser dpFabDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlerts;
    private javax.swing.JLabel lblBilling;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JTextField tbMedId;
    private javax.swing.JTextField tbMedName;
    private javax.swing.JTextField tbMedPrice;
    private javax.swing.JTextField tbMedQty;
    // End of variables declaration//GEN-END:variables
}
