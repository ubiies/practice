package com.nhnacademy;

import javax.swing.JFrame;

public class FrameDemo01 {
    public static void main(String[] args) {
        /*
         * single thread 
         * 
         */
        // 1. Frame 객체 생성
        JFrame frame = new JFrame("FrameDemo01");
        // 2. Frame 크기 지정
        frame.setSize(400, 300);
        // 3. Frame 보여주기
        frame.setVisible(true);
        // 4. Graphics 객체를 가져와 사각형을 그린다.
        // 일반적으로 쓰는 방법은 아님
        frame.getGraphics().drawRect(0,0,100,100);
    }
}
