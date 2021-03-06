/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dados.Cliente;
import javax.swing.JOptionPane;
import tabelas.ClientesTableModel;
import repositorio.RepositorioClientes;

/**
 *
 * @author alunofavip
 */
public class TelaCliente extends javax.swing.JFrame {

    ClientesTableModel clientesTableModel;

    //telas 
    TelaClienteEditar telaEditarCliente = null;
    TelaClienteAdicionar telaAdicionarCliente = null;

    /**
     * Creates new form TelaCadastrarCliente
     */
    public TelaCliente() {
        initComponents();

        this.clientesTableModel = new ClientesTableModel();
        jTableCliente.setModel(clientesTableModel);

        setTamanhoColuna();

    }

    private void setTamanhoColuna() {
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTableCliente.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTableCliente.getColumnModel().getColumn(10).setPreferredWidth(200);
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
        jTPesquisarCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 338));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.jComboBox1.removeAllItems();
        this.jComboBox1.addItem("Nome");
        this.jComboBox1.addItem("CPF");
        this.jComboBox1.addItem("Código");

        jButton2.setText("adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableClienteMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

        jButton6.setText("Atualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (telaAdicionarCliente == null) {
            telaAdicionarCliente = new TelaClienteAdicionar();
        }
        telaAdicionarCliente.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (clientesTableModel.getRowCount() != 0) {
            Cliente c = clientesTableModel.getCliente(jTableCliente.getSelectedRow());
            if (c != null) {
                System.out.print(c);
                int opcao = JOptionPane.showConfirmDialog(this, c, "Excluir cliente?", JOptionPane.YES_NO_OPTION);

                if (opcao == JOptionPane.YES_OPTION) {
                    RepositorioClientes.removerCliente(c);
                    clientesTableModel.atualizarTabela();
                    
                } else if (opcao == JOptionPane.NO_OPTION) {
                    System.out.print("exclusão abortada");
                }
            } else if (c == null) {
                //getSelectedRow retorna -1 quando não esta selecionado
                System.out.print(jTableCliente.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Selecione ou pesquise um cliente para excluir");
            }
        } else {
            JOptionPane.showMessageDialog(this, "O sistema não possui clientes cadastrados!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (RepositorioClientes.listaClientes.size() > 0) {

            if (jTPesquisarCliente.getText().length() != 0) {
                //pesquisa por nome 
                if (jComboBox1.getSelectedIndex() == 0) {
                   
                    Cliente c = RepositorioClientes.pesquisarClienteNome(jTPesquisarCliente.getText().toUpperCase());
                    int linhaCliente = clientesTableModel.getLinhaCliente(c);

                    if (c != null && linhaCliente != -1) {
                        
                        //mensagem
                        JOptionPane.showMessageDialog(rootPane, "Cliente encontrado!");

                        //seliciona a linha do produto pesquisado via codigo
                        jTableCliente.setRowSelectionInterval(linhaCliente, linhaCliente);

                        //limpa o campo de pesquisa 
                        jTPesquisarCliente.setText(null);
                    } else if (linhaCliente == -1) {
                        JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
                    }
                } else if (jComboBox1.getSelectedIndex() == 1) {
                    //pesquisa por cpf 
                    Cliente c = RepositorioClientes.pesquisarClienteCpf(jTPesquisarCliente.getText());
                    int linhaCliente = clientesTableModel.getLinhaCliente(c);

                    if (c != null && linhaCliente != -1) {

                        JOptionPane.showMessageDialog(this, "Cliente encontrado!");

                        //seleciona a linha do cliente pesquisado 
                        jTableCliente.setRowSelectionInterval(linhaCliente, linhaCliente);

                        //limpa o campo de pesquisa 
                        jTPesquisarCliente.setText(null);
                    } else if (linhaCliente == -1) {
                        //cliente retornou vazio 
                        JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
                    }
                } else if (jComboBox1.getSelectedIndex() == 2) {
                    //pesquisar por codigo 
                    Cliente c = RepositorioClientes.pesquisarClienteCodigo(Integer.parseInt(jTPesquisarCliente.getText()));
                    int linhaCliente = clientesTableModel.getLinhaCliente(c);

                    if (c != null && linhaCliente != -1) {

                        JOptionPane.showMessageDialog(this, "Cliente encontrado!");

                        jTableCliente.setRowSelectionInterval(linhaCliente, linhaCliente);
                    } else if (linhaCliente == -1) {
                        JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Campo de pesquisa em branco");
            }
        } else {
            JOptionPane.showMessageDialog(this, "o sistema não possui clientes cadastrados");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if (RepositorioClientes.listaClientes.size() > 0) {
        
            Cliente c = clientesTableModel.getCliente(jTableCliente.getSelectedRow());
            if (c != null) {
                if (telaEditarCliente == null) {
                    telaEditarCliente = new TelaClienteEditar(c);
                }
                telaEditarCliente.setVisible(true);
            } else if (c == null) {
                JOptionPane.showMessageDialog(this, "Selecione ou pesquise um cliente para editar");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked

    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jTableClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMousePressed

    }//GEN-LAST:event_jTableClienteMousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clientesTableModel.atualizarTabela();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void atualizar() {
        clientesTableModel.atualizarTabela();
    }

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTPesquisarCliente;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
