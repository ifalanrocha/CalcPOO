package calculadoracientifica;


public class CalcCientif extends javax.swing.JFrame {

    public CalcCientif() {
        initComponents();
    }

    
    double num1, num2, result;
    String opr; 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        log = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        MaisOuMenos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        Mais = new javax.swing.JButton();
        Oito = new javax.swing.JButton();
        Sete = new javax.swing.JButton();
        Nove = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Ponto = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Dois = new javax.swing.JButton();
        Um = new javax.swing.JButton();
        Quatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Vezes = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalcCientifica");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Tela.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        log.setText("LOG");
        log.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("N!");
        jButton3.setMaximumSize(new java.awt.Dimension(31, 38));

        MaisOuMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MaisOuMenos.setText("+/-");
        MaisOuMenos.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("X^3");
        jButton5.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("X^2");
        jButton6.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("X^Y");
        jButton9.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("1/X");
        jButton10.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("COSH");
        jButton7.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("SINH");
        jButton11.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("TANH");
        jButton8.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("C");
        jButton12.setMaximumSize(new java.awt.Dimension(31, 38));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("%");
        jButton13.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("B");
        jButton14.setMaximumSize(new java.awt.Dimension(31, 38));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        Mais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Mais.setText("+");
        Mais.setMaximumSize(new java.awt.Dimension(31, 38));

        Oito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Oito.setText("8");
        Oito.setMaximumSize(new java.awt.Dimension(31, 38));
        Oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OitoActionPerformed(evt);
            }
        });

        Sete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sete.setText("7");
        Sete.setMaximumSize(new java.awt.Dimension(31, 38));
        Sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeteActionPerformed(evt);
            }
        });

        Nove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nove.setText("9");
        Nove.setMaximumSize(new java.awt.Dimension(31, 38));
        Nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoveActionPerformed(evt);
            }
        });

        Menos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Menos.setText("-");
        Menos.setMaximumSize(new java.awt.Dimension(31, 38));
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });

        Igual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Igual.setText("=");
        Igual.setMaximumSize(new java.awt.Dimension(31, 38));

        Zero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Zero.setText("0");
        Zero.setMaximumSize(new java.awt.Dimension(31, 38));
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Ponto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ponto.setText(".");
        Ponto.setMaximumSize(new java.awt.Dimension(31, 38));
        Ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PontoActionPerformed(evt);
            }
        });

        Dividir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Dividir.setText("/");
        Dividir.setMaximumSize(new java.awt.Dimension(31, 38));
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Tres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tres.setText("3");
        Tres.setMaximumSize(new java.awt.Dimension(31, 38));
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Dois.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Dois.setText("2");
        Dois.setMaximumSize(new java.awt.Dimension(31, 38));
        Dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoisActionPerformed(evt);
            }
        });

        Um.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Um.setText("1");
        Um.setMaximumSize(new java.awt.Dimension(31, 38));
        Um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmActionPerformed(evt);
            }
        });

        Quatro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Quatro.setText("4");
        Quatro.setMaximumSize(new java.awt.Dimension(31, 38));
        Quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuatroActionPerformed(evt);
            }
        });

        Cinco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cinco.setText("5");
        Cinco.setMaximumSize(new java.awt.Dimension(31, 38));
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Seis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Seis.setText("6");
        Seis.setMaximumSize(new java.awt.Dimension(31, 38));
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        Vezes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Vezes.setText("*");
        Vezes.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton22.setText("R");
        jButton22.setMaximumSize(new java.awt.Dimension(31, 38));

        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton32.setText("EXP");
        jButton32.setMaximumSize(new java.awt.Dimension(31, 38));

        sin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sin.setText("SIN");
        sin.setMaximumSize(new java.awt.Dimension(31, 38));

        cos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cos.setText("COS");
        cos.setMaximumSize(new java.awt.Dimension(31, 38));

        tang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tang.setText("TAN");
        tang.setMaximumSize(new java.awt.Dimension(31, 38));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaisOuMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Um, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaisOuMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Um, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tela))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tela, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelaActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DividirActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenosActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        Tela.setText(Tela.getText () + "0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void UmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmActionPerformed
        Tela.setText(Tela.getText () + "1");
    }//GEN-LAST:event_UmActionPerformed

    private void DoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoisActionPerformed
        Tela.setText(Tela.getText () + "2");
    }//GEN-LAST:event_DoisActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        Tela.setText(Tela.getText () + "3");
    }//GEN-LAST:event_TresActionPerformed

    private void QuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuatroActionPerformed
        Tela.setText(Tela.getText () + "4");
    }//GEN-LAST:event_QuatroActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        Tela.setText(Tela.getText () + "5");
    }//GEN-LAST:event_CincoActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        Tela.setText(Tela.getText () + "6");
    }//GEN-LAST:event_SeisActionPerformed

    private void SeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeteActionPerformed
         Tela.setText(Tela.getText () + "7");
    }//GEN-LAST:event_SeteActionPerformed

    private void OitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OitoActionPerformed
        Tela.setText(Tela.getText () + "8");
    }//GEN-LAST:event_OitoActionPerformed

    private void NoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoveActionPerformed
        Tela.setText(Tela.getText () + "9");
    }//GEN-LAST:event_NoveActionPerformed

    private void PontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PontoActionPerformed
        Tela.setText(Tela.getText () + ".");
    }//GEN-LAST:event_PontoActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Tela.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String backSpace = null;
        if(Tela.getText().length() >0)
        {
            StringBuilder s = new StringBuilder(Tela.getText());
            
            s.deleteCharAt(Tela.getText().length() -1);
            backSpace = s.toString();
            Tela.setText(backSpace);     
        }
       
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(CalcCientif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcCientif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcCientif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcCientif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcCientif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Dois;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Mais;
    private javax.swing.JButton MaisOuMenos;
    private javax.swing.JButton Menos;
    private javax.swing.JButton Nove;
    private javax.swing.JButton Oito;
    private javax.swing.JButton Ponto;
    private javax.swing.JButton Quatro;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Sete;
    private javax.swing.JTextField Tela;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Um;
    private javax.swing.JButton Vezes;
    private javax.swing.JButton Zero;
    private javax.swing.JButton cos;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log;
    private javax.swing.JButton sin;
    private javax.swing.JButton tang;
    // End of variables declaration//GEN-END:variables
}
