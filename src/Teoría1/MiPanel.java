package Teoría1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPanel extends JFrame{
    private JButton Boton1;
    private JButton Boton2;
    private JTextField Texto1;
    private JTextField Texto2;
    private JPanel MiPanel;
    private int c;


    public MiPanel(){
        setTitle("Teoria 1");
        setSize(400,300);   //Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Con esto cuando yo cierre la aplicacion se sale de memoria si no se queda invisible
        setVisible(true);
        setContentPane(MiPanel);
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Texto1.setText("C:" + c);
                c++;
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Boton1.isEnabled()){
                    Boton1.setEnabled(false);
                }else{
                    Boton1.setEnabled(true);
                }
                //Boton1.setEnabled(!Boton1.isEnabled());
            }
        });
        Texto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Texto1.getText().isEmpty()){
                    Texto2.setText("");
                }else{
                    Texto2.setText(Texto2.getText() + Texto1.getText());
                }
            }
        });
        Texto2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,Texto2.getText());
            }
        });
    }

    public static void main(String[] args) {
        new MiPanel();
    }


}
