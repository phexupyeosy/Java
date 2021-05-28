package Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class Cardioid extends JFrame { 
	    private final int event = 1;
	    private final int WIDTH = 500;  //获取屏幕大小
	    private final int HEIGHT = 500;     
	    private int WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;  
	    private int WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;  
	    private JMenu aboutMenu0 = new JMenu("每天正能量(＾－＾)V");
	    private JMenu aboutMenu1 = new JMenu("我想对你说");
	    private JMenu aboutMenu2 = new JMenu("我也要写");
	    private JMenuBar menuBar = new JMenuBar();
	    private JMenuItem menuItem = new JMenuItem("<(￣︶￣)↗[GO!]");
	    private JMenuItem menuItem0 = new JMenuItem("<(*￣▽￣*)/第一天");
	    private JMenuItem menuItem1 = new JMenuItem("<(*￣▽￣*)/第二天");
	    private JMenuItem menuItem2 = new JMenuItem("<(*￣▽￣*)/第三天");
	    private JMenuItem menuItem3 = new JMenuItem("<(*￣▽￣*)/第四天");
	    private JMenuItem menuItem4 = new JMenuItem("<(*￣▽￣*)/第五天");
	    private JMenuItem menuItem5 = new JMenuItem("<(*￣▽￣*)/第六天");
	    private JMenuItem menuItem6 = new JMenuItem("<(*￣▽￣*)/第七天");
	    private JMenuItem menuItem7 = new JMenuItem("写写写");
	    private JScrollPane panel = new JScrollPane();
	    
	    public Cardioid(){  
	        super("礼物到了快打开");//设置窗口标题  
	        this.setBackground(Color.LIGHT_GRAY);  
	        this.setLocation((WINDOW_WIDTH-WIDTH)/2,(WINDOW_HEIGHT-HEIGHT)/2);//设置窗口位置  
	        this.setSize(WIDTH, HEIGHT);//设置窗口大小  
	        this.getContentPane().add(panel, BorderLayout.CENTER);//设置窗口布局  
	        this.getContentPane().add(menuBar,BorderLayout.NORTH);
	        this.setVisible(true);//设置窗口可见  
	        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//设置窗口默认关闭方式  
	    }  
	      
	    public void paint(Graphics g){  
	        double x,y,r;//横纵坐标以及半径  
	        Image image = this.createImage(WIDTH, HEIGHT);  
	        Graphics pic = image.getGraphics();  
	        for (int i = -2; i < 90; i++) {  
	            for (int j = -2; j < 90; j++) {  
	                r=Math.PI/45+Math.PI/45*i*(1-Math.sin(Math.PI/45*j))*18;  
	                x=r*Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+WIDTH/2;  
	                y=-r*Math.sin(Math.PI/45*j)+HEIGHT/3;  
	                pic.setColor(Color.RED);  
	                pic.fillOval((int)x, (int)y, 2, 2);  
	            }  
	            g.drawImage(image,0,0,panel);//生成图片            
	        }  
	    }  
	    
	    public void initMenuBar( event){	       
	        aboutMenu0.add(menuItem0);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem1);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem2);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem3);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem4);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem5);  aboutMenu0.addSeparator();
			aboutMenu0.add(menuItem6);
			aboutMenu2.add(menuItem7);
			aboutMenu1.add(menuItem);
			menuItem.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, "这就是传说中的生日礼物啦！这也是我打出来的第一个图形界面哦，丑是丑了点，毕竟初学者嘛，相信你一定不会介意的！哈哈哈", "<(￣︶￣)>", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem0.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ", "<(*￣▽￣*)/第一天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem1.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ！", "<(*￣▽￣*)/第二天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem2.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ！", "<(*￣▽￣*)/第三天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem3.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ！", "<(*￣▽￣*)/第四天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem4.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ！", "<(*￣▽￣*)/第五天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem5.addActionListener(event ->{
				 JOptionPane.showOptionDialog(null, "）", "<(*￣▽￣*)/第六天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem6.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ！", "<(*￣▽￣*)/第七天", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
		}
			
	    public static void main(String[] args) {  
	        	new Cardioid();
	        }
	    }  
