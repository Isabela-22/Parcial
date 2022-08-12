/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 102,103,104,105,106,107,108,110,111,112,113,114 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class ProcesadorII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuProcesador_II mimarco=new MenuProcesador_II();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador_II extends JFrame{
    
    public MenuProcesador_II(){
    setBounds(500,300,550,400);
    LaminaProcesador_II milamina=new LaminaProcesador_II();    
    add(milamina);    
    setVisible(true);
    }   
}

class LaminaProcesador_II extends JPanel{
    public LaminaProcesador_II(){    
    setLayout(new BorderLayout());    
    JPanel laminamenu=new JPanel();    
    JMenuBar mibarra=new JMenuBar();  
    
    fuente=new JMenu("Fuente");    
    estilo=new JMenu("Estilo");    
    tamagno=new JMenu("Tamano");  
    
    configura_menu("Arial","fuente","Arial",9,10);    
    configura_menu("Courier","fuente","Courier",9,10);    
    configura_menu("Verdana","fuente","Verdana",9,10);    
    
    configura_menu("Negrita","estilo","",Font.BOLD,1);    
    configura_menu("Cursiva","estilo","",Font.ITALIC,1);
    
    /*JCheckBoxMenuItem negrita= new JCheckBoxMenuItem("Negrita");
    JCheckBoxMenuItem cursiva= new JCheckBoxMenuItem("Cursiva");    
    negrita.addActionListener(new StyledEditorKit.BoldAction());    
    cursiva.addActionListener(new StyledEditorKit.ItalicAction());    
    estilo.add(negrita);    
    estilo.add(cursiva);*/
    
    /*configura_menu("12","tamaño","",9,12);    
    configura_menu("16","tamaño","",9,16);    
    configura_menu("20","tamaño","",9,20);    
    configura_menu("24","tamaño","",9,24);*/
    
    ButtonGroup tamagno_letra = new ButtonGroup();    
    JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");    
    JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");    
    JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");    
    JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");    
    //veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
    
    tamagno_letra.add(doce);    
    tamagno_letra.add(dieciseis);    
    tamagno_letra.add(veinte);    
    tamagno_letra.add(veinticuatro);    
    doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",12));    
    dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",16));    
    veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",20));     
    veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",24));    
    tamagno.add(doce);    
    tamagno.add(dieciseis);    
    tamagno.add(veinte);    
    tamagno.add(veinticuatro);      
 
    mibarra.add(fuente);    
    mibarra.add(estilo);    
    mibarra.add(tamagno);    
    laminamenu.add(mibarra);    
    add(laminamenu,BorderLayout.NORTH);
    
    miarea=new JTextPane();    
    add(miarea,BorderLayout.CENTER);    
    JPopupMenu emergente=new JPopupMenu();        
    JMenuItem negritaE=new JMenuItem("Negrita");        
    JMenuItem cursivaE=new JMenuItem("Cursiva");    
    negritaE.addActionListener(new StyledEditorKit.BoldAction());    
    cursivaE.addActionListener(new StyledEditorKit.ItalicAction());        
    emergente.add(negritaE);        
    emergente.add(cursivaE);        
    miarea.setComponentPopupMenu(emergente);    
    }
    
    public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam){    
        JMenuItem elem_menu=new JMenuItem(rotulo);        
        if(menu=="fuente"){        
            fuente.add(elem_menu);            
            if(tipo_letra=="Arial"){            
            elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra","Arial"));            
            }else if(tipo_letra=="Courier"){            
            elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra","Courier"));                
            }else if(tipo_letra=="Verdana"){            
            elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra","Verdana"));                
            }        
        }else if(menu=="estilo"){            
            estilo.add(elem_menu);            
            if(estilos==Font.BOLD){                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));            
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());            
            }else if(estilos==Font.ITALIC){                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));            
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());            
            }
        }else if(menu=="tamaño"){            
            tamagno.add(elem_menu);            
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
        }        
    }
      
    JTextPane miarea;    
    JMenu fuente, estilo, tamagno;    
    Font letras;
  
}
