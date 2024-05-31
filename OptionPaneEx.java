import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame{
    public OptionPaneEx(){
        setTitle(title:"옵션팬예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(width:500, height: 200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(b:true);
    }
    class MyPanel extends Panel{
        private JButton inputBtn = new JButton(text:"Input Name");
        private JTextField inputBtn = new JTextField(columns:10);
        private JButton confirmBtn = new JButton(text:"Confirm");
        private JButton messageBtn = new JButton(text:"Message");

        public MyPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);

            add(tf);
            inputBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String name=JOptionPane.showInputDialog(message:"이름을 입력하세요");
                    if(name != null)
                        tf.setText(name);
                }
            });
            confirmBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int result = JOptionPane.showOptionDialog(
                                            message:"계속할것입니까?",confirm,
                                            JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_NO_OPTION);
                        tf.setText(t:"just Closed without Selection");
                    else if(result == JOptionPane.YES_OPTION)
                    tf.setText(t:"Yes");
                    else 
                        tf.setText(t:No);

                }
            });
            messageBtn.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent e){
                    JOptionPane.showMessageDialog(rootPane, e, getTitle(), DISPOSE_ON_CLOSE);
                }
            });
        }
    }
}