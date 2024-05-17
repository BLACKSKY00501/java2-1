import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx() {
        setTitle(title:"BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= getContentPane();
        contentPane.setLayout(getLayout());

        contentPane.add(new JButton(text:"Calculater"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);
        
        setSize(300, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력

    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
