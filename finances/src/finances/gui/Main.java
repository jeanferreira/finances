package finances.gui;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import finances.view.JFHome;




public class Main extends SingleFrameApplication {
	
	private static JFHome jhome;

	public static void main(String[] args) {
		launch(Main.class, args);

	}
	
	public static Main getApplication() {
		return Application.getInstance(Main.class);
	}

	@Override
	protected void configureWindow(java.awt.Window root) {
	}


	@Override
	protected void startup() {
		if (jhome == null) {
			jhome = new JFHome();
			jhome.setVisible(true);

		} else {
			jhome.setVisible(true);
		}

	}

}
