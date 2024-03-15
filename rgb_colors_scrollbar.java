import java.awt.*;
import java.awt.event.*;



class MyFrames extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    public MyFrames()
    {
        super("Scroll bar demo");

        red=new Scrollbar(Scrollbar.VERTICAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.VERTICAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.VERTICAL,0,20,0,255);
        tf=new TextField(20);

        tf.setForeground(Color.black);
         Font newf = new Font("Arial",Font.BOLD,30);
         tf.setFont(newf);
        tf.setBounds(50,50,300,50);
        red.setBounds(70,150,50,300);
        blue.setBounds(170,150,50,300);
        green.setBounds(270,150,50,300);


        setLayout(null);
        add(tf);
        add(red);
        add(blue);
        add(green);

        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));

    }
}
public class ScrollbarDemo {

    public static void main(String[] args) {
        MyFrames f=new MyFrames();
        f.setSize(500,500);
        f.setVisible(true);
        // TODO code application logic here
    }

}
