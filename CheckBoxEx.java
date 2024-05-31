import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame{
    public CheckBoxEx() {
        setTitle(title:"체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox apple = new JCheckBox(text:"사과");
        JCheckBox pear = new JCheckBox(text:"배", selected:true);
        JCheckBox cherry = new JCheckBox(text:"체리");

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(width:250,height:150);
        setVisible(b:true);
    }   
    public static void main(String[] args) {
        new CheckBoxEx()
    }
}