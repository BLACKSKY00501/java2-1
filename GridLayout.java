import java.awt.*;
import java.awt.GridLayout;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout extends JFrame{
    public GridLayoutEx(){
        super(title:"GridLayout 예제")
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //1x10의 GridLayout 배치관리자
        contentPane.setLayout(new GridLayout(rws:1 cols:10));

        for(int i=9; i>=0; i--){ //10개의 버튼 부착
            String text = Integer.toString(i); //i를 문자열로 변환
            contentPane.add(new JButton(text)); //컨텐트팬에 버튼부착
        }
        contentPane.add(new JButton(text:"*"));//컨텐트팬에 버튼부착
        contentPane.add(new JButton(text:"0"));//컨텐트팬에 버튼부착

        setSize(width:250 height:250);
        setVisible(b:true);
    }
    public static void main(String[] args){
        new GridLayoutEx();
    }
}