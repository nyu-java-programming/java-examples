package edu.nyu.cs.fb1258.recursion.mandelbrot;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public final class MandelbrotFractal extends Applet implements MouseListener {
	private int max = 64;
	private Color[] colors = new Color[48];
	private double viewX = 0.0;
	private double viewY = 0.0;
	private double zoom = 1.0;
	private int mouseX;
	private int mouseY;

	public void init() {
		this.addMouseListener(this);
		for (int i = 0; i < colors.length; i++) {
			int c = 2 * i * 256 / colors.length;
			if (c > 255)
				c = 511 - c;
			this.colors[i] = new Color(c, c, c);
		}
		this.add(new Label("Drag a box around any area to zoom in"));		
	}

	public void paint(Graphics g) {
		this.setSize(new Dimension(600,400));
		Dimension size = getSize();
		for (int y = 0; y < size.height; y++) {
			for (int x = 0; x < size.width; x++) {
				double r = zoom / Math.min(size.width, size.height);
				double dx = 2.5 * (x * r + this.viewX) - 2.0;
				double dy = 1.25 - 2.5 * (y * r + this.viewY);
				int value = this.mandel(dx, dy);
				g.setColor(this.colors[value % this.colors.length]);
				g.drawLine(x, y, x, y);
			}
		}
	}

	public void update(Graphics g) {
		this.paint(g);
	}

	private int mandel(double px, double py) {
		double zx = 0.0, zy = 0.0;
		double zx2 = 0.0, zy2 = 0.0;
		int value = 0;
		while (value < this.max && zx2 + zy2 < 4.0) {
			zy = 2.0 * zx * zy + py;
			zx = zx2 - zy2 + px;
			zx2 = zx * zx;
			zy2 = zy * zy;
			value++;
		}
		return value == this.max ? 0 : value;
	}

	public void mousePressed(MouseEvent e) {
		this.mouseX = e.getX();
		this.mouseY = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
			if (x != mouseX && y != mouseY) {
				int w = getSize().width;
				int h = getSize().height;
				this.viewX += this.zoom * Math.min(x, this.mouseX) / Math.min(w, h);
				this.viewY += this.zoom * Math.min(y, this.mouseY) / Math.min(w, h);
				this.zoom *= Math.max((double)Math.abs(x - this.mouseX) / w, (double)Math.abs(y - this.mouseY) / h);
			}
		}
		else if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
			this.max += max / 4;
		}
		else {
			this.max = 64;
			this.viewX = this.viewY = 0.0;
			this.zoom = 1.0;
		}
		this.repaint();
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}