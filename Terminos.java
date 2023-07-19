import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


//Clase
public class Terminos extends JFrame implements ActionListener, ChangeListener{
//Variables
private JLabel labelUno,labelDos;
private JButton botonUno,botonDos;
private JCheckBox cajaUno;
private JTextArea textAreaUno;
private JScrollPane scrollUno;
String nombre = "";


//Constructor
public Terminos (){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Terminos y Condiciones");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienveninda = new Bienvenida();
    nombre = ventanaBienveninda.texto;


    labelUno = new JLabel ("TERMINOS Y CONDICIONES");
    labelUno.setBounds (215,5,200,30);
    labelUno.setFont(new Font("MOD20",1,14));
    labelUno.setForeground(new Color(0,0,0));
    add (labelUno);

    textAreaUno = new JTextArea ();
    textAreaUno.setEditable(false);
    textAreaUno.setFont(new Font("MOD20",0,14));
    textAreaUno.setText("\n \n         TERMINOS Y CONDICIONES...");

    scrollUno =new JScrollPane(textAreaUno);
    scrollUno.setBounds(10, 40, 575, 200);
    add(scrollUno);

    cajaUno = new JCheckBox ("Valido");
    cajaUno.setBounds(10, 250,300,30);
    cajaUno.addChangeListener(this);
    add(cajaUno);

    //Botones
    botonUno = new JButton("Acepto");
    botonUno.setBounds(10,290,100,30);
    botonUno.setEnabled(false);
    botonUno.addActionListener(this);
    add (botonUno);


    botonDos = new JButton("No acepto");
    botonDos.setBounds(120,290,100,30);
    botonDos.setEnabled(true);
    botonDos.addActionListener(this);
    add(botonDos);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    labelDos = new JLabel(imagen);
    labelDos.setBounds (305,135,300,300);
    add (labelDos);





}
//funcionalidad JCheck
public void stateChanged (ChangeEvent e){
if (cajaUno.isSelected()==true){

    botonUno.setEnabled(true);
    botonDos.setEnabled(false);


}else{

    botonUno.setEnabled(false);
    botonDos.setEnabled(true);

}



}


public void actionPerformed (ActionEvent e){
if (e.getSource() == botonUno){

    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0, 0, 640, 535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
    this.setVisible(false);



}else if (e.getSource()==botonDos){
    
    Bienvenida paginaUno =new Bienvenida();
    paginaUno.setBounds(0,0, 350, 450);
    paginaUno.setVisible(true);
    paginaUno.setResizable(false);
    paginaUno.setLocationRelativeTo(null);
    this.setVisible(false);

}


}


public static void main (String args[]){

    Terminos paginaDos =new Terminos();

    paginaDos.setBounds(0,0,600,360);
    paginaDos.setVisible(true);
    paginaDos.setResizable(false);
    paginaDos.setLocationRelativeTo(null);



}
    
}
