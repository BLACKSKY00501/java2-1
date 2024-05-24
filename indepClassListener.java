import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class indepClassListener extends JFrame{
    public indepClassListener() {
        setTitle(title: "Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton(text:"Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(width:250, height:120);
        setVisible(b:true);
    }
    public static void main(String[] args) {
        new IndepClassListener();
    }
}
class MyActionListener implements ActionListener{
    public void actionPerFormed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals(anObject:"Action"))
            b.setText(text:"액션");
        else 
            b.setText(text:"Action");
        
    }
}
