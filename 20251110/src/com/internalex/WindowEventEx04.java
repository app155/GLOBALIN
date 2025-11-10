package com.internalex;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx04 extends Frame {
	
	public WindowEventEx04() {
		super("Event04");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowEventEx04();

	}

}
