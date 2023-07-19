//libreria importar elementos
import javax.swing.*;
//libreria interfaces graficas
import java.awt.*;
import java.awt.event.*;


//Clase
public class Principal extends JFrame implements ActionListener{
   //Variables
    private JMenuBar menuBar;
    private JMenu menuDeOpciones,menuCalcular,menuAcercaDe, menuColoresFondo;
    private JMenuItem itemVacaciones,itemRojo,itemNegro,itemVioleta,itemElCreador,itemSalir,itemNuevo;
    private JLabel labelLogo,labelTitulo,labelNombre,labelApellidoUno,labelApellidoDos,labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
    private JTextField nombreTexto,apellidoUnoTexto,apellidoDosTexto;
    private JComboBox cajitaDepartamento,cajitaAntiguedad;
    private JScrollPane scrollUno;
    private JTextArea textoUno;
    String nombreAdm= "";     


//Constructor
    public Principal (){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        getContentPane().setBackground(new Color (255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdm = ventanaBienvenida.texto;

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,0,0));
        setJMenuBar(menuBar);

//Principales
        menuDeOpciones = new JMenu("Opciones");
        menuDeOpciones.setBackground(new Color(255,0,0));
        menuDeOpciones.setFont(new Font("MOD20",1,14));
        menuDeOpciones.setForeground(new Color(255, 255, 255));
        menuBar.add(menuDeOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("MOD20",1,14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        menuBar.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca De");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("MOD20",1,14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        menuBar.add(menuAcercaDe);
        
        menuColoresFondo =  new JMenu("Colores");
        menuColoresFondo.setBackground(new Color(255,0,0));
        menuColoresFondo.setFont(new Font("MOD20",1,14));
        menuColoresFondo.setForeground(new Color(255, 255, 255));
        menuBar.add(menuColoresFondo);



//Vacaciones
        itemVacaciones= new JMenuItem("Vacaciones");
        itemVacaciones.setFont(new Font("MOD20",1,14));
        itemVacaciones.setForeground(new Color(255, 0, 0));
        menuCalcular.add(itemVacaciones);
        itemVacaciones.addActionListener(this);


//Colores
        itemRojo = new JMenuItem("Rojo");
        itemRojo.setFont(new Font("MOD20",1,14));
        itemRojo.setForeground(new Color(255, 0, 0));
        menuColoresFondo.add(itemRojo);
        itemRojo.addActionListener(this);

        itemNegro = new JMenuItem("Negro");
        itemNegro.setFont(new Font("MOD20",1,14));
        itemNegro.setForeground(new Color(255, 0, 0));
        menuColoresFondo.add(itemNegro);
        itemNegro.addActionListener(this);

        itemVioleta = new JMenuItem("Violeta");
        itemVioleta.setFont(new Font("MOD20",1,14));
        itemVioleta.setForeground(new Color(255, 0, 0));
        menuColoresFondo.add(itemVioleta);
        itemVioleta.addActionListener(this);
        
// Mas

        itemNuevo = new JMenuItem("Nuevo");
        itemNuevo.setFont(new Font("MOD20",1,14));
        itemNuevo.setForeground(new Color(255,0,0));
        menuDeOpciones.add(itemNuevo);
        itemNuevo.addActionListener(this);


        itemElCreador = new JMenuItem("El creador");
        itemElCreador.setFont(new Font("MOD20",1,14));
        itemElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(itemElCreador);
        itemElCreador.addActionListener(this);


        itemSalir = new JMenuItem("Salir");
        itemSalir.setFont(new Font("MOD20",1,14));
        itemSalir.setForeground(new Color(255,0,0));
        menuDeOpciones.add(itemSalir);
        itemSalir.addActionListener(this);

        
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);


        labelTitulo = new JLabel("Bienvenido "+ nombreAdm);
        labelTitulo.setBounds(280,30,900,50);
        labelTitulo.setFont(new Font("MOD20",1,14));
        labelTitulo.setForeground(new Color(255,255,255));
        add(labelTitulo);

 //JLABEL Y JTextField NOMBRE
        
        labelNombre = new JLabel ("Nombre completo");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("MOD20",1,14));
        labelNombre.setForeground(new Color (255,255,255));
        add(labelNombre);
        nombreTexto = new JTextField();
        nombreTexto.setBounds(25, 213, 150, 25);
        nombreTexto.setBackground(new Color(224,224,224));
        nombreTexto.setFont(new Font("MOD20",1,14));
        nombreTexto.setForeground(new Color(255,0,0));
        add(nombreTexto);


//JLABEL Y JTextField APELLIDO Paterno
        labelApellidoUno = new JLabel ("Apellido paterno");
        labelApellidoUno.setBounds(25, 248, 180, 25);
        labelApellidoUno.setFont(new Font("MOD20",1,14));
        labelApellidoUno.setForeground(new Color (255,255,255));
        add(labelApellidoUno);

        apellidoUnoTexto = new JTextField();
        apellidoUnoTexto.setBounds(25, 273, 150, 25);
        apellidoUnoTexto.setBackground(new Color(224,224,224));
        apellidoUnoTexto.setFont(new Font("MOD20",1,14));
        apellidoUnoTexto.setForeground(new Color(255,0,0));
        add(apellidoUnoTexto);


//JLABEL Y JTextField apellido Materno

        
        labelApellidoDos = new JLabel ("Apellido Materno");
        labelApellidoDos.setBounds(25, 308, 180, 25);
        labelApellidoDos.setFont(new Font("MOD20",1,14));
        labelApellidoDos.setForeground(new Color (255,255,255));
        add(labelApellidoDos);

        apellidoDosTexto = new JTextField();
        apellidoDosTexto.setBounds(25, 334, 150, 25);
        apellidoDosTexto.setBackground(new Color(224,224,224));
        apellidoDosTexto.setFont(new Font("MOD20",1,14));
        apellidoDosTexto.setForeground(new Color(255,0,0));
        add(apellidoDosTexto);


//JLabel y JComboBox  departamento
        labelDepartamento = new JLabel("Departamento");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("MOD20",1,14));
        labelDepartamento.setForeground(new Color (255,255,255));
        add(labelDepartamento);



