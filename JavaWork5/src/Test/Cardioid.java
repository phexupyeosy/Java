package Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class Cardioid extends JFrame { 
	    private final int event = 1;
	    private final int WIDTH = 500;  //��ȡ��Ļ��С
	    private final int HEIGHT = 500;     
	    private int WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;  
	    private int WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;  
	    private JMenu aboutMenu0 = new JMenu("ÿ��������(�ޣ���)V");
	    private JMenu aboutMenu1 = new JMenu("�������˵");
	    private JMenu aboutMenu2 = new JMenu("��ҲҪд");
	    private JMenuBar menuBar = new JMenuBar();
	    private JMenuItem menuItem = new JMenuItem("<(�����)�J[GO!]");
	    private JMenuItem menuItem0 = new JMenuItem("<(*������*)/��һ��");
	    private JMenuItem menuItem1 = new JMenuItem("<(*������*)/�ڶ���");
	    private JMenuItem menuItem2 = new JMenuItem("<(*������*)/������");
	    private JMenuItem menuItem3 = new JMenuItem("<(*������*)/������");
	    private JMenuItem menuItem4 = new JMenuItem("<(*������*)/������");
	    private JMenuItem menuItem5 = new JMenuItem("<(*������*)/������");
	    private JMenuItem menuItem6 = new JMenuItem("<(*������*)/������");
	    private JMenuItem menuItem7 = new JMenuItem("ддд");
	    private JScrollPane panel = new JScrollPane();
	    
	    public Cardioid(){  
	        super("���ﵽ�˿��");//���ô��ڱ���  
	        this.setBackground(Color.LIGHT_GRAY);  
	        this.setLocation((WINDOW_WIDTH-WIDTH)/2,(WINDOW_HEIGHT-HEIGHT)/2);//���ô���λ��  
	        this.setSize(WIDTH, HEIGHT);//���ô��ڴ�С  
	        this.getContentPane().add(panel, BorderLayout.CENTER);//���ô��ڲ���  
	        this.getContentPane().add(menuBar,BorderLayout.NORTH);
	        this.setVisible(true);//���ô��ڿɼ�  
	        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//���ô���Ĭ�Ϲرշ�ʽ  
	    }  
	      
	    public void paint(Graphics g){  
	        double x,y,r;//���������Լ��뾶  
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
	            g.drawImage(image,0,0,panel);//����ͼƬ            
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
			     JOptionPane.showOptionDialog(null, "����Ǵ�˵�е���������������Ҳ���Ҵ�����ĵ�һ��ͼ�ν���Ŷ�����ǳ��˵㣬�Ͼ���ѧ���������һ���������ģ�������", "<(�����)>", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem0.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ", "<(*������*)/��һ��", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem1.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ��", "<(*������*)/�ڶ���", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem2.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ��", "<(*������*)/������", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem3.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ��", "<(*������*)/������", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem4.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ��", "<(*������*)/������", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem5.addActionListener(event ->{
				 JOptionPane.showOptionDialog(null, "��", "<(*������*)/������", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
			menuItem6.addActionListener(event ->{
			     JOptionPane.showOptionDialog(null, " ��", "<(*������*)/������", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			});
		}
			
	    public static void main(String[] args) {  
	        	new Cardioid();
	        }
	    }  
