package java_lab.CO5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question3 extends Frame implements ActionListener {
    Label label1 , label2, label3, label4, label5;
    TextField txt1, txt2, txt3, txt4, txt5;
    Button btn1, btn2;


    public Question3(){
        label1 = new Label("Subject 1");
        label2 = new Label("Subject 2");
        label3 = new Label("Subject 3");
        label4 = new Label("Subject 4");
        label5 = new Label("Subject 5");

        txt1 = new TextField(10);
        txt2 = new TextField(10);
        txt3 = new TextField(10);
        txt4 = new TextField(10);
        txt5 = new TextField(10);

        btn1 = new Button("SUBMIT");
        btn2 = new Button("CLOSE");

        add(label1);
        add(txt1);
        add(label2);
        add(txt2);
        add(label3);
        add(txt3);
        add(label4);
        add(txt4);
        add(label5);
        add(txt5);

        setSize(500,500);
        setTitle("Average Calculator");
        setLayout(new FlowLayout());
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actions(ActionEvent ae) {
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;

        try {
            s1 = Double.parseDouble(txt1.getText());
        }
        catch (NumberFormatException e) {
            txt1.setText("Invalid input..!");
        }
        try {
            s2 = Double.parseDouble(txt2.getText());
        }
        catch (NumberFormatException e) {
            txt2.setText("Invalid input..!");
        }
        try {
            s3 = Double.parseDouble(txt3.getText());
        }
        catch (NumberFormatException e) {
            txt3.setText("Invalid input..!");
        }
        try {
            s4 = Double.parseDouble(txt3.getText());
        }
        catch (NumberFormatException e) {
            txt4.setText("Invalid input..!");
        }
        try {
            s5 = Double.parseDouble(txt5.getText());
        }
        catch (NumberFormatException e) {
            txt5.setText("Invalid input..!");
        }
        if (ae.getSource() == btn1){
            double avg =  (s1 + s2 + s3 + s4 + s5) / 5;
            Image picture = getIconImage(getDocumentBase());
        }
        if(ae.getSource() == btn2){
            System.exit(0);
        }
    }
    public static void main(String[] Args){
        Question3 average = new Question3();
        average.setVisible(true);
        average.setLocation(500,500);
    }
}
