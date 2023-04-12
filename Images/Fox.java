package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Fox {
    static int width = 1600;
    static int height = 1600;
    static Color orange = new Color(255,102,0);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.cyan);   
    	// HEAD
    	// black outline
    	drawVerticalLine(10, 13, 1, Color.black);
        drawHorizontalLine(2, 3, 9, Color.black);
        drawVerticalLine(14, 17, 2, Color.black);
        drawVerticalLine(18, 20, 3, Color.black);
        drawVerticalLine(10, 11, 4, Color.black);
        putPixel(4,19, Color.black);
        drawVerticalLine(21, 22, 4, Color.black);
        drawHorizontalLine(5, 6, 10, Color.black);
        putPixel(5,23, Color.black);
        drawHorizontalLine(5, 6, 12, Color.black);
        putPixel(6,16, Color.black);
        putPixel(5,20, Color.black);
        drawVerticalLine(21, 25, 6, Color.black);
        drawHorizontalLine(7, 8, 11, Color.black);
        drawVerticalLine(13, 15, 7, Color.black);
        putPixel(7,26, Color.black);
        putPixel(8,27, Color.black);
        drawHorizontalLine(9, 19, 28, Color.black);
        drawHorizontalLine(9, 11, 12, Color.black);
        drawHorizontalLine(12, 14, 11, Color.black);
        drawVerticalLine(8, 10, 15, Color.black);
        putPixel(16, 7, Color.black);
        drawVerticalLine(8, 10, 17, Color.black);
        putPixel(18, 11, Color.black);
        putPixel(19, 12, Color.black);
        putPixel(17, 6, Color.black);
        putPixel(18, 7, Color.black);
        drawHorizontalLine(18, 19, 5, Color.black);
        drawVerticalLine(4, 5, 22, Color.black);
        drawVerticalLine(6, 12, 23, Color.black);
        drawHorizontalLine(19, 20, 4, Color.black);
        drawHorizontalLine(21, 22, 3, Color.black);
        drawVerticalLine(13, 14, 24, Color.black);
        drawVerticalLine(13, 14, 22, Color.black);
        drawVerticalLine(15, 16, 23, Color.black);
        // black-eyes
        drawHorizontalLine(10, 12, 24, Color.black);
        drawHorizontalLine(12, 13, 25, Color.black);
        drawVerticalLine(20, 22, 20, Color.black);
        drawVerticalLine(19, 20, 21, Color.black);
        //black-nose
       
        putPixel(19, 26, Color.black);
        putPixel(20, 27, Color.black);
        putPixel(21, 26, Color.black); 
        // orange
        drawVerticalLine(10, 13, 2, orange);
        drawVerticalLine(10, 11, 3, orange);
        drawVerticalLine(13, 14, 3, orange);
        drawVerticalLine(16, 17, 3, orange);
        drawVerticalLine(17, 18, 4, orange);
        putPixel(4,20, orange);
        drawHorizontalLine(5, 6, 11, orange);
        drawVerticalLine(18, 19, 5, orange);
        drawVerticalLine(21, 22, 5, orange);
        drawVerticalLine(17, 20, 6, orange);
        drawHorizontalLine(7, 8, 12, orange);
        drawVerticalLine(16, 22, 7, orange);
        fillRect(8,13,12,11, orange);
        putPixel(9,24, orange);
        drawHorizontalLine(13, 19, 24, orange);
        drawHorizontalLine(14, 19, 25, orange);
        drawHorizontalLine(15, 17, 11, orange);
        drawVerticalLine(8, 10, 16, orange);
        putPixel(17, 7, orange);
        drawVerticalLine(6, 12, 22, orange);
        drawHorizontalLine(18, 21, 6, orange);
        drawHorizontalLine(20, 21, 5, orange);
        putPixel(21, 4, orange);
        drawVerticalLine(13, 14, 23, orange);
        putPixel(23, 17, orange);
        drawVerticalLine(12, 19, 20, orange);
        putPixel(20, 23, orange);
        drawVerticalLine(15, 18, 22, orange);
        // white-mouth
        drawVerticalLine(23, 25, 7, Color.white);
        drawVerticalLine(24, 26, 8, Color.white);
        drawHorizontalLine(9, 11, 25, Color.white);
        drawHorizontalLine(9, 18, 26, Color.white);
        drawHorizontalLine(9, 19, 27, Color.white);
        drawVerticalLine(24, 26, 20, Color.white);
        drawVerticalLine(21, 25, 21, Color.white);
        drawVerticalLine(19, 23, 22, Color.white);
        drawVerticalLine(18, 22, 23, Color.white);
        drawVerticalLine(17, 21, 24, Color.white);
        // white-left ear
        putPixel(22, 8, Color.white);
        drawHorizontalLine(3, 4, 12, Color.white);
        drawHorizontalLine(4, 6, 13, Color.white);
        drawHorizontalLine(4, 6, 14, Color.white);
        drawHorizontalLine(3, 6, 15, Color.white);
        drawHorizontalLine(4, 5, 16, Color.white);
        putPixel(5, 17, Color.white);
        // white-right ear
        drawVerticalLine(8, 10, 18, Color.white);
        drawVerticalLine(7, 11, 19, Color.white);
        drawVerticalLine(6, 11, 20, Color.white);
        drawVerticalLine(7, 9, 21, Color.white);
        
        // TUMMY-ARMS
        // black-outline
        drawVerticalLine(28, 31, 12, Color.black);
        drawHorizontalLine(13, 15, 32, Color.black);
        putPixel(19,32, Color.black);
        drawHorizontalLine(16, 18, 33, Color.black);
        drawVerticalLine(30, 31, 16, Color.black);
        putPixel(17,29, Color.black);
        putPixel(20,31, Color.black);
        putPixel(21,30, Color.black);
        // orange
        drawVerticalLine(29, 31, 13, orange);
        drawVerticalLine(30, 31, 14, orange);
        putPixel(15,31, orange);
        drawHorizontalLine(16, 18, 32, orange);
        drawHorizontalLine(17, 19, 31, orange);
        drawHorizontalLine(17, 20, 30, orange);
        drawHorizontalLine(18, 21, 29, orange);
        drawHorizontalLine(20, 21, 28, orange);
        putPixel(21, 27, orange);
        // white
        drawHorizontalLine(14, 16, 29, Color.white);
        putPixel(15, 30, Color.white);
        
        // BACK 
        // black - outline
        drawHorizontalLine(33, 34, 14, Color.black);
        drawHorizontalLine(30, 31, 12, Color.black);
        putPixel(32, 13, Color.black);
        drawVerticalLine(17, 21, 25, Color.black);
        putPixel(24, 16, Color.black);
        putPixel(35, 15, Color.black);
        // orange
        drawHorizontalLine(24, 29, 12, orange);
        drawHorizontalLine(25, 31, 13, orange);
        drawHorizontalLine(25, 32, 14, orange);
        drawHorizontalLine(24, 34, 15, orange);
        drawHorizontalLine(25, 35, 16, orange);
        drawHorizontalLine(26, 35, 17, orange);
        drawHorizontalLine(26, 30, 18, orange);
        drawHorizontalLine(26, 28, 19, orange);
        drawHorizontalLine(26, 27, 20, orange);
        
        
        // TAIL
        // black - outline
        drawHorizontalLine(26, 27, 21, Color.black);
        drawHorizontalLine(31, 32, 18, Color.black);
        drawHorizontalLine(29, 30, 19, Color.black);
        putPixel(28, 20, Color.black);
        putPixel(24, 22, Color.black);
        putPixel(23, 23, Color.black);
        drawVerticalLine(24, 33, 22, Color.black);
        drawVerticalLine(34, 35, 23, Color.black);
        drawHorizontalLine(24, 25, 35, Color.black);
        drawHorizontalLine(26, 27, 34, Color.black);
        drawHorizontalLine(28, 30, 33, Color.black);
        drawHorizontalLine(31, 32, 32, Color.black);
        putPixel(33, 31, Color.black);
        putPixel(34, 30, Color.black);
        putPixel(35, 29, Color.black);
        putPixel(36, 28, Color.black);
        drawVerticalLine(25, 27, 37, Color.black);
        drawVerticalLine(22, 24, 38, Color.black);
        drawVerticalLine(18, 21, 37, Color.black);
        drawVerticalLine(16, 17, 36, Color.black); 
        drawHorizontalLine(24, 29, 11, Color.black);
        // orange
        drawVerticalLine(10, 18, 21, orange);
        drawHorizontalLine(33, 36, 18, orange);
        drawHorizontalLine(31, 36, 19, orange);
        drawHorizontalLine(29, 36, 20, orange);
        drawHorizontalLine(28, 36, 21, orange);
        drawHorizontalLine(25, 37, 22, orange);
        drawHorizontalLine(25, 37, 23, orange);
        putPixel(23, 24, orange);
        putPixel(26, 25, orange);
        putPixel(27, 25, orange);
        putPixel(25, 26, orange);
        putPixel(31, 29, orange);
        putPixel(31, 28, orange);
        drawVerticalLine(25, 26, 29, orange);
        drawHorizontalLine(25, 37, 24, orange);
        drawHorizontalLine(31, 36, 25, orange);
        drawHorizontalLine(31, 36, 26, orange);
        drawHorizontalLine(32, 36, 27, orange);
        drawHorizontalLine(33, 35, 28, orange);
        drawHorizontalLine(33, 34, 29, orange);
        drawHorizontalLine(32, 33, 30, orange);
        drawVerticalLine(23, 25, 24, orange);
        drawHorizontalLine(12, 18, 12, orange);
        // white
        fillRect(23,27, 8,6, Color.white);
        drawHorizontalLine(23, 27, 33, Color.white);
        drawHorizontalLine(24, 25, 34, Color.white);
        drawHorizontalLine(23, 24, 26, Color.white);
        drawHorizontalLine(26, 28, 26, Color.white);
        drawHorizontalLine(31, 32, 31, Color.white);
        drawVerticalLine(28, 29, 32, Color.white);
        drawVerticalLine(25, 26, 30, Color.white);
        putPixel(23, 25, Color.white);
        putPixel(25, 25, Color.white);
        putPixel(28, 25, Color.white);
        putPixel(31, 27, Color.white);
        putPixel(31, 30, Color.white);
        
        putPixel(18, 26, Color.black);
        putPixel(19, 25, Color.black);
        
        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("fox.png"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}