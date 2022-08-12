/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 121,122 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Tipos_CuadrosDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_Dialogos mimarco=new Marco_Dialogos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class Marco_Dialogos extends JFrame{   
    public Marco_Dialogos(){    
    setTitle("Prueba de dialogos");    
    setBounds(500,300,600,450);    
    JPanel lamina_cuadricula=new JPanel();    
    lamina_cuadricula.setLayout(new GridLayout(2,3));    
    String primero[]={"Mensaje","Confirmar","Opcion","Entrada"};    
    lamina_tipo=new Lamina_Botones("Tipo",primero);    
    lamina_tipo_mensajes=new Lamina_Botones("Tipo de Mensaje", new String[]{    
            "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "WARNING_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSASGE"    
    });
    
    lamina_mensaje=new Lamina_Botones("Mensaje", new String[]{    
        "Cadena",
        "Icono",
        "Componente",
        "Otros",
        "Object[]"    
    });
    
    lamina_tipo_opcion=new Lamina_Botones("Confirmar", new String[]{    
        "DEFAULT_OPTION",
        "YES_NO_OPTION",
        "YES_NO_CANCEL_OPTION",
        "OK_CANCEL_OPTION"    
    });
    
    lamina_opciones=new Lamina_Botones("Opcion", new String[]{    
        "String[]",
        "Icion[]",
        "Object[]"    
    });    
    
    lamina_entrada=new Lamina_Botones("Entrada", new String[]{    
        "Campo de tecto",
        "Combo"    
    });
    
    setLayout(new BorderLayout()); 
        
    lamina_cuadricula.add(lamina_tipo);
    lamina_cuadricula.add(lamina_tipo_mensajes);
    lamina_cuadricula.add(lamina_mensaje);
    lamina_cuadricula.add(lamina_tipo_opcion);
    lamina_cuadricula.add(lamina_opciones);
    lamina_cuadricula.add(lamina_entrada);
    
    //Lamina inferior
    
    JPanel lamina_mostrar=new JPanel();    
    JButton boton_mostrar=new JButton("Mostrar");    
    boton_mostrar.addActionListener(new AccionMostrar());    
    lamina_mostrar.add(boton_mostrar);    
    add(lamina_mostrar,BorderLayout.SOUTH);    
    add(lamina_cuadricula,BorderLayout.CENTER);  
    }
    
    //Mensaje
    
    public Object dameMensaje(){    
        String s=lamina_mensaje.dameSeleccion();        
        if(s.equals("Cadena")){            
            return cadenaMensaje;
        }else if(s.equals("Icono")){        
            return iconoMensaje;
        }else if(s.equals("Componente")){        
            return componenteMensaje;
        }else if(s.equals("Otros")){        
            return objetoMensaje;
        }else if(s.equals("Object[]")){        
            return new Object[]{cadenaMensaje,
                iconoMensaje,
                componenteMensaje,
                objetoMensaje
        };
        }else{
        return null;
        }
    } 
    
    //Devuelve tipo icono y tambien N° de botones    
    public int dameTipo(Lamina_Botones lamina){    
        String s=lamina_tipo_mensajes.dameSeleccion();        
        if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){            
            return 0;
        }else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
            return 1;
        }else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")){
            return 2;
        }else if(s.equals("QUESTION_MESSAGE")){
            return 3;
        }else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")){
            return -1;
        }else{        
            return 0;        
        }    
    }
    
    //Opciones a la lamina    
    public Object[] dameOpciones(Lamina_Botones lamina){    
        String s=lamina.dameSeleccion();        
        if(s.equals("String[]")){            
            return new String[]{"Amarillo","Azul","Rojo"}; 
        }        
        else{        
            return null;        
        }    
    }   
        
    private class AccionMostrar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            //System.out.println(lamina_tipo_mensajes.dameSeleccion());            
            if(lamina_tipo.dameSeleccion().equals("Mensaje")){            
                JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));
            }else if(lamina_tipo.dameSeleccion().equals("Confirmar")){            
                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo",dameTipo(lamina_tipo_opcion),dameTipo(lamina_tipo_mensajes));
            }else if(lamina_tipo.dameSeleccion().equals("Entrada")){            
                JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));
            }else if(lamina_tipo.dameSeleccion().equals("Opcion")){            
                JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 1, dameTipo(lamina_tipo_mensajes), null, dameOpciones(lamina_opciones), null); 
            }     
        }
    }
    
    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, lamina_tipo_opcion, lamina_opciones,lamina_entrada;
    private String cadenaMensaje="Mensaje";
    private Icon iconoMensaje=new ImageIcon("bola_azul.png");
    private Object objetoMensaje=new Date();
    private Component componenteMensaje=new Lamina_Ejemplo();
}

class Lamina_Botones extends JPanel{    
    public Lamina_Botones(String titulo, String [] opciones){    
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));        
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));        
        ButtonGroup grupo=new ButtonGroup();        
        for(int i=0; i<opciones.length; i++){    
            JRadioButton bot=new JRadioButton(opciones[i]);            
            bot.setActionCommand(opciones[i]);            
            add(bot);            
            grupo.add(bot);            
            bot.setSelected(i==0);    
        }    
    }
    
    public String dameSeleccion(){    
        /*ButtonModel miboton=grupo.getSelection();
        String s=miboton.getActionCommand();        
        return s;*/       
        return grupo.getSelection().getActionCommand();        
    }    
    private ButtonGroup grupo;    
}

class Lamina_Ejemplo extends JPanel{
    public void paintComponent(Graphics g){    
        super.paintComponent(g);        
        Graphics2D g2=(Graphics2D) g;        
        Rectangle2D rectangulo=new Rectangle2D.Double(0,0,getWidth(), getHeight());        
        g2.setPaint(Color.YELLOW);        
        g2.fill(rectangulo);        
    }
}

