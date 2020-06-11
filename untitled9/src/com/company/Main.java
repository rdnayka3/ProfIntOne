package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.Flow;

public class Main {
    JPanel myPanal;

    JComboBox box;
    String [] colors = {"white","red"};


    JComboBox box1;
    String [] colors1 = {"white","red"};

    JLabel N;
    JLabel P;
    JTextField Name;
    JTextField Pas;
    JButton Avt;

    JTextField field;
    JTextField field2;
    JTextField field3;

    JButton buttonP;
    JButton buttonM;
    JButton buttonR;
    JButton buttonY;
    JPanel p;
    JPanel pavt;
    JPanel p1;
    Main(){
        myPanal = new JPanel();
        BorderLayout b1= new BorderLayout();
        myPanal.setLayout(b1);

        box = new JComboBox(colors);
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               if(e.getStateChange() == ItemEvent.SELECTED){
                   if (box.getSelectedIndex() == 0) {
                       field.setBackground(Color.white);
                       field2.setBackground(Color.white);
                       field3.setBackground(Color.white);
                   }
                   else if(box.getSelectedIndex() == 1) {
                       field.setBackground(Color.red);
                       field2.setBackground(Color.red);
                       field3.setBackground(Color.red);
                   }
               }
            }
        });

        box1 = new JComboBox(colors1);
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    if (box1.getSelectedIndex() == 0) {
                        buttonP.setBackground(Color.white);
                        buttonP.setForeground(Color.black);

                    }
                    else if(box1.getSelectedIndex() == 1) {
                        buttonP.setBackground(Color.red);
                        buttonP.setForeground(Color.blue);

                    }
                }
            }
        });


        field = new JTextField(30);
        field2 = new JTextField(30);
        field3 = new JTextField(30);

        p = new JPanel();
        p.add(field);
        p.add(field2);
        p.add(field3);
        p.add(box);
        p.add(box1);

        myPanal.add("North",p);

        buttonP = new JButton("+");
        buttonM = new JButton("-");
        buttonR = new JButton("*");
        buttonY = new JButton("/");


        N = new JLabel("Name");
        P = new JLabel("Password");
        Name = new JTextField(10);
        Pas = new JTextField(10);
        Avt = new JButton("Go");
        pavt = new JPanel();

        pavt.add(N);
        pavt.add(Name);
        pavt.add(P);
        pavt.add(Pas);
        pavt.add(Avt);
        myPanal.add("East",pavt);

        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3);
        p1.setLayout(g1);


        p1.add(buttonP);
        p1.add(buttonM);
        p1.add(buttonR);
        p1.add(buttonY);

        myPanal.add("Center",p1);

        JFrame frame = new JFrame("+++");
        frame.setContentPane(myPanal);

        frame.pack();

        frame.setVisible(true);



        b brain = new b(this);
        buttonP.addActionListener(brain);
        buttonM.addActionListener(brain);
        buttonR.addActionListener(brain);
        buttonY.addActionListener(brain);
        Avt.addActionListener(brain);
    }
    public static void main(String[] args) {

        Main calc = new  Main();
    }

}
