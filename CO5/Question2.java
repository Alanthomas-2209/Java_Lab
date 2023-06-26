package java_lab.CO5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question2 extends Frame implements ActionListener {
    Label lb1,lb2,lb3,lb4;

    TextField txt1,txt2,txt3,txt4;

    Button btn1,btn2,btn3;

    public Question2() {
        lb1 = new Label("Var 1");
        lb2 = new Label("Var 2");
        lb3 = new Label("var 3");
        lb4 = new Label("Result");

        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
        txt4 = new TextField(10);

        btn1 = new Button("MAX");
        btn2 = new Button("RESET");
        btn3 = new Button("CLOSE");

        add(lb1);
        add(txt1);
        add(lb2);
        add(txt2);
        add(lb3);
        add(txt3);
        add(lb4);
        add(txt4);
        add(btn1);
        add(btn2);
        add(btn3);


        setSize(300,300);
        setTitle("FIND MAXIMUM");
        setLayout(new FlowLayout());
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        double a = 0, b = 0, c = 0;
        try {
            a = Double.parseDouble(txt1.getText());
        }
        catch (NumberFormatException e) {
            txt1.setText("Invalid input");
        }
        try {
            b = Double.parseDouble(txt2.getText());
        }
        catch (NumberFormatException e) {
            txt2.setText("Invalid input");
        }
        try {
            c = Double.parseDouble(txt3.getText());
        }
        catch (NumberFormatException e) {
            txt3.setText("Invalid input");
        }
        if(ae.getSource()==btn1) {
            double max = Math.max(a,Math.max(b,c));
//            if(a > b){
//                if(a>c){
//                    max = a;
//                }
//                else if (c > b) {
//                    max = c;
//                }
//            } else if (b > c) {
//                max = b;
//            }
//            else {
//                max = c;
//            }
//            c = a + b;
            txt4.setText(String.valueOf(max));
        }
        if(ae.getSource()==btn2) {
            txt1.setText("0");
            txt2.setText("0");
            txt3.setText("0");
        }
        if(ae.getSource()==btn3) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Question2 max = new Question2();
        max.setVisible(true);
        max.setLocation(300,300);
    }
}