/**
 * The MVC clock example from the MVC lecture.
 * This class is the Controller, which responds to user interaction.
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class controller {

	private gameGUI hpView; // GUI to allow user to set the time

	private hpLabelModel currentHP; // clock model stores the time

	public controller(gameGUI hpView, hpLabelModel currentHP) {
		this.hpView = hpView;
		this.currentHP = currentHP;
		// specify the listener for the view
		hpView.addSetListener(new SetListener());
	}

	// inner class SetListener responds when user sets the time
	public class SetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			currentHP.updateHpLabelModel();
			
		}
	}

}
