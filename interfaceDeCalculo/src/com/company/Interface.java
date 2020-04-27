package com.company;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame implements ActionListener{
    //Codigos da interface
    private JLabel calc,dim1,dim2,dim3;
    private JTextField Tdim1,Tdim2,Tdim3;

    private JComboBox<String> cmbUnidade;
    private JButton btncalcular;



    public Interface() {
        setTitle("Escolha o que deseja calcular.");
        setSize(300, 150);

        Container tela = getContentPane();
        tela.setLayout(new GridLayout(4,3));


        calc = new JLabel("Selecione ");
        //calc1 = new JLabel("1");
        dim1 = new JLabel("Lado 1");
        Tdim1 = new JTextField();
        dim2 = new JLabel("Lado 2");
        Tdim2 = new JTextField();

        dim3 = new JLabel("Altura");
        Tdim3 = new JTextField();
        //Caixa de opções
        String op[] = {"Quadrado","Retangulo","Losango","Triangulo","Trapezio","Circulo"};
        cmbUnidade = new JComboBox<>(op);
        cmbUnidade.addActionListener(this);


        //Botao de Calcular
        btncalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Mudança de calculo
                if(cmbUnidade.getSelectedIndex()==0) {
                    Quadrado c = new Quadrado(Double.parseDouble(Tdim1.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Quadrado: " + c.calcularArea());

                }
                else if(cmbUnidade.getSelectedIndex()==1)
                {
                    Retangulo c = new Retangulo(Double.parseDouble(Tdim1.getText()),Double.parseDouble(Tdim2.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Retangulo: " + c.calcularArea());

                }
                else if(cmbUnidade.getSelectedIndex()==2)
                {
                    Losango c = new Losango(Double.parseDouble(Tdim1.getText()),Double.parseDouble(Tdim2.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Losango: " + c.calcularArea());

                }
                else if(cmbUnidade.getSelectedIndex()==3)
                {
                    Triangulo c = new Triangulo(Double.parseDouble(Tdim1.getText()),Double.parseDouble(Tdim2.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Triangulo: " + c.calcularArea());

                }

                else if(cmbUnidade.getSelectedIndex()==4)
                {
                    Trapezio c = new Trapezio(Double.parseDouble(Tdim1.getText()),Double.parseDouble(Tdim2.getText()),Double.parseDouble(Tdim3.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Trapezio: " + c.calcularArea());

                }

                else if(cmbUnidade.getSelectedIndex()==5)
                {
                    Circulo c = new Circulo(Double.parseDouble(Tdim1.getText()));
                    calcArea(c);
                    JOptionPane.showMessageDialog(null,"Area do Circulo: " + c.calcularArea());

                }

            }

        });
        btncalcular.addActionListener(this);
        tela.add(btncalcular,BOTTOM_ALIGNMENT);
        tela.add(cmbUnidade);
        //Primeira Dimensão
        tela.add(dim1);
        tela.add(Tdim1);


    }

    private static void calcArea(Calculo c)
    {
        //Sobrescrito pelas outras classes
    }

    //Altera o que esta sendo calculado
    @Override
    public void actionPerformed(ActionEvent item)
    {
        if(item.getSource() == cmbUnidade){
        JComboBox cb = (JComboBox)item.getSource();
        String msg = (String)cb.getSelectedItem();
        switch (msg)
        {
            case"Quadrado":
                remove(dim2);
                remove(Tdim2);

                dim1.setText("Lado");
                break;

            case "Retangulo":
             add(dim2,LEFT_ALIGNMENT);
             add(Tdim2,RIGHT_ALIGNMENT);
             remove(Tdim3);
             remove(dim3);

             dim1.setText("Lado 1");
             dim2.setText("Lado 2");
             break;

            case "Losango":
            add(dim2,LEFT_ALIGNMENT);
            add(Tdim2,RIGHT_ALIGNMENT);
            remove(Tdim3);
            remove(dim3);

            dim1.setText("Diagonal 1(D)");
            dim2.setText("Diagonal 1(d)");

            break;

            case "Triangulo":

                add(dim2,LEFT_ALIGNMENT);
                add(Tdim2,RIGHT_ALIGNMENT);
                remove(Tdim3);
                remove(dim3);

                dim1.setText("Base(b)");
                dim2.setText("Altura(h)");
                break;

            case "Trapezio":

                add(dim2,LEFT_ALIGNMENT);
                add(Tdim2,RIGHT_ALIGNMENT);
                add(dim3,LEFT_ALIGNMENT);
                add(Tdim3,RIGHT_ALIGNMENT);

                dim1.setText("Base maior");
                dim2.setText("Base menor");
                break;

            case"Circulo":
                remove(dim2);
                remove(Tdim2);
                remove(Tdim3);
                remove(dim3);

                dim1.setText("Raio");
                break;
        }


    }
    }



    public static void main(String[] args)
    {

        JFrame Interface = new Interface();
        Interface.setVisible(true);
    }

}
