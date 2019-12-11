package edu.nyu.cs.fb1258.recursion.fractal_tree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FractalTree extends JPanel {
    public Graphics2D g1;
    public static final int maxAngle = 360;
    public static final int startX = 600;
    public static final int startY = 800;
    public static final int numOfRecursions = 9;
    public static final int startAngle = 0;
    public static final double treeSize = 2;
    public static final int Detail = 3;
    public static final int randFact = 30;
    public static final int[] constFact = {-60, 05, -50, 45};
     
    public static int[] red =   {0, 0, 0, 0, 7, 15, 23, 31, 39, 47, 55, 43};
    public static int[] green = {171, 159, 147, 135, 123, 111, 99, 87, 75, 63, 51, 43};
    public static int[] blue =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};   
     
    public static double degToRad(int deg) {
        return deg * Math.PI / 180;
    }
     
    public static void drawFractal(Graphics2D g1, int x, int y, int n, int angle) {
        if (n == Detail) return;
        int len = (int) Math.round(Math.pow(treeSize, n - 1));
         
        int xn1 = (int) Math.round(x - (2 * len * Math.sin(degToRad(angle))));
        int yn1 = (int) Math.round(y - (2 * len * Math.cos(degToRad(angle))));
        int mid1x = (x + xn1) / 2;
        int mid1y = (y + yn1) / 2;
        int mid2x = (mid1x + xn1) / 2;
        int mid2y = (mid1y + yn1) / 2;
        int mid3x = (x + mid1x) / 2;
        int mid3y = (y + mid1y) / 2;
        int mid4x = (mid3x + mid1x) / 2;
        int mid4y = (mid3y + mid1y) / 2;
         
        java.util.Random r = new java.util.Random();
        drawFractal(g1, mid1x, mid1y, n - 1, (angle + r.nextInt(randFact) + constFact[0]) % maxAngle);
        drawFractal(g1, mid2x, mid2y, n - 1, (angle + r.nextInt(randFact) + constFact[1]) % maxAngle);
        drawFractal(g1, mid3x, mid3y, n - 1, (angle + r.nextInt(randFact) + constFact[2]) % maxAngle);
        drawFractal(g1, mid4x, mid4y, n - 1, (angle + r.nextInt(randFact) + constFact[3]) % maxAngle);
         
        Color c = new Color(red[(r.nextInt() % 3) + n], green[(r.nextInt() % 3) + n], blue[(r.nextInt() % 3) + n]);
        g1.setColor(c);
        Line2D L1 = new Line2D.Double(x, y, xn1, yn1);
        g1.draw(L1);
        return;
    }
     
    public void paint(final Graphics g) {
        g1 = (Graphics2D) g;
        drawFractal(g1, startX, startY, numOfRecursions, startAngle);
    }
     
    public static void main(String args[]) {
        JFrame FF = new JFrame("Drawing a recursive tree");
        FF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FractalTree F = new FractalTree();
        FF.setBackground(Color.BLACK);
        FF.add(F);
        FF.pack();
        FF.setVisible(true);
        FF.setSize(1200, 1000);
    }
}