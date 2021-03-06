/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import static project.EmployeeForm.formatSocial;
import static project.EmployeeForm.formatThis;
import static project.EmployeeForm.informationMessage;
import static project.EmployeeForm.validateDate;
import static project.Project.empList;
import static project.Project.assign;
import static project.Project.dptr;
import static project.Project.empList;
import static project.Project.pay;
import static project.Project.readAssignments;
import static project.Project.readDepartments;
import static project.Project.readEmployee;
import static project.Project.readPayroll;

/**
 *
 * @author Jake Langreck
 */
public class AssignmentForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public AssignmentForm() {
        initComponents();

        assign = readAssignments("Assignments.txt");
        empList = readEmployee("Employees.txt");
        dptr = readDepartments("Departments.txt");
        pay = readPayroll("Paygrade.txt");

        DefaultTableModel model = (DefaultTableModel) tbAssignments.getModel();
        resetText();
        eraseError();
        AssignmentNode assTest = assign.getHead();
        EmployeeNode empTest = empList.getHead();
        DepartmentNode dptrTest = dptr.getHead();
        PayrollNode payTest = pay.getHead();

        Date today = new Date();
        Date dateTest = new Date();
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        populateDepartment();
        populateRank();
        populateEmployee();

        for (int i = 0; i < assign.size(); i++) {
            for (int j = 0; j < empList.size(); j++) {
                if (assTest.getEmployeeID().equals(empTest.getEmployeeID())) {
                    if (assTest.getEndDate().equals("N/A")) {
                        Date end = new Date("12/12/9999");
                        dateTest = end;
                    } else {
                        Date end = new Date(assTest.getEndDate());
                        dateTest = end;
                    }

                    if (dateTest.after(today)) {
                        model.addRow(new Object[]{assTest.getDepartment(), assTest.getEmployeeID(),
                            empTest.getLastName(), empTest.getFirstName(), assTest.getRank(), empTest.getEmail(), assTest.getBeginDate(),
                            assTest.getEndDate()});
                    }
                }

                empTest = empTest.getNext();
            }
            empTest = empList.getHead();

            assTest = assTest.getNext();
        }

    }

    private void populateDepartment() {
        DepartmentNode dptrTest;
        dptrTest = Project.dptr.getHead();
        cbDepartment.removeAllItems();
        cbDepartment.addItem("Select One");
        for (int i = 0; i < Project.dptr.size(); i++) {

            cbDepartment.addItem(dptrTest.getDeptName());
            dptrTest = dptrTest.getNext();
        }
    }

    private void populateRank() {
        PayrollNode payTest;
        payTest = Project.pay.getHead();
        cbRank.removeAllItems();
        cbRank.addItem("Select One");
        for (int i = 0; i < Project.pay.size(); i++) {

            cbRank.addItem(payTest.getRank());
            payTest = payTest.getNext();
        }
    }

    private void populateEmployee() {
        empList = readEmployee("Employees.txt");
        EmployeeNode eptr;
        AssignmentNode assTest;
        assTest = assign.getHead();
        eptr = empList.getHead();
        cbEmployeeID.removeAllItems();
        cbEmployeeID.addItem("Select One");

        for (int i = 0; i < empList.size(); i++) {
            if (include(eptr.getEmployeeID())) {
                cbEmployeeID.addItem(eptr.getEmployeeID());
            }

            eptr = eptr.getNext();

        }
    }

    private boolean include(String employeeID) {
        assign = readAssignments("Assignments.txt");
        AssignmentNode assTest = assign.getHead();

        for (int j = 0; j < assign.size(); j++) {
            if (employeeID.equals(assTest.getEmployeeID())) {
                return false;
            }
            assTest = assTest.getNext();
        }

        return true;

    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbEmployeeID = new javax.swing.JComboBox<>();
        cbDepartment = new javax.swing.JComboBox<>();
        cbRank = new javax.swing.JComboBox<>();
        jdHire = new com.toedter.calendar.JDateChooser();
        jdEnd = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAssignments = new javax.swing.JTable();
        bnAdd = new javax.swing.JButton();
        bnPast = new javax.swing.JButton();
        bnUpdate = new javax.swing.JButton();
        bnCurrent = new javax.swing.JButton();
        errDate = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jamming Jelly Assignments");

        jLabel3.setText("Employee ID:");

        jLabel4.setText("Department:");

        jLabel5.setText("Rank:");

        jLabel6.setText("Begin Date:");

        jLabel7.setText("End Date:");

        cbEmployeeID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmployeeIDActionPerformed(evt);
            }
        });

        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartmentActionPerformed(evt);
            }
        });

        cbRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level1", "Level2", "Level3", "Level4", "Level5", "Manager" }));
        cbRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRankActionPerformed(evt);
            }
        });

        jdHire.setDateFormatString("MM/dd/yyyy");

        jdEnd.setDateFormatString("MM/dd/yyyy");

        tbAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department", "Employee ID", "Last Name", "First Name", "Rank", "Email", "Begin Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAssignments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAssignmentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAssignments);

        bnAdd.setText("Add");
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });

        bnPast.setText("Past");
        bnPast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPastActionPerformed(evt);
            }
        });

        bnUpdate.setText("Update");
        bnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnUpdateActionPerformed(evt);
            }
        });

        bnCurrent.setText("Current");
        bnCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCurrentActionPerformed(evt);
            }
        });

        errDate.setForeground(new java.awt.Color(255, 0, 0));

        jMenuBar2.setBackground(new java.awt.Color(153, 102, 255));

        jMenu2.setBackground(new java.awt.Color(204, 102, 255));
        jMenu2.setForeground(new java.awt.Color(255, 255, 102));
        jMenu2.setText("Home");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 102, 255));
        jMenu3.setForeground(new java.awt.Color(255, 255, 102));
        jMenu3.setText("Employees");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(204, 51, 255));
        jMenu4.setForeground(new java.awt.Color(255, 255, 102));
        jMenu4.setText("Departments");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 51, 255));
        jMenu5.setForeground(new java.awt.Color(255, 255, 102));
        jMenu5.setText("Assignments");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(204, 51, 255));
        jMenu6.setForeground(new java.awt.Color(255, 255, 102));
        jMenu6.setText("Payroll");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(204, 51, 255));
        jMenu7.setForeground(new java.awt.Color(255, 255, 102));
        jMenu7.setText("Close");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 411, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errDate, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRank, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jdEnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(jdHire, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bnPast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bnCurrent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jdHire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jdEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnCurrent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnPast))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(errDate)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        //Project.writefiles(); 
        dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        close();
        EmployeeForm p = new EmployeeForm();
        p.setVisible(true);

    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        close();
        DepartmentForm d = new DepartmentForm();
        d.setVisible(true);

    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        close();
        PayrollForm p = new PayrollForm();
        p.setVisible(true);

    }//GEN-LAST:event_jMenu6MouseClicked

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
        // TODO add your handling code here:
        int validate = 0;
        DefaultTableModel model = (DefaultTableModel) tbAssignments.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        eraseError();

        Date hireDate;
        Date endDate;
        hireDate = jdHire.getDate();
        endDate = jdEnd.getDate();
        String hd = "";
        String ed;
        
        

        if (hireDate
                == null) {
            errDate.setText("Please enter a Hire Date.");

        } else {
            hd = dateFormat.format(jdHire.getDate());
        }

        if (endDate
                == null) {
            ed = "N/A";
        } else {
            ed = dateFormat.format(jdEnd.getDate());
        }

        String response = validateDate(hireDate, endDate);

        if (hireDate
                != null) {
            if (response.equals("")) {
                validate++;
            } else {
                errDate.setText(response);
            }
        }
        //String Department, String employeeID, String Rank, String beginDate, String endDate
        if (validate == 1) {
            empList = readEmployee("Employees.txt");
            EmployeeNode empTest = empList.getHead();

            for (int i = 0; i < empList.size(); i++) {
                if (empTest.getEmployeeID().equals(cbEmployeeID.getSelectedItem().toString())) {

                    String firstName = empTest.getFirstName();
                    String lastName = empTest.getLastName();
                    String email = empTest.getEmail();
                    model.addRow(new Object[]{cbDepartment.getSelectedItem(), cbEmployeeID.getSelectedItem(), firstName, lastName, cbRank.getSelectedItem(), email, hd, ed});
                }

                empTest = empTest.getNext();
            }

            assign = readAssignments("Assignments.txt");
            assign.add(cbDepartment.getSelectedItem().toString(), cbEmployeeID.getSelectedItem().toString(), cbRank.getSelectedItem().toString(), hd, ed);
            Project.addToAssList(assign);
            Project.closeFile();

            resetText();
            eraseError();
        }

    }//GEN-LAST:event_bnAddActionPerformed

    private void bnPastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPastActionPerformed
        assign = readAssignments("Assignments.txt");
        empList = readEmployee("Employees.txt");
        dptr = readDepartments("Departments.txt");
        pay = readPayroll("Paygrade.txt");
        eraseError();
        resetText();
        DefaultTableModel model = (DefaultTableModel) tbAssignments.getModel();
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }

        AssignmentNode assTest = assign.getHead();
        EmployeeNode empTest = empList.getHead();
        DepartmentNode dptrTest = dptr.getHead();
        PayrollNode payTest = pay.getHead();

        Date today = new Date();
        Date dateTest = new Date();

        populateDepartment();
        populateRank();
        populateEmployee();

        for (int i = 0; i < assign.size(); i++) {
            for (int j = 0; j < empList.size(); j++) {
                if (assTest.getEmployeeID().equals(empTest.getEmployeeID())) {
                    if (assTest.getEndDate().equals("N/A")) {
                        Date end = new Date("12/12/9999");
                        dateTest = end;
                    } else {
                        Date end = new Date(assTest.getEndDate());
                        dateTest = end;
                    }

                    if (dateTest.before(today)) {
                        model.addRow(new Object[]{assTest.getDepartment(), assTest.getEmployeeID(),
                            empTest.getLastName(), empTest.getFirstName(), assTest.getRank(), empTest.getEmail(), assTest.getBeginDate(),
                            assTest.getEndDate()});
                    }
                }

                empTest = empTest.getNext();
            }
            empTest = empList.getHead();

            assTest = assTest.getNext();
        }
    }//GEN-LAST:event_bnPastActionPerformed

    private void bnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnUpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tbAssignments.getModel();
        assign = readAssignments("Assignments.txt");
        AssignmentNode assTest = assign.getHead();
        eraseError();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        int selectedRow = tbAssignments.getSelectedRow();
        String empID = tbAssignments.getValueAt(selectedRow, 1).toString();
        Date endVoid = jdEnd.getDate();
        String ed = "";
        if (endVoid == null) {
            ed = "N/A";
        } else {
            ed = dateFormat.format(jdEnd.getDate());
        }
        String hd = tbAssignments.getValueAt(selectedRow, 6).toString();
        Date hireTest = new Date(hd);
        String response = validateDate(hireTest, jdEnd.getDate());

        if (response.equals("")) {
            if (ed.equals("12/12/9999")) {
                ed = "N/A";
            }
            //lbTest.setText(String.valueOf(validate));
            for (int j = 0; j < assign.size(); j++) {
                if (empID.equals(assTest.getEmployeeID())) {
                    assTest.setEndDate(ed);
                }

                assTest = assTest.getNext();
            }

            Project.addToAssList(assign);
            Project.closeFile();

            assign = readAssignments("Assignments.txt");
            empList = readEmployee("Employees.txt");
            dptr = readDepartments("Departments.txt");
            pay = readPayroll("Paygrade.txt");

            model = (DefaultTableModel) tbAssignments.getModel();
            resetText();
            eraseError();
            assTest = assign.getHead();
            EmployeeNode empTest = empList.getHead();
            DepartmentNode dptrTest = dptr.getHead();
            PayrollNode payTest = pay.getHead();

            Date today = new Date();
            Date dateTest = new Date();
            int rows = model.getRowCount();
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }

            populateDepartment();
            populateRank();
            populateEmployee();

            for (int i = 0; i < assign.size(); i++) {
                for (int j = 0; j < empList.size(); j++) {
                    if (assTest.getEmployeeID().equals(empTest.getEmployeeID())) {
                        if (assTest.getEndDate().equals("N/A")) {
                            Date end = new Date("12/12/9999");
                            dateTest = end;
                        } else {
                            Date end = new Date(assTest.getEndDate());
                            dateTest = end;
                        }

                        if (dateTest.after(today)) {
                            model.addRow(new Object[]{assTest.getDepartment(), assTest.getEmployeeID(),
                                empTest.getLastName(), empTest.getFirstName(), assTest.getRank(), empTest.getEmail(), assTest.getBeginDate(),
                                assTest.getEndDate()});
                        }
                    }

                    empTest = empTest.getNext();
                }
                empTest = empList.getHead();

                assTest = assTest.getNext();
            }
        } else {
            errDate.setText(response);
        }
    }//GEN-LAST:event_bnUpdateActionPerformed

    private void bnCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCurrentActionPerformed
        // TODO add your handling code here:
        assign = readAssignments("Assignments.txt");
        empList = readEmployee("Employees.txt");
        dptr = readDepartments("Departments.txt");
        pay = readPayroll("Paygrade.txt");
        eraseError();
        resetText();
        DefaultTableModel model = (DefaultTableModel) tbAssignments.getModel();
        int rows = model.getRowCount();
        for (int i = 0; i < rows; i++) {
            model.removeRow(0);
        }
        AssignmentNode assTest = assign.getHead();
        EmployeeNode empTest = empList.getHead();
        DepartmentNode dptrTest = dptr.getHead();
        PayrollNode payTest = pay.getHead();

        Date today = new Date();
        Date dateTest = new Date();

        populateDepartment();
        populateRank();
        populateEmployee();

        for (int i = 0; i < assign.size(); i++) {
            for (int j = 0; j < empList.size(); j++) {
                if (assTest.getEmployeeID().equals(empTest.getEmployeeID())) {
                    if (assTest.getEndDate().equals("N/A")) {
                        Date end = new Date("12/12/9999");
                        dateTest = end;
                    } else {
                        Date end = new Date(assTest.getEndDate());
                        dateTest = end;
                    }

                    if (dateTest.after(today)) {
                        model.addRow(new Object[]{assTest.getDepartment(), assTest.getEmployeeID(),
                            empTest.getLastName(), empTest.getFirstName(), assTest.getRank(), empTest.getEmail(), assTest.getBeginDate(),
                            assTest.getEndDate()});
                    }
                }

                empTest = empTest.getNext();
            }
            empTest = empList.getHead();

            assTest = assTest.getNext();
        }
    }//GEN-LAST:event_bnCurrentActionPerformed

    private void cbEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmployeeIDActionPerformed

    private void cbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartmentActionPerformed
        // TODO add your handling code here:
        cbDepartment.getSelectedItem();

    }//GEN-LAST:event_cbDepartmentActionPerformed

    private void cbRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRankActionPerformed
        // TODO add your handling code here:
        cbRank.getSelectedItem();
    }//GEN-LAST:event_cbRankActionPerformed

    private void tbAssignmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAssignmentsMouseClicked
        int selectedRow = tbAssignments.getSelectedRow();
        eraseError();
        resetText();
        Date displayDate = new Date();
        if (tbAssignments.getValueAt(selectedRow, 7).toString().equals("N/A")) {
            Date date = new Date("12/12/9999");
            displayDate = date;
        } else {
            Date date = new Date(tbAssignments.getValueAt(selectedRow, 7).toString());
            displayDate = date;
        }
        jdEnd.setDate(displayDate);
    }//GEN-LAST:event_tbAssignmentsMouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentForm().setVisible(true);
            }
        });
    }

    public void eraseError() {
        errDate.setText("");
    }

    public void resetText() {
        jdHire.setDate(null);
        jdEnd.setDate(null);
        cbEmployeeID.setSelectedItem("Select One");
        cbDepartment.setSelectedItem("Select One");
        cbRank.setSelectedItem("Select One");
    }

    public static String validateDate(Date hire, Date end) {
        String response = "";
        Date infinite = new Date("12/31/9999");
        if (end == null) {
            end = infinite;
        }
        if (hire != null) {

            if (hire.after(end)) {
                response = "Hire Date must be before End Date";
            }

        }
        return response;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnCurrent;
    private javax.swing.JButton bnPast;
    private javax.swing.JButton bnUpdate;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbEmployeeID;
    private javax.swing.JComboBox<String> cbRank;
    private javax.swing.JLabel errDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdEnd;
    private com.toedter.calendar.JDateChooser jdHire;
    private javax.swing.JTable tbAssignments;
    // End of variables declaration//GEN-END:variables
}
