import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends Frame implements KeyListener{
    Label l;
    TextArea a;
    KeyboardEvents(){
        l = new Label();
        a = new TextArea();
        l.setBounds(100,100,200,200);
        a.setBounds(150,150, 50, 50);
        a.addKeyListener(this);
        add(l);
        add(a);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
    public static void main(String[] args){
        new KeyboardEvents();
    }
}