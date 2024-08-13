package interfaz;

public class Intefaz extends javax.swing.JFrame {

   public Intefaz() {
        initComponents();
        NUM1.setVisible(false);
        N1.setVisible(false);
        NUM2.setVisible(false);
        N2.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Modo = new javax.swing.JComboBox<>();
        BotonBorrar = new javax.swing.JButton();
        BotonAns = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoResultado = new javax.swing.JLabel();
        BotonCalcular = new javax.swing.JButton();
        SeleccionModo = new javax.swing.JLabel();
        N1 = new javax.swing.JTextField();
        N2 = new javax.swing.JTextField();
        NUM1 = new javax.swing.JLabel();
        NUM2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora");

        Modo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Suma", "Resta", "Multiplicacion", "Division", "Raiz", "Potencia", "Seno", "Coseno", "Tangente", "IVA" }));
        Modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoActionPerformed(evt);
            }
        });

        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonAns.setText("Ans");
        BotonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnsActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado:");

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        SeleccionModo.setText("Modo:");

        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        NUM1.setText("Número 1:");

        NUM2.setText("Número 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(SeleccionModo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Modo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(43, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BotonAns))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BotonCalcular)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUM1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonAns)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CampoResultado))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SeleccionModo)
                            .addComponent(Modo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        N1.setText("");
        N2.setText("");
        
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnsActionPerformed
       double a = Double.parseDouble(CampoResultado.getText());
        if(N1.getText().isEmpty())
       {
       this. N1.setText(a + "");   
       }    
        else
            this.N2.setText(a+"");
    }//GEN-LAST:event_BotonAnsActionPerformed

    private void ModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoActionPerformed
        String modo = Modo.getSelectedItem().toString();
        NUM1.setVisible(true);
        N1.setVisible(true);
        NUM2.setVisible(true);
        N2.setVisible(true);
        
        if(modo == "Coseno" || modo == "Tangente" || modo == "Seno")
            {           
                NUM1.setText("Ángulo"); 
                N2.setVisible(false);
                NUM2.setVisible(false);
            }
        else if (modo == "Potencia")
        {
            NUM1.setText("Base");
            NUM2.setText("Exponente");
        }
        else if (modo == "Raiz")
        {
            NUM1.setText("Base");
            NUM2.setText("índice");
        }
        else if (modo == "Suma" || modo == "Resta" || modo == "Multiplicacion")
        {
            NUM1.setText("Número 1");
            NUM2.setText("Número 2");
        }
        else if (modo == "Division")
        {
            NUM1.setText("Numerador:");
            NUM2.setText("Denominador:");
        }
        else if (modo =="IVA")
        {
            NUM1.setText("Valor \n base");
            NUM2.setText("% IVA ");
        }
        else
        {
            NUM1.setVisible(false);
            N1.setVisible(false);
            NUM2.setVisible(false);
            N2.setVisible(false);
        }
    }//GEN-LAST:event_ModoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
   String modo = Modo.getSelectedItem().toString();
      {
          
          double num1 = Double.parseDouble(this.N1.getText());
          double num2 = Double.parseDouble(this.N2.getText());
          //double num3 = Double.parseDouble(this.N3.getText());
          double angulo = Math.toRadians(Double.parseDouble(N1.getText()));
          
           
                       if (modo =="Suma")
                           this.CampoResultado.setText((num1+num2)+"");
                       else if (modo == "Resta")
                                this.CampoResultado.setText(num1-num2+"");
                       else if (modo == "Multiplicacion")
                                this.CampoResultado.setText((num1 * num2) + "");
                       else if (modo == "Division")
                               this.CampoResultado.setText(num1/num2+"");
                       else if (modo == "Potencia")
                                this.CampoResultado.setText(Math.pow(num1,num2)+ "");                      
                       else if (modo == "Raiz")
                              this.CampoResultado.setText(Math.pow(num1,1/num2)+ "");
                       else if (modo =="Seno")
                                this.CampoResultado.setText(Math.sin(angulo)+"");
                       else if (modo == "Coseno")
                                this.CampoResultado.setText(Math.cos(angulo)+"");
                       else if (modo == "Tangente")
                                this.CampoResultado.setText(Math.tan(angulo)+"");
                       else if (modo == "IVA")
                           this.CampoResultado.setText(num1*(num2/100)+"");
                           
    }  
                // TODO add your handling code here:
    }//GEN-LAST:event_BotonCalcularActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAns;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JLabel CampoResultado;
    private javax.swing.JComboBox<String> Modo;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JLabel NUM1;
    private javax.swing.JLabel NUM2;
    private javax.swing.JLabel SeleccionModo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