       cajitaDepartamento =new JComboBox ();
       cajitaDepartamento.setBounds (220,213,220,25);
       cajitaDepartamento.setBackground(new Color(224,224,224));
       cajitaDepartamento.setFont(new Font("MOD20",1,14));
       cajitaDepartamento.setForeground(new Color (255,0,0));
       add (cajitaDepartamento);
       cajitaDepartamento.addItem("");
       cajitaDepartamento.addItem("Atencion al cliente");
       cajitaDepartamento.addItem("Departamento de logistica");
       cajitaDepartamento.addItem("Departamento de gerencia");


 // JLabel y JComboBox Antiguedad
       labelAntiguedad = new JLabel("Antiguedad");
       labelAntiguedad.setBounds(220,248,180,25);
       labelAntiguedad.setBackground(new Color(224,224,224));
       labelAntiguedad.setFont(new Font("MOD20",1,14));
       labelAntiguedad.setForeground(new Color(255,255,255));
       add(labelAntiguedad);

       cajitaAntiguedad = new JComboBox();
       cajitaAntiguedad.setBounds(220, 273, 220, 25);
       cajitaAntiguedad.setBackground(new Color(224,224,224));
       cajitaAntiguedad.setFont (new Font("MOD20",1,14));
       cajitaAntiguedad.setForeground(new Color(255,0,0));
       add(cajitaAntiguedad);
       cajitaAntiguedad.addItem("");
       cajitaAntiguedad.addItem("1 año de servicio");
       cajitaAntiguedad.addItem("2 a 6 años de servicio");
       cajitaAntiguedad.addItem("7 o mas años de servicio");

//JLabel y JTextArea de Resultado

       labelResultado = new JLabel("Resultado de calculo");
       labelResultado.setBounds(220, 307, 180, 25);
       labelResultado.setFont (new Font("MOD20",1,14));
       labelResultado.setForeground(new Color (255,255,255));
       add (labelResultado);

