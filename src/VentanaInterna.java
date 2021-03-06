
import java.io.File;

public class VentanaInterna extends javax.swing.JInternalFrame {

    public VentanaInterna() {
        initComponents();
    }
    
    public File getImageFile() {
        return this.lienzo.getImageFile();
    }
            
    public void setImage(File imageFile) {
        this.lienzo.setImage(imageFile);
    }
    
    public void umbralizar(int umbral, File imageFile) {
        this.lienzo.setImage(imageFile);
        this.lienzo.umbralizar(umbral);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzoScroll = new javax.swing.JScrollPane();
        lienzo = new Lienzo();

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        lienzoScroll.setViewportView(lienzo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzoScroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Lienzo lienzo;
    private javax.swing.JScrollPane lienzoScroll;
    // End of variables declaration//GEN-END:variables
}
