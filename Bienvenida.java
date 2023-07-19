import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//Clase
public class Bienvenida extends JFrame implements ActionListener{
//Variables 
private JLabel labelUno,labelDos,labelTres,labelCuatro;
private JButton botonUno;
private JTextField textoFieldUno;
public static String texto ="";

//Constructor   
public Bienvenida (){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Bienvenido");
getContentPane().setBackground(new Color(255,0,0));
setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
ImageIcon imagenUno = new ImageIcon("images/logo-coca.png");
labelUno =new JLabel(imagenUno);
labelUno.setBounds(25, 15, 300, 150);
add(labelUno);


//Sistema
labelDos = new JLabel("Sistema de control vacacional");
labelDos.setBounds(35, 135, 300, 30);
labelDos.setFont(new Font("Arial",2,18));
labelDos.setForeground(new Color(255,255,255));
add(labelDos);




//Accion
labelTres = new JLabel("Ingrese Su nombre");
labelTres.setBounds(42, 212, 200, 30);
labelTres.setFont (new Font("PALSCRI",1,12));
labelTres.setForeground(new Color(255,255,255));
add(labelTres);


//Copyriht
labelCuatro = new JLabel("©2023 The Coca-Cola Company");
labelCuatro.setBounds(85, 375, 300, 30);
labelCuatro.setFont(new Font("MOD20", 1,12));
labelCuatro.setForeground(new Color(255,255,255));


//Escribe su nombre
textoFieldUno = new JTextField();
textoFieldUno.setBounds(45,240,255,25);
textoFieldUno.setBackground(new Color(224,224,224));
textoFieldUno.setFont(new Font("MOD20", 1,14));
textoFieldUno.setForeground(new Color(0,0,0));
add(textoFieldUno);


//Boton 
botonUno = new JButton("Ingresar");
botonUno.setBounds(125, 280, 100, 30);
botonUno.setBackground(new Color(255,255,255));
botonUno.setFont(new Font("MOD20",1,14));    
botonUno.setForeground(new Color(255,0,0));
botonUno.addActionListener(this);
add(botonUno);


}

//Si apreta el boton "Ingresar"
public void actionPerformed (ActionEvent e){
    if (e.getSource()==botonUno){
        
        texto = textoFieldUno.getText().trim();
        if (texto.equals("")){
                    JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre. ");
        }else{

            Terminos paginaDos =new Terminos();
            paginaDos.setBounds(0,0,600,360);
            paginaDos.setVisible(true);
            paginaDos.setResizable(false);
            paginaDos.setLocationRelativeTo(null);
            this.setVisible(false);

        }

    }
}

//main
public static void main (String[] args){

    Bienvenida paginaUno =new Bienvenida();
    paginaUno.setBounds(0,0, 350, 450);
    paginaUno.setVisible(true);
    paginaUno.setResizable(false);
    paginaUno.setLocationRelativeTo(null);

}


}

