package Compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Compilador extends javax.swing.JFrame {


    private JFileChooser chooser = new JFileChooser();
    private File sourceFile;
    private Sintatico analisadorSintatico;

    /** Creates new form Compilador */
    public Compilador() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPath = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnCompile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPath.setText("Carregue o arquivo fonte.");

        btnLoad.setText("Carregar");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnCompile.setText("Compilar");
        btnCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompileActionPerformed(evt);
            }
        });

        txtSaida.setColumns(20);
        txtSaida.setRows(5);
        jScrollPane1.setViewportView(txtSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblPath, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnLoad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnCompile))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPath)
                    .addComponent(btnLoad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCompile)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        chooser.setDialogTitle("Abrir...");

        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
            sourceFile = chooser.getSelectedFile();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompileActionPerformed
        analisadorSintatico = new Sintatico(sourceFile);
        String msg = analisadorSintatico.execute();
        if(msg!=null) {
            txtSaida.setText(msg);
            return;
        }
        
    }//GEN-LAST:event_btnCompileActionPerformed


        
  
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnLoad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPath;
    private javax.swing.JTextArea txtSaida;
    // End of variables declaration//GEN-END:variables

}
