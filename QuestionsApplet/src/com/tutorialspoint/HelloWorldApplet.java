package com.tutorialspoint;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawString("Hello World", 25, 50);
	}
}