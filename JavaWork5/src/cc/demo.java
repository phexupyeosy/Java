package cc;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class demo {
	
	
	
	public static void main(String[] args) {
		
		/*****************��������������*********************/
		JFrame win = new JFrame();
		win.setTitle("GuessGame");  //����ı���
	
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/***************���ֱ༭����******************/
		JTextArea textarea = new JTextArea();
		textarea.setFont(new Font("ϸ����",Font.PLAIN , 16));
		textarea.setLineWrap(true);
		JScrollPane pane = new JScrollPane(textarea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

		/***************�༭�������¼�******************/
		textarea.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent event) {
				jtextAreaActionPerformed(event);
			}

			private void jtextAreaActionPerformed(KeyEvent event) {
			    
			}
		});
		
		/***************�༭������¼�******************/
		textarea.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent event) {
				if(event.getButton() == MouseEvent.BUTTON1){
					JOptionPane.showOptionDialog(null, "�ǲ���ɵ����д����", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				}
				if(event.getButton() == MouseEvent.BUTTON3){
					JOptionPane.showOptionDialog(null, "�ǲ���ɵ����д����", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				}
			}
		});
		
		/***************2����ť******************/
		Button AWTbutton = new Button("AWT Button");
		AWTbutton.setPreferredSize(new Dimension(130,50));
		JButton Swingbutton = new JButton("Swing Button");
		Swingbutton.setPreferredSize(new Dimension(130,50));
		
		/*************�����***************/
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setPreferredSize(new Dimension(300,240));
		panel.add(Swingbutton);     //����ť��ӵ������
		panel.add(AWTbutton);        //����ť��ӵ������
		

		win.getContentPane().add(panel);   //���������ӵ���������ݴ���
		win.pack();                                  
		win.setVisible(true);                       
		
			
	}
	
	
	
}
