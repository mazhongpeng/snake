package snake;
import java.net.URL;
import javax.swing.*;
//存放外部数据
public class Date {
	
	//头部的图片		URL:定位图片地址		ImageIcon:图片
	public static URL headerURL= Date.class.getResource("/statics/header.png");
	public static ImageIcon header = new ImageIcon(headerURL);
	
	//头部
	public static URL downUrl = Date.class.getResource("/statics/down.png");
	public static URL upUrl = Date.class.getResource("/statics/up.png");
	public static URL leftUrl = Date.class.getResource("/statics/left.png");
	public static URL rightUrl = Date.class.getResource("/statics/right.png");
	public static ImageIcon up = new ImageIcon(upUrl);
	public static ImageIcon down = new ImageIcon(downUrl);
	public static ImageIcon right = new ImageIcon(rightUrl);
	public static ImageIcon left = new ImageIcon(leftUrl);
	//身体
	public static URL bodyUrl = Date.class.getResource("/statics/body.png");
	public static ImageIcon body = new ImageIcon(bodyUrl);
	//食物
	public static URL foodUrl = Date.class.getResource("/statics/food.png");
	public static ImageIcon food = new ImageIcon(foodUrl);

	
	
	
	
}
