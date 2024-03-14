package AWT;

import java.awt.*;
import java.awt.event.*;
 class Myframe1 extends Frame implements ItemListener {
     Label l;
     Checkbox c1;
     Checkbox c2;
     Checkbox c3;
     CheckboxGroup cbg;
     public Myframe1(){
         super("CHECKAND RADIO");
         l = new Label("Nothing is selected");

         cbg = new CheckboxGroup();
         c1 = new Checkbox("Java", false, cbg);
         c2 = new Checkbox("Python",false,cbg);
         c3 = new Checkbox("C#",false,cbg);

         c1.addItemListener(this);
         c2.addItemListener(this);
         c3.addItemListener(this);

         setLayout(new FlowLayout());

         add(l);
         add(c1);
         add(c2);
         add(c3);
     }

     @Override
     public void itemStateChanged(ItemEvent e) {
         String str ="";
         if (c1.getState())
             str=str+" "+c1.getLabel();
         if (c2.getState())
             str = str+" "+c2.getLabel();
         if (c3.getState())
             str = str+" "+c3.getLabel();
         if (str.isEmpty())
             str = "Noting is selected";
         l.setText(str);
     }
 }

public class CheckboxDemo {
    public static void main(String[] args) {
        Myframe1 f = new Myframe1();
        f.setVisible(true);
        f.setSize(400,400);
    }
}
