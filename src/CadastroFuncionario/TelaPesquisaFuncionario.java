package CadastroFuncionario;
import ConexaoMysql.*;
import Controlador.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaPesquisaFuncionario extends javax.swing.JInternalFrame {

    
    public TelaPesquisaFuncionario() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        jTable.setRowSorter(new TableRowSorter(modelo));

        readjTable();
    }

    public void readjTable() {

        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);
        FuncionarioBD fb = new FuncionarioBD();

        for (cadfuncionario p : fb.ler()) {

            modelo.addRow(new Object[]{
                p.getID(),
                p.getNome(),
                p.getTel(),
                p.getCel(),
                p.getEmail(),
                p.getCargo(),
                p.getCpf(),
                p.getData(),
                p.getSexo()
               
            });

        }

    }
       
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Att = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Jnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jtel = new javax.swing.JTextField();
        Jemail = new javax.swing.JTextField();
        Jcel = new javax.swing.JTextField();
        Jcargo = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Jcpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Jdata = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Jsexo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa De Funcionario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Att.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Att.setText("Atualizar");
        Att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttActionPerformed(evt);
            }
        });

        remover.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Celular", "E-mail", "Cargo", "Cpf", "Data", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        Jnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Cargo:");

        Jtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtelActionPerformed(evt);
            }
        });

        Jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JemailActionPerformed(evt);
            }
        });

        Jcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcelActionPerformed(evt);
            }
        });

        Jcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcargoActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("CPF:");

        Jcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcpfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Data:");

        Jdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdataActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo:");

        Jsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7))
                                        .addGap(23, 23, 23))
                                    .addComponent(Jnome))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Jtel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(Jcel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Jcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Att, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remover)
                    .addComponent(sair)
                    .addComponent(Att))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttActionPerformed
         if(jTable.getSelectedRow()!=-1){
       FuncionarioBD fb = new FuncionarioBD();    
      cadfuncionario cf= new cadfuncionario();
        cf.setNome(Jnome.getText());
        cf.setTel(Jtel.getText());
       cf.setCel(Jcel.getText());
       cf.setEmail(Jemail.getText());
       cf.setCargo(Jcargo.getText());
       cf.setCpf(Jcpf.getText());
       cf.setData(Jdata.getText());
       cf.setSexo(Jsexo.getText());
         cf.setID((int)jTable.getValueAt(jTable.getSelectedRow(), 0));
        fb.update(cf);
        
        Jnome.setText("");
        Jtel.setText("");
        Jcel.setText("");
        Jemail.setText("");
        Jcargo.setText("");
        Jcpf.setText("");
        Jdata.setText("");
        Jsexo.setText("");
         readjTable();
        JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
       }
    }//GEN-LAST:event_AttActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
       if(jTable.getSelectedRow()!=-1){
        
           
           
       
         FuncionarioBD fb = new FuncionarioBD();    
      cadfuncionario cf= new cadfuncionario();
     
       cf.setID((int)jTable.getValueAt(jTable.getSelectedRow(), 0));
        fb.delete(cf);
        
        Jnome.setText("");
        Jtel.setText("");
        Jcel.setText("");
        Jemail.setText("");
        Jcargo.setText("");
        Jcpf.setText("");
        Jdata.setText("");
        Jsexo.setText("");
         readjTable();
       
           
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
       }
    }//GEN-LAST:event_removerActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void JcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcargoActionPerformed

    private void JemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JemailActionPerformed

    private void JcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcelActionPerformed

    private void JtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtelActionPerformed

    private void JnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JnomeActionPerformed

    private void jTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyReleased
      
        
         if (jTable.getSelectedRow() != -1) {

            Jnome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            Jtel.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            Jcel.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            Jemail.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            Jcargo.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            Jcpf.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            Jdata.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            Jsexo.setText(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());
            
            

        }
        
        
        
    }//GEN-LAST:event_jTableKeyReleased

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
         
         if (jTable.getSelectedRow() != -1) {

            Jnome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            Jtel.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            Jcel.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            Jemail.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            Jcargo.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
             Jcpf.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            Jdata.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            Jsexo.setText(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());

        }
        
        
        
        
        
    }//GEN-LAST:event_jTableMouseClicked

    private void JcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcpfActionPerformed

    private void JdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdataActionPerformed

    private void JsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JsexoActionPerformed
//   public void Tabela(){
//   initComponents();
//   DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
//   jTable1.setRowSorter(new TableRowSorter(model));


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Att;
    private javax.swing.JTextField Jcargo;
    private javax.swing.JTextField Jcel;
    private javax.swing.JTextField Jcpf;
    private javax.swing.JTextField Jdata;
    private javax.swing.JTextField Jemail;
    private javax.swing.JTextField Jnome;
    private javax.swing.JTextField Jsexo;
    private javax.swing.JTextField Jtel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton remover;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
