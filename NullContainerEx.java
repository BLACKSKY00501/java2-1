import java.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrme{
    public NullContainerEx(){
        setTitle(title:"배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane=getContentPane();
        contentPane.setLayout(mgr:null); //컨탠트팬의 배치관리자 제거
        
        JLabel la = new JLabel(text:"hello, press button");
        la.setLocation(x:130, y:50);
        la.setSize(width:200, height:20);
        ContentPane(x:130, y:50, width:200, height:20)
        ContentPane.add(new JLabel(text:"hello, press button"))
    }
    
}