package AWT;
import java.awt.*;

class Myframe extends Frame{
    Label l;
    TextField tf;
    Button b;
    public Myframe(){
        super("My App");

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}

public class first2 {
    public static void main(String[] args) {
        Myframe f=new Myframe();
        f.setSize(400,300);
        f.setVisible(true);
    }
}
