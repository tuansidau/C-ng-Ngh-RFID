/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BLL.InventoryBLL;
import BLL.InventoryDetailBLL;
import BLL.RegisterBLL;
import DTO.InventoryDTO;
import DTO.InventoryDetail;
import DTO.RegisterDTO;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nam
 */
public class InventoryGUI extends javax.swing.JPanel {
    public static int currentIdInventory;
    public static int currentIdRegister;
    //FormatTable formatTable = new FormatTable();
    InventoryBLL bus = new InventoryBLL();
    RegisterBLL bus1 = new RegisterBLL();
    DefaultTableModel model =new DefaultTableModel();
    DefaultTableModel model1 =new DefaultTableModel();
    
    InventoryDetailBLL detailbll = new InventoryDetailBLL();
    
    InventoryDetail detaildto;
    
    /**
     * Creates new form EmployeePanel
     */
    public InventoryGUI() {
        initComponents();
        init();
    }
    
    
    public void init()
    {
        //formatTable.formatTablenoIcon(table);
        
        //Header content of jtable
        bus.docInventory();
        Vector header1 = new Vector();
        header1.add("ID");
        header1.add("No");
        header1.add("InventoryDate");
        header1.add("MoreInfo");
        
        if (model1.getRowCount()==0)
        { 
                model1=new DefaultTableModel(header1,0){
                @Override//No edit
                public boolean isCellEditable(int row, int column) 
                {          
                    if(column == 4)
                    {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
        } 
        
        table1.setModel(model1);
        docInventory();
        
        //Header content of jtable
        bus1.docRegister();
        Vector header = new Vector();
        header.add("ID");
        header.add("TagId");
        header.add("IdProduct");
        
        
        if (model.getRowCount()==0)
        { 
                model=new DefaultTableModel(header,0){
                @Override//No edit
                public boolean isCellEditable(int row, int column) 
                {          
                    if(column == 4)
                    {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
        } 
        
        table.setModel(model);
        docRegister();
        
        //format table
        
        
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(30);
        
        
        table1.getColumnModel().getColumn(0).setPreferredWidth(30);
        table1.getColumnModel().getColumn(1).setPreferredWidth(30);
        table1.getColumnModel().getColumn(2).setPreferredWidth(120);
        table1.getColumnModel().getColumn(3).setPreferredWidth(150);
        

        
    }
    
    public void refresh()
    {
        init();
        
    }
    
    public void docInventory()
    {
        try
        {
            int rowCount = model1.getRowCount();//remove all row
            for (int i = rowCount - 1; i >= 0; i--) 
            {
                model1.removeRow(i);
            }
            for(InventoryDTO inv : InventoryBLL.sumArr)
            {
                Vector row = new Vector();
                row.add(inv.getId());
                row.add(inv.getInventoryNo());
                row.add(inv.getInventoryDateString());
                row.add(inv.getMoreInfo());
                               
                
                model1.addRow(row);
            }
            table1.setModel(model1);
        
        } catch(Exception e) {
            System.out.println("Lỗi đọc  GUI");
        }
    }
    public void docRegister()
    {
        try
        {
            int rowCount = model.getRowCount();//remove all row
            for (int i = rowCount - 1; i >= 0; i--) 
            {
                model.removeRow(i);
            }
            for(RegisterDTO re : RegisterBLL.sumArr)
            {
                Vector row = new Vector();
                row.add(re.getId());
                row.add(re.getTagId());
                row.add(re.getIdProduct());
                
                               
                
                model.addRow(row);
            }
            table.setModel(model);
        
        } catch(Exception e) {
            System.out.println("Lỗi đọc  GUI");
        }
    }
    
    public void insertInventoryDetail()
    {
        int i = table1.getSelectedRow();
            int j = table.getSelectedRow();
        
            
        int idInventory= Integer.parseInt(table1.getValueAt(i, 0).toString());
        int idRegister= Integer.parseInt(table.getValueAt(j, 0).toString());
        int read=0;
            detaildto = new InventoryDetail(idRegister, idInventory, read);
            detailbll.insertInventoryDetail(detaildto);
            //JOptionPane.showMessageDialog(null, "Thêm thành công");
            OverrallFrame.changeMainInfo(1);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        refreshBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setFillsViewportHeight(true);
        table.setName(""); // NOI18N
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 300, 330));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-user-menu-male-30.png"))); // NOI18N
        jLabel1.setText(" DANH SÁCH GIÁ TRỊ IMPORT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.setFillsViewportHeight(true);
        table1.setName(""); // NOI18N
        table1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 330));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-user-menu-male-30.png"))); // NOI18N
        jLabel3.setText(" DANH SÁCH PHIẾU KIỂM KÊ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-user-menu-male-30.png"))); // NOI18N
        jLabel4.setText(" DANH SÁCH PHIẾU KIỂM KÊ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 780, 410));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-add-20.png"))); // NOI18N
        addBtn.setText("Lập phiếu kiểm kê");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 160, 30));

        refreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refreshBtn.setText("Back");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel2.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        editBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-edit-20.png"))); // NOI18N
        editBtn.setText("Xem chi tiết");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel2.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 140, 30));

        refreshBtn1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refreshBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-update-left-rotation-20.png"))); // NOI18N
        refreshBtn1.setText("Refresh");
        refreshBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(refreshBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("QUẢN LÝ KIỂM KÊ ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        OverrallFrame.changeMainInfo(1);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        OverrallFrame.changeMainInfo(12);
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if(table.getSelectionModel().isSelectionEmpty() && table1.getSelectionModel().isSelectionEmpty())
        {
            OverrallFrame.changeMainInfo(13);
            //JOptionPane.showMessageDialog(null, "Chưa chọn thông tin");
        } else {
            int i = table1.getSelectedRow();
            int j = table.getSelectedRow();
            currentIdInventory = Integer.parseInt(table1.getValueAt(i, 0).toString());
            currentIdRegister = Integer.parseInt(table.getValueAt(j, 0).toString());
            insertInventoryDetail();
            OverrallFrame.changeMainInfo(13);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void refreshBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshBtn1;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