       textoUno = new JTextArea();
       textoUno.setEditable(false);
       textoUno.setBackground(new Color(224,224,224));
       textoUno.setFont(new Font("MOD20",1,14));
       textoUno.setForeground(new Color(255,0,0));
       textoUno.setText ("\n Resultado de su calculo de vacaciones");
        scrollUno = new JScrollPane(textoUno);
        scrollUno.setBounds(220,333,385,90);
        add(scrollUno);


        labelFooter = new JLabel("2017 Coca-Cola Company | todos los derechos reservados");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new Font("MOD20",1,14));
        labelFooter.setForeground(new Color(255,255,255));
        add(labelFooter);

    }

//Evento de las vacaciones
    public void actionPerformed (ActionEvent e){
                if (e.getSource() ==itemVacaciones){

               String nombreDelTrabajador = nombreTexto.getText();
               String AP = apellidoUnoTexto.getText();
               String AM = apellidoDosTexto.getText();
               String Eldepartamento = cajitaDepartamento.getSelectedItem().toString();
               String LaAntiguedad = cajitaAntiguedad.getSelectedItem().toString();
               if (nombreDelTrabajador.equals("")||AP.equals("")|| AM.equals("")|| 
               Eldepartamento.equals("")||LaAntiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes Rellenar todos los campos. ");

               }else{
//Vacaciones del departamento de Atencion al cliente
                 if (Eldepartamento.equals("Atencion al cliente")){
                        if (LaAntiguedad.equals("1 año de servicio")){

                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 6 dias de vacaciones. ");


                        }
                        if (LaAntiguedad.equals("2 a 6 años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 10 dias de vacaciones. ");

                        }
                        if (LaAntiguedad.equals("7 o mas años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 14 dias de vacaciones. ");



                        }




                 }

//Vacaciones del departamento de Logística
                 if (Eldepartamento.equals("Departamento de logistica")){
                        if (LaAntiguedad.equals("1 año de servicio")){

                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 7 dias de vacaciones. ");


                        }
                        if (LaAntiguedad.equals("2 a 6 años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 11 dias de vacaciones. ");

                        }
                        if (LaAntiguedad.equals("7 o mas años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 15 dias de vacaciones. ");



                        }





                 }

//Vacaciones del departamento de Gerencia
              if (Eldepartamento.equals ("Departamento de gerencia")){
                        if (LaAntiguedad.equals("1 año de servicio")){

                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 10 dias de vacaciones. ");


                        }
                        if (LaAntiguedad.equals("2 a 6 años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 14 dias de vacaciones. ");

                        }
                        if (LaAntiguedad.equals("7 o mas años de servicio")){
                                textoUno.setText("El trabajador "+ nombreDelTrabajador +" " + AP + " " + AM + "\ndel departamento de "
                                 + Eldepartamento + " con \n" + LaAntiguedad + " tiene 20 dias de vacaciones. ");



                        }






              }
              
                }



        }

if (e.getSource()==itemRojo){
        getContentPane().setBackground(new Color(255,0,0));

}
if (e.getSource()==itemNegro){

        getContentPane().setBackground(new Color(0,0,0));

}
if (e.getSource()==itemVioleta){
        getContentPane().setBackground(new Color(51,0,51));

}
if (e.getSource()==itemNuevo){
        nombreTexto.setText("");
        apellidoUnoTexto.setText("");
        apellidoDosTexto.setText("");
        cajitaDepartamento.setSelectedIndex(0);
        cajitaAntiguedad.setSelectedIndex(0);
        textoUno.setText("\n Resultado de su calculo de vacaciones");

}
if (e.getSource()==itemElCreador){

        JOptionPane.showMessageDialog(null,"Thomas Ezequiel Fernandez");

}
if (e.getSource()==itemSalir){
        Bienvenida paginaUno =new Bienvenida();
        paginaUno.setBounds(0,0, 350, 450);
        paginaUno.setVisible(true);
        paginaUno.setResizable(false);
        paginaUno.setLocationRelativeTo(null);
        this.setVisible(false);


}

}


 public static void main (String args[]){
 Principal ventanaPrincipal = new Principal();
 ventanaPrincipal.setBounds(0, 0, 640, 535);
 ventanaPrincipal.setVisible(true);
 ventanaPrincipal.setResizable(false);
 ventanaPrincipal.setLocationRelativeTo(null);

 
 }
}

 
