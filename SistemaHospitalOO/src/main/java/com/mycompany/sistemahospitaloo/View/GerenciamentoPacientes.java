/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemahospitaloo.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mycompany.sistemahospitaloo.VerificaCPF;
import com.mycompany.sistemahospitaloo.VerificaCartaoSUS;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Taynara Ferraz
 */
public class GerenciamentoPacientes extends javax.swing.JFrame {

    /**
     * Creates new form GerenciamentoPacientes
     */
    public GerenciamentoPacientes() {
        initComponents();
        carregaDados();
        setLocationRelativeTo(null);
    }

    private void carregaDados() {
        String filePath = "src/main/resources/dadosCadastraisPacientes.json";

        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader(filePath);
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            model.setRowCount(0);

            for (JsonElement element : jsonArray) {
                JsonObject obj = element.getAsJsonObject();

                String nome = obj.has("user") ? obj.get("user").getAsString() : null;
                String num = obj.has("numeroCartaoSUS") ? obj.get("numeroCartaoSUS").getAsString() : null;
                String cpf = obj.has("cpf") ? obj.get("cpf").getAsString() : null;

                model.addRow(new Object[]{nome, num, cpf});
            }

            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo JSON: " + e.getMessage());
        }
    }
    
    private void mostrarMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private boolean gerenciaPaciente() {
        if (!VerificaCPF.verificaCPF(jTextField3.getText())) {
            mostrarMensagemErro("CPF inválido. Por favor, tente novamente.");
            return false; // Sai do método
        }
        if(!VerificaCartaoSUS.verificaSUS(jTextField2.getText())){
            mostrarMensagemErro("Cartão do SUS inválido. Por favor, tente novamente.");
            return false;
        }
        return true;
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nome");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Número do SUS");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Pacientes");

        jButton2.setText("Editar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Número do SUS", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário(a)?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String nomeParaExcluir = model.getValueAt(selectedRow, 0).toString();
                String numParaExcluir = model.getValueAt(selectedRow, 1).toString();
                String cpfParaExcluir = model.getValueAt(selectedRow, 2).toString();

                // Atualiza o arquivo JSON
                String filePath = "src/main/resources/dadosCadastraisPacientes.json";
                String filePathLogin = "src/main/resources/loginPacientes.json";
                try {
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();  // Mantém a formatação JSON
                    FileReader reader = new FileReader(filePath);
                    FileReader readerLogin = new FileReader(filePathLogin);
                    JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);
                    JsonArray jsonArrayLogin = gson.fromJson(readerLogin, JsonArray.class);
                    reader.close();
                    readerLogin.close();

                    // Remove o objeto do JSON com o nome correspondente
                    for (int i = 0; i < jsonArray.size(); i++) {
                        JsonObject obj = jsonArray.get(i).getAsJsonObject();
                        if (obj.get("user").getAsString().equals(nomeParaExcluir) && obj.get("numeroCartaoSUS").getAsString().equals(numParaExcluir)
                                && obj.get("cpf").getAsString().equals(cpfParaExcluir) ) {
                            jsonArray.remove(i);  // Remove o objeto do JSON
                            break;  // Sai do loop após encontrar e remover
                        }
                    }

                    for (int i = 0; i < jsonArrayLogin.size(); i++) {
                        JsonObject obj1 = jsonArrayLogin.get(i).getAsJsonObject();
                        if (obj1.get("user").getAsString().equals(nomeParaExcluir)) {
                            jsonArrayLogin.remove(i);  // Remove o objeto do JSON
                            break;  // Sai do loop após encontrar e remover
                        }
                    }

                    model.removeRow(selectedRow);
                    jTextField1.setText(null);
                    jTextField2.setText(null);
                    jTextField3.setText(null);

                    // Salvar as alterações de volta no arquivo JSON
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                        writer.write(gson.toJson(jsonArray));  // Sobrescreve o arquivo com o conteúdo atualizado
                    }

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathLogin))) {
                        writer.write(gson.toJson(jsonArrayLogin));  // Sobrescreve o arquivo com o conteúdo atualizado
                    }

                    JOptionPane.showMessageDialog(null, "Usuário(a) excluído(a) com sucesso.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir o(a) usuário(a) ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um(a) usuário(a) para excluir.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //edit
        boolean pacienteEncontrado = false;
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String novoNome = jTextField1.getText();
            String novoNumSus = jTextField2.getText();
            String novoCpf = jTextField3.getText();

            if (novoNome != null && !novoNome.trim().isEmpty() && novoNumSus != null && !novoNumSus.trim().isEmpty()
                    && novoCpf != null && !novoCpf.trim().isEmpty()) {

                if (!gerenciaPaciente()) {
                    return;
                }

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String nomeAntigo = model.getValueAt(selectedRow, 0).toString();
                String numSusAntigo = model.getValueAt(selectedRow, 1).toString();
                String cpfAntigo = model.getValueAt(selectedRow, 2).toString();

                // Atualiza o arquivo JSON
                String filePath = "src/main/resources/dadosCadastraisPacientes.json";
                String filePathLogin = "src/main/resources/loginPacientes.json";
                try {
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();  // Mantém a formatação JSON
                    FileReader reader = new FileReader(filePath);
                    FileReader readerLogin = new FileReader(filePathLogin);
                    JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);
                    JsonArray jsonArrayLogin = gson.fromJson(readerLogin, JsonArray.class);
                    reader.close();
                    readerLogin.close();

                    // Percorre o JSON procurando pelo nome antigo e atualiza o nome
                    for (JsonElement element : jsonArray) {
                        JsonObject obj = element.getAsJsonObject();
                        if (obj.get("user").getAsString().equals(nomeAntigo) &&
                                obj.get("numeroCartaoSUS").getAsString().equals(numSusAntigo) && 
                                obj.get("cpf").getAsString().equals(cpfAntigo)) {
                            obj.addProperty("user", novoNome);  // Atualiza o JSON com o novo nome
                            obj.addProperty("numeroCartaoSUS", novoNumSus);
                            obj.addProperty("cpf", novoCpf);

                            model.setValueAt(novoNome, selectedRow, 0);  // Atualiza a tabela
                            model.setValueAt(novoNumSus, selectedRow, 1);
                            model.setValueAt(novoCpf, selectedRow, 2);

                            pacienteEncontrado = true;
                            break;
                        }

                    }

                    for (int i = 0; i < jsonArrayLogin.size(); i++) {
                        JsonObject obj1 = jsonArrayLogin.get(i).getAsJsonObject();
                        if (obj1.get("user").getAsString().equals(nomeAntigo)) {
                            obj1.addProperty("user", novoNome);  // Atualiza o JSON com o novo nome
                            break;  // Sai do loop após encontrar e remover
                        }
                    }

                    // Salvar as alterações de volta no arquivo JSON
                    if (pacienteEncontrado) {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                            writer.write(gson.toJson(jsonArray));  // Sobrescreve o arquivo com o conteúdo atualizado
                            JOptionPane.showMessageDialog(null, "Os dados do usuário(a) foram atualizado com sucesso.");

                        }

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathLogin))) {
                            writer.write(gson.toJson(jsonArrayLogin));  // Sobrescreve o arquivo com o conteúdo atualizado
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Usuário(a) não encontrado.");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao editar os dados do usuário(a): ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Todos os campos devem ser preenchidos.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();

        //seta os inputs com o valor contido na linha e coluna selecionada
        jTextField1.setText(jTable1.getValueAt(linha, 0).toString());
        jTextField2.setText(jTable1.getValueAt(linha, 1).toString());
        jTextField3.setText(jTable1.getValueAt(linha, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
