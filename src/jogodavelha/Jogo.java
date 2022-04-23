package jogodavelha;

public class Jogo extends javax.swing.JFrame {

    public int placar1 = 0, placar2 = 0;
    public boolean Jogador1 = true;
    public boolean Jogador2 = true;
    public int ContarPosicao = 0;
    public int k = 0, i = 0;
    int Armazena;
    public String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
    String[][] PosicaoVetor = new String[3][3];

    public Jogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVisor1 = new javax.swing.JTextField();
        txtVisor2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO DA VELHA V 0.2");
        getContentPane().setLayout(null);

        btn1.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(70, 70, 154, 108);

        btn2.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(264, 70, 154, 108);

        btn3.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(458, 70, 154, 108);

        btn4.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(70, 218, 154, 108);

        btn5.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(264, 218, 154, 108);

        btn6.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(458, 218, 154, 108);

        btn7.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(70, 366, 154, 108);

        btn8.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(264, 366, 154, 108);

        btn9.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(458, 366, 154, 108);

        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnReiniciar.setText("REINICIAR JOGO");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar);
        btnReiniciar.setBounds(70, 628, 542, 66);

        txtVisor.setEditable(false);
        txtVisor.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVisor.setText("JOGO DA VELHA");
        txtVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisorActionPerformed(evt);
            }
        });
        getContentPane().add(txtVisor);
        txtVisor.setBounds(70, 514, 542, 74);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACAR DO JOGO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(717, 70, 244, 60);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JOGADOR 01");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(717, 218, 244, 32);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JOGADOR 02");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(727, 366, 234, 32);

        txtVisor1.setEditable(false);
        txtVisor1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtVisor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVisor1.setText("0");
        txtVisor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisor1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtVisor1);
        txtVisor1.setBounds(763, 268, 147, 43);

        txtVisor2.setEditable(false);
        txtVisor2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtVisor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVisor2.setText("0");
        txtVisor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisor2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtVisor2);
        txtVisor2.setBounds(762, 416, 147, 43);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Projeto em Teste MuAlves");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(760, 730, 200, 19);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Reiniciar placar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(762, 636, 168, 57);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1054, 819));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtVisorActionPerformed

    public void VerificaJogadorDaVez() {
        //METODO QUE VERIFICA QUAL JOGADOR IRÁ JOGAR...
        if (Jogador1 && Jogador2) {
            this.Armazena = 1;
            Jogador1 = false;
            Jogador2 = true;
            txtVisor.setText("Vez do jogador 02");
        } else if (Jogador1 && Jogador2 == false) {
            this.Armazena = 1;
            Jogador1 = false;
            Jogador2 = true;
            txtVisor.setText("Vez do jogador 02");
        } else {
            this.Armazena = 2;
            Jogador1 = true;
            Jogador2 = false;
            txtVisor.setText("Vez do jogador 01");
        }

    }

    public void LimpaPosicoes() {
        //CONFIGURAÇÕES PARA LIMPAR AS POSIÇÕES DO VETOR
        for (i = 0; i < 3; i++) {
            for (k = 0; k < 3; k++) {
                PosicaoVetor[i][k] = "";
                System.out.println(PosicaoVetor[i][k]);
            }
        }
    }

    public void VerificaPosicoes() {
        //CONFIGURAÇÕES DE VERIFICAR AS POSIÇÕES 
        ContarPosicao = 0;
        for (i = 0; i < 3; i++) {
            for (k = 0; k < 3; k++) {
                if ("X".equals(PosicaoVetor[i][k]) | "O".equals(PosicaoVetor[i][k])) {
                    ContarPosicao += 1;
                }
            }
        }
    }

    public void VerificaVencedor() {
        //CONFIGURAÇÃO DE VERIFICAR QUEM QUANHOU O JOGO, A MESMA FAZ A VARREDURA POR LINHAS,COLUNAS E DIAGONAIS...

        //LINHAS...
        linha1 = PosicaoVetor[0][0] + PosicaoVetor[0][1] + PosicaoVetor[0][2];
        linha2 = PosicaoVetor[1][0] + PosicaoVetor[1][1] + PosicaoVetor[1][2];
        linha3 = PosicaoVetor[2][0] + PosicaoVetor[2][1] + PosicaoVetor[2][2];

        //COLUNAS....
        coluna1 = PosicaoVetor[0][0] + PosicaoVetor[1][0] + PosicaoVetor[2][0];
        coluna2 = PosicaoVetor[0][1] + PosicaoVetor[1][1] + PosicaoVetor[2][1];
        coluna3 = PosicaoVetor[0][2] + PosicaoVetor[1][2] + PosicaoVetor[2][2];

        //DIAGONAIS....
        diagonal1 = PosicaoVetor[0][0] + PosicaoVetor[1][1] + PosicaoVetor[2][2];
        diagonal2 = PosicaoVetor[0][2] + PosicaoVetor[1][1] + PosicaoVetor[2][0];

        if (linha1.equals("XXX") | linha2.equals("XXX") | linha3.equals("XXX") | coluna1.equals("XXX") | coluna2.equals("XXX") | coluna3.equals("XXX") | diagonal1.equals("XXX") | diagonal2.equals("XXX")) {
            txtVisor.setText("O vencedor é o Jogador 01!");
            DesativaBotoes();
            placar1++;
            txtVisor1.setText("" + placar1);

        } else if (linha1.equals("OOO") | linha2.equals("OOO") | linha3.equals("OOO") | coluna1.equals("OOO") | coluna2.equals("OOO") | coluna3.equals("OOO") | diagonal1.equals("OOO") | diagonal2.equals("OOO")) {
            txtVisor.setText("O vencedor é o Jogador 02!");
            DesativaBotoes();
            placar2++;
            txtVisor2.setText("" + placar2);
        } else if (ContarPosicao == 9) {
            txtVisor.setText("Não Houve vencedor!");
        }
    }

    public void DesativaBotoes() {
        //CONFIGURAÇÃO DE DESATIVAR OS OUTROS BOTÕES QUANDO HOUVER UM GANHADOR...      
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 01....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn1.setText("X");
            PosicaoVetor[0][0] = "X";
        } else {
            btn1.setText("O");
            PosicaoVetor[0][0] = "O";
        }

        btn1.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 02....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn2.setText("X");
            PosicaoVetor[0][1] = "X";
        } else {
            btn2.setText("O");
            PosicaoVetor[0][1] = "O";
        }

        btn2.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 03....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn3.setText("X");
            PosicaoVetor[0][2] = "X";
        } else {
            btn3.setText("O");
            PosicaoVetor[0][2] = "O";
        }

        btn3.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 04....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn4.setText("X");
            PosicaoVetor[1][0] = "X";
        } else {
            btn4.setText("O");
            PosicaoVetor[1][0] = "O";
        }

        btn4.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 05....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn5.setText("X");
            PosicaoVetor[1][1] = "X";
        } else {
            btn5.setText("O");
            PosicaoVetor[1][1] = "O";
        }

        btn5.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 06....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn6.setText("X");
            PosicaoVetor[1][2] = "X";
        } else {
            btn6.setText("O");
            PosicaoVetor[1][2] = "O";
        }

        btn6.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 07....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn7.setText("X");
            PosicaoVetor[2][0] = "X";
        } else {
            btn7.setText("O");
            PosicaoVetor[2][0] = "O";
        }

        btn7.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 08....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn8.setText("X");
            PosicaoVetor[2][1] = "X";
        } else {
            btn8.setText("O");
            PosicaoVetor[2][1] = "O";
        }

        btn8.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // CONFIGURAÇÃO DO BOTÃO 09....
        VerificaJogadorDaVez();

        if (Armazena == 1) {
            btn9.setText("X");
            PosicaoVetor[2][2] = "X";
        } else {
            btn9.setText("O");
            PosicaoVetor[2][2] = "O";
        }

        btn9.setEnabled(false);
        VerificaPosicoes();
        VerificaVencedor();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // CONFIGURAÇÃO DO BOTÃO REINICIAR JOGO....

        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        LimpaPosicoes();
        txtVisor.setText("");
        Jogador1 = true;
        Jogador2 = true;
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtVisor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisor1ActionPerformed

    }//GEN-LAST:event_txtVisor1ActionPerformed

    private void txtVisor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisor2ActionPerformed

    }//GEN-LAST:event_txtVisor2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        placar1 = 0;
        placar2 = 0;
        txtVisor1.setText("" + placar1);
        txtVisor2.setText("" + placar2);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jogo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtVisor;
    private javax.swing.JTextField txtVisor1;
    private javax.swing.JTextField txtVisor2;
    // End of variables declaration//GEN-END:variables
}
