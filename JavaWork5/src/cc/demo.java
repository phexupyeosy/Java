package cc;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class demo {
	
	
	
	public static void main(String[] args) {
		
		/*****************顶层容器：窗体*********************/
		JFrame win = new JFrame();
		win.setTitle("GuessGame");  //窗体的标题
	
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/***************文字编辑区域******************/
		JTextArea textarea = new JTextArea();
		textarea.setFont(new Font("细明体",Font.PLAIN , 16));
		textarea.setLineWrap(true);
		JScrollPane pane = new JScrollPane(textarea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

		/***************编辑区键盘事件******************/
		textarea.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent event) {
				jtextAreaActionPerformed(event);
			}

			private void jtextAreaActionPerformed(KeyEvent event) {
			    
			}
		});
		
		/***************编辑区鼠标事件******************/
		textarea.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent event) {
				if(event.getButton() == MouseEvent.BUTTON1){
					JOptionPane.showOptionDialog(null, "是不是傻，快写数字", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				}
				if(event.getButton() == MouseEvent.BUTTON3){
					JOptionPane.showOptionDialog(null, "是不是傻，快写数字", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				}
			}
		});
		
		/***************2个按钮******************/
		Button AWTbutton = new Button("AWT Button");
		AWTbutton.setPreferredSize(new Dimension(130,50));
		JButton Swingbutton = new JButton("Swing Button");
		Swingbutton.setPreferredSize(new Dimension(130,50));
		
		/*************主面板***************/
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setPreferredSize(new Dimension(300,240));
		panel.add(Swingbutton);     //将按钮添加到主面板
		panel.add(AWTbutton);        //将按钮添加到主面板
		

		win.getContentPane().add(panel);   //将主面板添加到窗体的内容窗格
		win.pack();                                  
		win.setVisible(true);                       
		
			
	}
	
	
	
}
