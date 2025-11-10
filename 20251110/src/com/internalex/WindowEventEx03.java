package com.internalex;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx03 extends Frame {
	
	public WindowEventEx03() {
		super("Event03");
		addWindowListener(new WinEvent());
		setSize(400, 200);
		setVisible(true);
	}
	
	class WinEvent extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new WindowEventEx03();

	}

}
