/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.InventoryBLL;
import BLL.ProductBLL;
import BLL.RegisterBLL;
import DTO.InventoryDTO;
import DTO.ProductDTO;
import DTO.RegisterDTO;
import com.toedter.calendar.JTextFieldDateEditor;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nam
 */
public class AddInventoryPanel extends javax.swing.JPanel {
    JTextFieldDateEditor ngaylapTxt;
    
    InventoryBLL bll = new InventoryBLL();
    ProductBLL productBLL = new ProductBLL();
    InventoryDTO dto;
    //CheckLoi cl = new CheckLoi();
    /**
     * Creates new form EmployeePanel
     */
    public AddInventoryPanel() {
        
        initComponents();
        init();
    }
    
    public void init()
    {
        ngaylapTxt = (JTextFieldDateEditor) dateTxt.getDateEditor();
        ngaylapTxt.setEditable(false);
    }

    public void insertInventory()
    {
        
        
            dto = new InventoryDTO(invenNo.getText(), ngaylapTxt.getText(),infotxt.getText() );
            bll.insertInventory(dto);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invenNo = new javax.swing.JTextField();
        sdtErr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        infotxt = new javax.swing.JTextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin chi tiét:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("IMPORT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("InventoryNo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));
        jPanel1.add(invenNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 560, 50));

        sdtErr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        sdtErr.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(sdtErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 480, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Ngày tạo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        saveBtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-save-all-20.png"))); // NOI18N
        saveBtn.setText("Lưu thông tin");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));
        jPanel1.add(infotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 560, 140));

        dateTxt.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 560, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 540));

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backBtn.setText(" Quay lại");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        insertInventory();
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        OverrallFrame.changeMainInfo(1);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JTextField infotxt;
    private javax.swing.JTextField invenNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel sdtErr;
    // End of variables declaration//GEN-END:variables
}