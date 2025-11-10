package com.internalex;
import java.awt.*;
import java.awt.event.*;

class WinEvent extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}


public class WindowEventEx01 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		f.setSize(400, 300);
		f.setVisible(true);
		

	}

}
