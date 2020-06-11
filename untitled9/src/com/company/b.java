package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class b implements ActionListener {

    Main pearent;

    char selA = ' ';
    double curr1 =0;
    double curr2 =0;


    String po1 = "Glovo";
    String po1pas = "12345";

    String po2 = "Void";
    String po2pas = "Kor1";

    b(Main pearent){
        this.pearent = pearent;
    }

    public  void actionPerformed(ActionEvent e) {

        JButton clicBatton = (JButton) e.getSource();
        String dispFieldTextOne = pearent.field.getText();
        String dispFieldTextTwo = pearent.field2.getText();
        String dispFieldTextFIN = pearent.field3.getText();

        String dispFieldTextName = pearent.Name.getText();
        String dispFieldTextPas = pearent.Pas.getText();

        double dis1 = 0;
        double dis2 = 0;
        double dis3 = 0;

        String name = "";
        String pas = "";


        if (!"".equals(dispFieldTextOne)) {
            dis1 = Double.parseDouble(dispFieldTextOne);
        }
        if (!"".equals(dispFieldTextTwo)) {
            dis2 = Double.parseDouble(dispFieldTextTwo);
        }


        if (!"".equals(dispFieldTextName)) {
            name = dispFieldTextName;

        }

        if (!"".equals(dispFieldTextPas)) {
            pas = dispFieldTextPas;
        }

        Object src = e.getSource();


        if (src == pearent.buttonP) {

            selA = '+';
            curr1 = dis1;
            curr2 = dis2;
            pearent.field.setText("");
            pearent.field2.setText("");
            dis3 = dis1 + dis2;
            pearent.field3.setText("" + dis3);


        } else if (src == pearent.buttonM) {
            selA = '-';
            curr1 = dis1;
            curr2 = dis2;
            pearent.field.setText("");
            pearent.field2.setText("");
            dis3 = dis1 - dis2;
            pearent.field3.setText("" + dis3);
        } else if (src == pearent.buttonR) {
            selA = '*';
            curr1 = dis1;
            curr2 = dis2;
            pearent.field.setText("");
            pearent.field2.setText("");
            dis3 = dis1 * dis2;
            pearent.field3.setText("" + dis3);
        } else if (src == pearent.buttonY) {
            selA = '/';
            curr1 = dis1;
            curr2 = dis2;
            pearent.field.setText("");
            pearent.field2.setText("");
            dis3 = dis1 / dis2;
            pearent.field3.setText("" + dis3);
        }else {

            pearent.field.setText("");
            pearent.field2.setText("");
            pearent.field3.setText("");

        }
        if (src == pearent.Avt) {

            if (name.equals(po1) && pas.equals(po1pas)) {

                pearent.Name.setText("Welcome " + name);
                pearent.Pas.setText("");

            } else if (name.equals(po2) && pas.equals(po2pas)) {
                pearent.Name.setText("Welcome " + name);
                pearent.Pas.setText("");
            } else if (name.equals("")) {
                pearent.Name.setText("");
                pearent.Pas.setText("");
                JOptionPane.showConfirmDialog(null, "поля логин или пароль незаполнены", "Erro", JOptionPane.PLAIN_MESSAGE);
            } else if (pas.equals("")) {
                pearent.Name.setText("");
                pearent.Pas.setText("");
                JOptionPane.showConfirmDialog(null, "поля логин или пароль незаполнены", "Erro", JOptionPane.PLAIN_MESSAGE);
            } else {
                pearent.Name.setText("");
                pearent.Pas.setText("");
                JOptionPane.showConfirmDialog(null, "неверен логин или пароль", "Erro", JOptionPane.PLAIN_MESSAGE);
            }


        }



        //String clikBB = clicBatton.getText();
        //pearent.field3.setText(dispFieldTextOne+clikBB);


        //JOptionPane.showConfirmDialog(null,dispFieldText,"text",JOptionPane.PLAIN_MESSAGE);

    }
}