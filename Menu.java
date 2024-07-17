import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
    
    @SuppressWarnings("unused")
    public class Menu extends JFrame {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Exemplo de Menus");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JMenuBar menuBar = new JMenuBar();
         JMenu menuArquivo = new JMenu("Arquivo");
         JMenu menuEditar = new JMenu("Editar");         
         menuBar.add(menuArquivo);
         menuBar.add(menuEditar);
         frame.setJMenuBar(menuBar);
         frame.setVisible(true);
     }
 }
    
    

