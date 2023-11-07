package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JPanel pnlPrincipal;
    private JComboBox cmbIdioma;
    private JButton btnGuardar;
    private JCheckBox chbTerminos;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtPrefieroNoDecir;
    private JLabel lblGenero;

    public IngresarPersona(){
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);
        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String aceptoTerminos = (chbTerminos.isSelected())?"Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "Masculino":
                        (rbtFemenino.isSelected()) ? "Femenino": (rbtOtro.isSelected()) ? "Otro": (rbtPrefieroNoDecir.isSelected()) ?"Prefiero No Decirlo": "";
                String mensaje = "Tus datos son: \n" +
                                 "Codigo: " + codigo + "\n" +
                                 "Nombre: " + nombre +"\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "Genero: " + genero + "\n" +
                                 "Acepto Terminos: " + aceptoTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);


            }
        });
    }
    }