package snake;

//awt
import javax.swing.*;

public class Snake {

	public static void main(String[] args) {
		//1.绘制静态窗口	JFrame
		JFrame frame = new JFrame("贪吃蛇小游戏");
		frame.setBounds(10, 10, 900, 720);//设置界面大小
		frame.setResizable(false);//窗口大小不可改变
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭事件，游戏可关闭
		
		//2.面板JPanel		可以加入到JFrame
		frame.add(new GamePanel());
		
		frame.setVisible(true);//让窗口能展现
	}
}
