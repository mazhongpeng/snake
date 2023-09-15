package snake;

//2.画板
// TODO Auto-generated method stub
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener, ActionListener{
	int length;//蛇的长度
	int[] snakeX = new int[600];//蛇的坐标x
	int[] snakeY = new int[500];//蛇的坐标y
	String fx;
	boolean isStart = false;//游戏是否开始
	Timer timer = new Timer(100,this);//定时器
//    this.addActionListener(this);
	//构造器
	public GamePanel() {
		init();
		//获取键盘的监听事件
		this.setFocusable(true);
		this.addKeyListener(this);
//		this.addActionListener(this);
	}
	
	//初始化
	public void init() {
		length = 3;
		snakeX[0] = 100;snakeY[0] = 100;//头部坐标
		snakeX[1] = 75;snakeY[1] = 100;//第一个身体坐标
		snakeX[2] = 50;snakeY[2] = 100;//第二个身体坐标
		fx = "R";
	}
	//Graphics：画笔
	//画板：画界面，画蛇
	@Override//重写父类方法
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//清屏
		this.setBackground(Color.DARK_GRAY);//设置背景色
		Date.header.paintIcon(this, g, 25, 11);//绘制头部的广告栏
		g.fillRect(25, 75, 850, 600);//绘制游戏区域
		
		//画一条静态的小蛇
		if(fx.equals("R")) {
			Date.right.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("L")) {
			Date.left.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("U")) {
			Date.up.paintIcon(this, g, snakeX[0], snakeY[0]);
		}else if(fx.equals("D")) {
			Date.down.paintIcon(this, g, snakeX[0], snakeY[0]);
		}
//		Date.body.paintIcon(this, g, snakeX[1], snakeY[1]);
//		Date.body.paintIcon(this, g, snakeX[2], snakeY[2]);
		
		for(int i = 1;i < length;i++) {
			Date.body.paintIcon(this, g, snakeX[i], snakeY[i]);//蛇的身体长度通过length控制
		}
		
		//游戏提示：是否开始
		if(isStart == false) {
			//画一个文字String
			g.setColor(Color.WHITE);//设置画笔颜色
			g.setFont(new Font("华文彩云",Font.BOLD,40));
			g.drawString("按下空格，开冲！", 300, 300);
		}
	}

	
	//接收键盘的输入：监听
	@Override
	public void keyPressed(KeyEvent e) {
		//键盘按下，未释放；获取按下的键是哪个键
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_SPACE){//如果按下的是空格键
			isStart = !isStart;
			repaint();//刷新界面
		}
	}
	//定时器，监听时间，帧： 执行定时操作
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(3);
		// 如果游戏处于开始状态
		if(isStart) {
			//右移
			for(int i = length-1;i > 0;i--) {//除了头，身体部分移动
				System.out.println(length);
				snakeX[i] = snakeX[i-1];
				snakeY[i] = snakeY[i-1];
			}
			if(fx.equals("R"))
			snakeX[0] = snakeX[0]+25;//头部移动
			//边界判断
			if(snakeX[0]>850) {
				snakeX[0] = 25;
			}
			
			repaint();//刷新界面
		}
		timer.start();//让时间动起来
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//键盘按下，弹起：敲击
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//释放某个键
	}
}

