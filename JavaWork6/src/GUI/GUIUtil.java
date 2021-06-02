package GUI;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;

public class GUIUtil {

	public static void putInCenter(Component c) {
		Toolkit kit = Toolkit.getDefaultToolkit();// 和本地窗口系统打交道
		Dimension screenSize = kit.getScreenSize();// 返回屏幕大小
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		c.setLocation(screenWidth / 2 - c.getWidth() / 2,
				screenHeight / 2 - c.getHeight() / 2);
	}

	public static void initGui() {

		try {

			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			Font font = new Font("Dialog", Font.PLAIN, 16);
			UIManager.put("MenuBar.font", font);
			UIManager.put("MenuItem.font", font);
			UIManager.put("Menu.font", font);
			UIManager.put("PopupMenu.font", font);
			UIManager.put("ToolBar.font", font);
			UIManager.put("ToolTip.font", font);
			UIManager.put("TabbedPane.font", font);
			UIManager.put("Label.font", font);
			UIManager.put("List.font", font);
			UIManager.put("ComboBox.font", font);
			UIManager.put("Button.font", font);
			UIManager.put("Table.font", font);
			UIManager.put("TableHeader.font", font);
			UIManager.put("Tree.font", font);
			UIManager.put("TextField.font", font);
			UIManager.put("TextArea.font", font);
			UIManager.put("TitledBorder.font", font);
			UIManager.put("OptionPane.font", font);
			UIManager.put("RadioButton.font", font);
			UIManager.put("CheckBox.font", font);
			UIManager.put("ToggleButton.font", font);
			UIManager.put("Dialog.font", font);
			UIManager.put("Panel.font", font);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
