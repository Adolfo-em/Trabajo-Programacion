package Teoria2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MiPanel extends JFrame {
    private JButton Nombre;
    private JButton Edad;
    private JButton Crear;
    private JButton Mostrar;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtMostrar;
    private JPanel MiPanel;
    private Persona p;

    public MiPanel(){
        setTitle("Teoria 1");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Con esto cuando yo cierre la aplicacion se sale de memoria si no se queda invisible
        setVisible(true);
        setContentPane(MiPanel);
        Crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                int edad = Integer.parseInt(txtEdad.getText());

                p = new Persona(n,edad);
            }
        });
        Mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p == null){
                    txtMostrar.setText("p NULL");
                }else{
                    txtMostrar.setText(p.toString());
                }
            }
        });
        Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Random r = new Random();
                super.mouseEntered(e);
                Mostrar.setLocation(r.nextInt(getWidth()/2) , r.nextInt(getWidth()/2));

            }
        });
    }

    public static void main(String[] args) {
        new MiPanel();
    }

}
