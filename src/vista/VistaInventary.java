 
package vista;
import controlador.InventaryController;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VistaInventary extends JFrame {
    
    private JButton create;
    private JButton read;
    private JButton update;
    private JButton delete;
    private JPanel panel;
    
    
    public VistaInventary() {
    
        this.panel = new javax.swing.JPanel();
        this.create = new javax.swing.JButton();
        this.read = new javax.swing.JButton();
        this.update = new javax.swing.JButton();
        this.delete = new javax.swing.JButton();
    
        SetDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.create.setText("CREATE");
        this.read.setText("READ");
        this.update.setText("UPDATE");
        this.delete.setText("DELETE");
        this.setLocationRelativeTo(this);
        iniciarVista();
        
        InventaryController vc = new InventaryController();
            this.create.addActionListener(vc);
            this.create.setActionCommand("create");
            this.read.addActionListener(vc);
            this.read.setActionCommand("read");
            this.update.addActionListener(vc);
            this.update.setActionCommand("update");
            this.delete.addActionListener(vc);
            this.delete.setActionCommand("delete");
    
        
        
    }

    private void SetDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void iniciarVista() {
        throw new UnsupportedOperationException("Not supported yet."); 
                    
                    
                    
                    
                    
        
        
        
        
 






    }
    
    
    
    
    
    
    
}
