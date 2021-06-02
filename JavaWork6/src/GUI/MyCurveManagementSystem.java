package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyCurveManagementSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	  LoginFrame frame = new LoginFrame("登录界面");
        	  GUIUtil.initGui();
        	  GUIUtil.putInCenter(frame);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setVisible(true);
           }
        });
	}

}

class LoginFrame extends JFrame{

	public LoginFrame(String title) throws HeadlessException {
		super(title);
		setLayout(new BorderLayout());
		setSize(250, 120);
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(2, 2));
		northPanel.add(new JLabel("用户名",SwingConstants.CENTER));
		final JTextField userNameTextField = new JTextField();
		northPanel.add(userNameTextField);
		northPanel.add(new JLabel("密 码",SwingConstants.CENTER));
		final JPasswordField passwordTextField = new JPasswordField();
		northPanel.add(passwordTextField);
		
		JPanel southPanel = new JPanel();
		JButton jLoginButton = new JButton("登录");
		southPanel.add(jLoginButton);
		JButton jExitButton = new JButton("退出");
		southPanel.add(jExitButton);
		
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.CENTER);
		
		getRootPane().setDefaultButton(jLoginButton);//设置默认按键
		
		jLoginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = userNameTextField.getText();
				String password = new String(passwordTextField.getPassword());
				UserDao ud = new UserDaoImpl();
				User user = ud.isLogin(userName, password);
				if (user != null){
					ManagementFrame managementFrame = new ManagementFrame("管理系统",user);
					managementFrame.setVisible(true);
					LoginFrame.this.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "您输入的用户名密码不正确");
				}
				
			}
		});
		
		jExitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//获取当前窗体尺寸
				userNameTextField.setText("width ="+LoginFrame.this.getWidth());
				passwordTextField.setText("height="+LoginFrame.this.getHeight());
			}
		});
		
	}
	
}

class AboutDialog extends JDialog
{
   public AboutDialog(JFrame owner)
   {
      super(owner, "About DialogTest", true);

      // add HTML label to center

      add(
            new JLabel(
                  "<html><h1><i>Core Java</i></h1><hr>By Cay Horstmann and Gary Cornell</html>"),
            BorderLayout.NORTH);
      add(new JLabel("这是一个JLable对话框"),BorderLayout.CENTER);

      // Ok button closes the dialog

      JButton ok = new JButton("Ok");
      ok.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               setVisible(false);
            }
         });

      // add Ok button to southern border

      JPanel panel = new JPanel();
      panel.add(ok);
      add(panel, BorderLayout.SOUTH);

      setSize(250, 150);
      pack();
   }
}


class ManagementFrame extends JFrame{
	/**
	 * 
	 */
	private User user;
	public static final int DEFAULE_WIDTH = 300;
	public static final int DEFAULE_HEIGHT = 300;
	
	private JFileChooser fileChooser;
	private AboutDialog aboutDialog; 
	
	private JPanel curvePanel;
	private JPanel filePanel;
	private JTextArea textArea;
	
	public ManagementFrame(String title, User user){
		super(title);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.user = user;
		
		
		//设置显示曲线面板
		curvePanel = new JPanel();
		curvePanel.add(new JLabel("曲线演示"));
		//设置显示文本面板
		filePanel = new JPanel();
		filePanel.setLayout(new BorderLayout());
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane jsl = new JScrollPane(textArea);
		filePanel.add(jsl,BorderLayout.CENTER);
		
		fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new FileNameExtensionFilter("文本文件", "txt"));
		
		//设置菜单
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jItemMenu = new JMenu("项目");
		JMenuItem jCurveMenuItem = new JMenuItem("曲线演示");
		JMenuItem jOpenFileMenuItem = new JMenuItem("打开文件");
		JMenuItem jExitMenuItem = new JMenuItem("退出");
		jCurveMenuItem.addActionListener(new CurveShowListener());
		jOpenFileMenuItem.addActionListener(new FileOpenListener());
		jExitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		jItemMenu.add(jCurveMenuItem);
		jItemMenu.add(jOpenFileMenuItem);
		jItemMenu.addSeparator();
		jItemMenu.add(jExitMenuItem);
		
		
		JMenu jHelpMenu = new JMenu("帮助");
		JMenuItem jCopyRightMenuItem = new JMenuItem("版权信息");
		JMenuItem jAboutMenuItem = new JMenuItem("关于");
		jAboutMenuItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               if (aboutDialog == null) // first time
            	   aboutDialog = new AboutDialog(ManagementFrame.this);
               	aboutDialog.setVisible(true); // pop up dialog
            }
         });
		jHelpMenu.add(jCopyRightMenuItem);
		jHelpMenu.add(jAboutMenuItem);
		
		jMenuBar.add(jItemMenu);
		jMenuBar.add(jHelpMenu);
		setJMenuBar(jMenuBar);
		
		
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	private class CurveShowListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// 下面几行代码也可以考虑使用CardLayout在不同的Panel中进行切换
			filePanel.setVisible(false);//切换的时候更快
			ManagementFrame.this.remove(filePanel);
			ManagementFrame.this.add(curvePanel,BorderLayout.CENTER);
			ManagementFrame.this.validate();
			
			
		}
		
	}
	
	private class FileOpenListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int result = fileChooser.showOpenDialog(ManagementFrame.this);
			if(result == JFileChooser.APPROVE_OPTION){
				String name = fileChooser.getSelectedFile().getPath();
				File file = fileChooser.getSelectedFile();
				ManagementFrame.this.setTitle("打开文件"+name);
				try {
					loadFileToTextArea(file, textArea);
				//	textArea.setText("123\n\r456\n\r");
				//	textArea.append("append");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					ManagementFrame.this.setTitle("读取文件"+name+"错误");
					e1.printStackTrace();
				}
			}
			filePanel.setVisible(true);
			ManagementFrame.this.remove(curvePanel);
			ManagementFrame.this.add(filePanel,BorderLayout.CENTER);
			ManagementFrame.this.validate();
			//filePanel.repaint();
			
		}
		
		private void loadFileToTextArea(File file, JTextArea textArea) throws IOException,FileNotFoundException{
			//StringBuilder sb = new StringBuilder();
			InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "GBK");
			BufferedReader br = new BufferedReader(inputStreamReader);
			String s;
			textArea.setText("");
            while( (s = br.readLine()) != null )  {
            	textArea.append(s);
            	textArea.append(System.getProperty("line.separator"));
            }
            br.close();
            
		}
		
	}
	
	
}


