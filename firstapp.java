package AWT;
import java.awt.*;
public class firstapp {
    public static void main(String[] args) {
        Frame f = new Frame("My first APP");
        f.setLayout(new FlowLayout());

        Button b= new Button("OK");
        Label l= new Label("Name");
        TextField tf = new TextField(20);

        f.add(l);
        f.add(tf);
        f.add(b);


        f.setSize(300 , 300);
        f.setVisible(true);
    }
}
