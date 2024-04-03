import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;
public class MyFrame extends JFrame implements MouseListener{
JLabel label;
MyFrame() {
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 500);
this.setLayout(null);

label = new JLabel();
label.setBounds(0, 0, 100, 100);
label.setBackground(Color.red);
label.setOpaque(true);
label.addMouseListener(this);

this.add(label);
this.setVisible(true);

}

@Override
public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub
    //System.err.println("You clicked the mouse");
}

@Override
public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub
   System.out.println("You pressed the mouse");
   label.setBackground(Color.yellow);

}
@Override
public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
   System.out.println("You released the mouse");
   label.setBackground(Color.green);
}

@Override
public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
  label.setBackground(Color.CYAN);
}

@Override
public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
   System.out.println("You exited broski");
   label.setBackground(Color.ORANGE);
}
}