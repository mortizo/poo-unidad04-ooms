/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_02.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import p60.u04_02.controlador.PersonaControl;
import p60.u04_02.controlador.ProfesionControl;
import p60.u04_02.modelo.Profesion;

/**
 *
 * @author morti
 */
public class PersonaVentana0305a extends JInternalFrame implements ActionListener, KeyListener{

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JTextField> jtextFieldList;
    private List<JButton> jButtonList;
    private JScrollPane jScrollPane1;
    private DefaultTableModel tableModel1;
    private JTable jTable1;
    private JComboBox jComboBox1;
    
    private final PersonaControl personaControl = new PersonaControl();
    private final ProfesionControl profesionControl= new ProfesionControl();

    
    public PersonaVentana0305a(String title) {
        super(title);
        this.setSize(500, 400);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }

   public void iniciarComponentes(){
       this.jPanelList = new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
              
      
       this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanelList.get(0).setLayout(new GridLayout(2,1));
       this.jPanelList.get(6).setLayout(new GridLayout(1,1));   
       this.jPanelList.get(7).setLayout(new GridLayout(7,1));
       this.jPanelList.get(8).setLayout(new GridLayout(1,1));
       this.jPanelList.get(0).add(this.jPanelList.get(7));
       this.jPanelList.get(0).add(this.jPanelList.get(8));
       
       this.jPanelList.get(7).add(this.jPanelList.get(1));
       this.jPanelList.get(7).add(this.jPanelList.get(2));
       this.jPanelList.get(7).add(this.jPanelList.get(3));
       this.jPanelList.get(7).add(this.jPanelList.get(4));
       this.jPanelList.get(7).add(this.jPanelList.get(9));
       this.jPanelList.get(7).add(this.jPanelList.get(5));
       
       
       this.jPanelList.get(8).add(this.jPanelList.get(6));
       
       
       this.iniciarEtiquetas();
       this.jPanelList.get(1).add(this.jLabelList.get(0));
       this.jPanelList.get(2).add(this.jLabelList.get(1));
       this.jPanelList.get(3).add(this.jLabelList.get(2));
       this.jPanelList.get(4).add(this.jLabelList.get(3));
       this.jPanelList.get(9).add(this.jLabelList.get(4));
       
     
       
       this.iniciarCuadrosTexto();
       this.jPanelList.get(1).add(this.jtextFieldList.get(0));
       this.jPanelList.get(2).add(this.jtextFieldList.get(1));
       this.jPanelList.get(3).add(this.jtextFieldList.get(2));
       this.jPanelList.get(4).add(this.jtextFieldList.get(3));
       this.jPanelList.get(4).add(this.jtextFieldList.get(4));
       this.jPanelList.get(4).add(this.jtextFieldList.get(5));
       
       
       this.iniciarCombo();
       this.jPanelList.get(9).add(this.jComboBox1);
       
              
       this.iniciarBotones();
       this.jPanelList.get(5).add(this.jButtonList.get(0));
       this.jPanelList.get(5).add(this.jButtonList.get(1));
       
       this.iniciarTabla();
       this.jPanelList.get(6).add(this.jScrollPane1);  
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setText("Ingrese el código: "); 
       this.jLabelList.get(1).setText("Ingrese los nombres: ");
       this.jLabelList.get(2).setText("Ingrese los apellidos: ");
       this.jLabelList.get(3).setText("Ingrese la fecha de nacimiento: AAAA/MM/DD");
       this.jLabelList.get(4).setText("Seleccione su profesión: ");
      
   }

   public void iniciarCuadrosTexto(){
       this.jtextFieldList = new ArrayList<>();
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
                  
       this.jtextFieldList.get(0).setColumns(5);
       this.jtextFieldList.get(0).addActionListener(this);
       this.jtextFieldList.get(1).setColumns(20);
       this.jtextFieldList.get(2).setColumns(20);
       this.jtextFieldList.get(3).setColumns(4);
       this.jtextFieldList.get(4).setColumns(2);
       this.jtextFieldList.get(5).setColumns(2);
       this.jtextFieldList.get(0).addKeyListener(this);
       this.jtextFieldList.get(1).addKeyListener(this);
       this.jtextFieldList.get(2).addKeyListener(this);
       this.jtextFieldList.get(3).addKeyListener(this);
       this.jtextFieldList.get(4).addKeyListener(this);
       this.jtextFieldList.get(5).addKeyListener(this);
       
   }
   
   public void iniciarBotones(){
       this.jButtonList = new ArrayList<>();
       this.jButtonList.add(new JButton());
       this.jButtonList.add(new JButton());
       
       this.jButtonList.get(0).setText("Registrar");
       this.jButtonList.get(1).setText("Mostrar");
       
       this.jButtonList.get(0).addActionListener(this);
       this.jButtonList.get(1).addActionListener(this);
       
   }
   
   public void iniciarTabla(){
       this.tableModel1 = new DefaultTableModel();
       this.tableModel1.addColumn("Apellidos");
       this.tableModel1.addColumn("Nombres");
       this.tableModel1.addColumn("Edad");
       this.tableModel1.addColumn("Profesión");
       this.jTable1 = new JTable (this.tableModel1);
       this.jScrollPane1 = new JScrollPane(jTable1);
   }
   
   public void actualizarTabla(){
       var header = new String [] {"Apellidos", "Nombres", "Edad", "Profesión"};
       var data = new Object[this.personaControl.listar().size()][4];
            
       for(var i=0; i<this.personaControl.listar().size();i++){
           data[i][0]=this.personaControl.listar().get(i).getApellido();
           data[i][1]=this.personaControl.listar().get(i).getNombre();
           data[i][2]=this.personaControl.listar().get(i).getEdad();
           data[i][3]=this.personaControl.listar().get(i).getProfesion().getDescripcion();
           
       }
       
       this.tableModel1 = new DefaultTableModel(data,header);
       this.jTable1.setModel(this.tableModel1);
   }
   
   public void iniciarCombo(){
       this.jComboBox1 = new JComboBox();
   }
   
   public void actualizarCombo(){
       this.jComboBox1.removeAllItems();
       for(var profesional:this.profesionControl.listar())
           this.jComboBox1.addItem(profesional);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jButtonList.get(0))){
            if(JOptionPane.showConfirmDialog(this, "¿ Está seguro de registrar estos datos ?",
                    "Seleccione una opción...", JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE)==0){
                try{    
                    String [] params = new String[7];
                    params[0]=this.jtextFieldList.get(0).getText();
                    params[1]=this.jtextFieldList.get(1).getText();
                    params[2]=this.jtextFieldList.get(2).getText();
                    params[3]=this.jtextFieldList.get(3).getText();
                    params[4]=this.jtextFieldList.get(4).getText();
                    params[5]=this.jtextFieldList.get(5).getText();
                    var profesion = (Profesion)(this.jComboBox1.getSelectedItem());
                    params[6]=String.valueOf(profesion.getCodigo());
                    this.personaControl.crear(params);
                    this.actualizarTabla();
                    JOptionPane.showMessageDialog(this, "Persona almacenada satisfactoriamente",
                            "ATENCIÓN",JOptionPane.INFORMATION_MESSAGE); 
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"ERROR",
                                JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource().equals(this.jButtonList.get(1)))
            this.actualizarTabla();
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.actualizarCombo();
    }

}
