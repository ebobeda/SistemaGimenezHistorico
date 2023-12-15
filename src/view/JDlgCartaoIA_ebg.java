/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import tools.Util_ebg;
import bean.CartaoEbg;
import dao.Cartao_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class JDlgCartaoIA_ebg extends javax.swing.JDialog {
    private boolean incluindo;
    private MaskFormatter mascaraCPF, mascaraValidade;
    CartaoEbg cartao;
    Cartao_DAO cartao_DAO;
    /**
     * Creates new form JDlgCartaoNovoIA
     */
    public JDlgCartaoIA_ebg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Inclusão");
        setLocationRelativeTo(null);
        
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraValidade = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCartaoIA_ebg.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         jFmtCpf_ebg.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
         jFmtValidade_ebg.setFormatterFactory(new DefaultFormatterFactory(mascaraValidade));
    
}

    public CartaoEbg viewBean() {
        CartaoEbg cartaoEbg = new CartaoEbg();
        
        cartaoEbg.setIdcartaoEbg(Util_ebg.strInt(jTxtCodigo_ebg.getText()));
        cartaoEbg.setNomecompletoEbg(jTxtNomecompleto_ebg.getText());
        cartaoEbg.setCpfEbg(jFmtCpf_ebg.getText());
        cartaoEbg.setNumerocartaoEbg(jTxtNumerocartao_ebg.getText());
        cartaoEbg.setCscEbg(Util_ebg.strInt(jTxtCsc_ebg.getText()));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            cartaoEbg.setValidadeEbg (formato.parse(jFmtValidade_ebg.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCartao_ebg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cartaoEbg;
    }
    
    public void beanView (CartaoEbg cartaoEbg){
        String id = String.valueOf(cartaoEbg.getIdcartaoEbg());
        
        jTxtCodigo_ebg.setText(id);
        jTxtNomecompleto_ebg.setText(cartaoEbg.getNomecompletoEbg());
        jFmtCpf_ebg.setText(cartaoEbg.getCpfEbg());
        jTxtNumerocartao_ebg.setText(cartaoEbg.getNumerocartaoEbg());
        jTxtCsc_ebg.setText(Util_ebg.intStr(cartaoEbg.getCscEbg()));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        jFmtValidade_ebg.setText(formato.format(cartaoEbg.getValidadeEbg()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNumerocartao_ebg = new javax.swing.JTextField();
        jFmtValidade_ebg = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtCodigo_ebg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNomecompleto_ebg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnOk_ebg = new javax.swing.JButton();
        jBtnCancelar_ebg = new javax.swing.JButton();
        jFmtCpf_ebg = new javax.swing.JFormattedTextField();
        jTxtCsc_ebg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Número do cartão");

        jLabel3.setText("Data de validade");

        jFmtValidade_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtValidade_ebgActionPerformed(evt);
            }
        });

        jLabel6.setText("Código");

        jTxtCodigo_ebg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtCodigo_ebgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtCodigo_ebgFocusLost(evt);
            }
        });
        jTxtCodigo_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigo_ebgActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Completo");

        jLabel4.setText("CPF");

        jLabel2.setText("CSC");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jBtnOk_ebg.setText("OK");
        jBtnOk_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOk_ebgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk_ebg);

        jBtnCancelar_ebg.setText("Cancelar");
        jBtnCancelar_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_ebgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar_ebg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtCsc_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jFmtValidade_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFmtCpf_ebg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNomecompleto_ebg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNumerocartao_ebg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodigo_ebg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 175, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtCodigo_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNomecompleto_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtCpf_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNumerocartao_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtValidade_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCsc_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtValidade_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtValidade_ebgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtValidade_ebgActionPerformed

    private void jTxtCodigo_ebgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCodigo_ebgFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_ebgFocusGained

    private void jTxtCodigo_ebgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCodigo_ebgFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_ebgFocusLost

    private void jTxtCodigo_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_ebgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigo_ebgActionPerformed

    private void jBtnOk_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOk_ebgActionPerformed
    cartao = viewBean();
    cartao_DAO = new Cartao_DAO();
    if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
    cartao_DAO.insert(cartao);
    Util_ebg.mensagem("Incluido com sucesso!");
    }else {            
          cartao_DAO.update(cartao);
          Util_ebg.mensagem("Alterado com sucesso!");
        }
    Util_ebg.limparCampos(jTxtCodigo_ebg, jTxtNomecompleto_ebg, jFmtCpf_ebg, jTxtNumerocartao_ebg, jTxtCsc_ebg, jFmtValidade_ebg);
    
    setVisible(false);
    }//GEN-LAST:event_jBtnOk_ebgActionPerformed

    private void jBtnCancelar_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_ebgActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Util_ebg.mensagem("Operação Cancelada!");
    }//GEN-LAST:event_jBtnCancelar_ebgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCartaoIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCartaoIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCartaoIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCartaoIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCartaoIA_ebg dialog = new JDlgCartaoIA_ebg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar_ebg;
    private javax.swing.JButton jBtnOk_ebg;
    private javax.swing.JFormattedTextField jFmtCpf_ebg;
    private javax.swing.JFormattedTextField jFmtValidade_ebg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCodigo_ebg;
    private javax.swing.JTextField jTxtCsc_ebg;
    private javax.swing.JTextField jTxtNomecompleto_ebg;
    private javax.swing.JTextField jTxtNumerocartao_ebg;
    // End of variables declaration//GEN-END:variables
}
