/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.trabalhoFinal.UI;

import com.trabalhoFinal.Dominio.Exame;
import com.trabalhoFinal.Dominio.ExameSangue;
import com.trabalhoFinal.Lista.GerenciadorDeExame;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class EditarExameSanguePainel extends javax.swing.JPanel {

    private GerenciadorDeExame gerenciadorDeExame;
    private App app;

    /**
     * Creates new form CadastrarExamePanel
     */
    public EditarExameSanguePainel(GerenciadorDeExame gerenciadorDeExame, App app) {
        super();
        initComponents();
        this.gerenciadorDeExame = gerenciadorDeExame;
        this.app = app;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Id = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editarExameBtn = new javax.swing.JButton();
        txtHemoglobina = new javax.swing.JTextField();
        txtLeucocitos = new javax.swing.JTextField();
        txtPlaquetas = new javax.swing.JTextField();
        campo1 = new javax.swing.JLabel();
        campo2 = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Id.setText("Id");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nome.setText("Nome");

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpf.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setText("Editar Exame Sangue");

        editarExameBtn.setText("Editar");
        editarExameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarExameBtnActionPerformed(evt);
            }
        });

        campo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo1.setText("Hemoglobina");

        campo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo2.setText("Leucócitos");

        campo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo3.setText("Plaquetas");

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarExameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpf)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campo1)
                                        .addComponent(campo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(nome)
                                    .addComponent(Id))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtNome)
                                    .addComponent(txtPlaquetas)
                                    .addComponent(txtLeucocitos)
                                    .addComponent(txtHemoglobina)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome)
                        .addGap(12, 12, 12)
                        .addComponent(cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLeucocitos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarExameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarExameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarExameBtnActionPerformed
        JTextField[] campos = {txtId, txtNome, txtCpf, txtHemoglobina, txtLeucocitos, txtPlaquetas};

        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
                return;
            }
        }

        String id = txtId.getText();
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        double hemoglobina;
        double leucocitos;
        double plaquetas;

        try {
            hemoglobina = Double.parseDouble(txtHemoglobina.getText());
            leucocitos = Double.parseDouble(txtLeucocitos.getText());
            plaquetas = Double.parseDouble(txtPlaquetas.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos nos campos hemoglobina, leucócitos e plaquetas.");
            return;
        }
        
        Date dataAtual = new Date();

        Exame dadosAtualizados = new ExameSangue(id, dataAtual, nome, cpf, hemoglobina, leucocitos, plaquetas);

        if (gerenciadorDeExame.editarExame(id, dadosAtualizados)) {
            JOptionPane.showMessageDialog(this, "Exame editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Exame com este id não existe " + txtId.getText());
        }
        limparCampos();
    }//GEN-LAST:event_editarExameBtnActionPerformed

    private void limparCampos() {
        // Limpa os campos de texto após a Edição
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtHemoglobina.setText("");
        txtLeucocitos.setText("");
        txtPlaquetas.setText("");
    }

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        app.mudaPainel(App.PAINEL_PRINCIPAL);
        limparCampos();
    }//GEN-LAST:event_voltarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo3;
    private javax.swing.JLabel cpf;
    private javax.swing.JButton editarExameBtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtHemoglobina;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLeucocitos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaquetas;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables

}
