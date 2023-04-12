package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FoxSit {
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
    	// orange
    	drawHorizontalLine(17, 22, 5, orange);
    	drawHorizontalLine(14, 25, 6, orange);
    	fillRect(12,7,16,9, orange);
    	drawHorizontalLine(13, 26, 16, orange);
    	drawHorizontalLine(15, 24, 17, orange);
    	drawHorizontalLine(17, 22, 18, orange);
    	drawVerticalLine(7, 13, 11, orange);
    	drawVerticalLine(7, 13, 10, orange);
    	drawVerticalLine(7, 13, 28, orange);
    	drawVerticalLine(7, 13, 29, orange);
    	//black nose
    	drawHorizontalLine(18, 21, 18, Color.black);
    	drawHorizontalLine(19, 20, 19, Color.black);
    	//black outline
    	drawHorizontalLine(17, 22, 4, Color.black);
    	drawHorizontalLine(14, 16, 5, Color.black);
    	drawHorizontalLine(23, 24, 5, Color.black);
    	drawVerticalLine(8, 13, 9, Color.black);
    	drawVerticalLine(14, 16, 10, Color.black);
    	putPixel(11, 17, Color.black);
    	putPixel(12, 18, Color.black);
    	drawHorizontalLine(13, 14, 19, Color.black);
    	drawHorizontalLine(15, 16, 20, Color.black);
    	putPixel(17, 21, Color.black);
    	drawHorizontalLine(18, 21, 22, Color.black);
    	putPixel(22, 21, Color.black);
    	drawHorizontalLine(23, 24, 20, Color.black);
    	drawHorizontalLine(25, 26, 19, Color.black);
    	putPixel(27, 18, Color.black);
    	putPixel(28, 17, Color.black);
    	drawVerticalLine(14, 16, 29, Color.black);
    	drawVerticalLine(8, 13, 30, Color.black);
    	// white
    	drawVerticalLine(14, 15, 11, Color.white);
    	drawHorizontalLine(11, 12, 16, Color.white);
    	drawHorizontalLine(12, 15, 17, Color.white);
    	drawHorizontalLine(13, 16, 18, Color.white);
    	drawHorizontalLine(15, 18, 19, Color.white);
    	drawHorizontalLine(17, 22, 20, Color.white);
    	drawHorizontalLine(18, 21, 21, Color.white);
    	drawHorizontalLine(21, 24, 19, Color.white);
    	drawHorizontalLine(23, 26, 18, Color.white);
    	drawHorizontalLine(25, 27, 17, Color.white);
    	drawHorizontalLine(27, 28, 16, Color.white);
    	drawVerticalLine(14, 15, 28, Color.white);
    	
    	// EYES
    	// left
    	fillRect(15,11,3,4, Color.black);
    	putPixel(17, 12, Color.white);
    	putPixel(16, 13, Color.white);
    	// right
    	fillRect(22,11,3,4, Color.black);
    	putPixel(24, 12, Color.white);
    	putPixel(23, 13, Color.white);
    	
    	// EARS
    	// left
    	// white
    	fillRect(10,5,4,2, Color.white);
    	drawHorizontalLine(10, 12, 4, Color.white);
    	drawHorizontalLine(10, 11, 3, Color.white);
    	drawHorizontalLine(11, 13, 7, Color.white);
    	putPixel(14, 6, Color.white);
    	putPixel(12, 8, Color.white);
    	
    	// orange
    	drawVerticalLine(3, 7, 9, orange);
    	drawHorizontalLine(10, 11, 2, orange);
    	putPixel(12, 3, orange);
    	putPixel(13, 4, orange);
    	putPixel(14, 5, orange);
    	// black
    	drawVerticalLine(3, 7, 8, Color.black);
    	putPixel(9, 2, Color.black);
    	drawHorizontalLine(10, 11, 1, Color.black);
    	putPixel(12, 2, Color.black);
    	putPixel(13, 3, Color.black);
    	putPixel(14, 4, Color.black);
    	
    	putPixel(9, 5, Color.white);
    	
    	// right
    	// white
    	fillRect(26,5,4,2, Color.white);
    	drawHorizontalLine(27, 29, 4, Color.white);
    	drawHorizontalLine(28, 29, 3, Color.white);
    	drawHorizontalLine(26, 28, 7, Color.white);
    	putPixel(25, 6, Color.white);
    	putPixel(27, 8, Color.white);
    	// orange
    	drawVerticalLine(3, 7, 30, orange);
    	drawHorizontalLine(28, 29, 2, orange);
    	putPixel(27, 3, orange);
    	putPixel(26, 4, orange);
    	putPixel(25, 5, orange);
    	// black
    	drawVerticalLine(3, 7, 31, Color.black);
    	putPixel(30, 2, Color.black);
    	drawHorizontalLine(28, 29, 1, Color.black);
    	putPixel(27, 2, Color.black);
    	putPixel(26, 3, Color.black);
    	putPixel(25, 4, Color.black);
    	
    	putPixel(30, 5, Color.white);
    	
    	// TUMMY
    	// orange
    	fillRect(13,22,5,13, orange);
    	drawVerticalLine(25, 30, 12, orange);
    	fillRect(23,22,5,13, orange);
    	drawVerticalLine(29, 30, 22, orange);
    	// white
    	fillRect(18,23,4,11, Color.white);
    	drawVerticalLine(22, 28, 17, Color.white);
    	drawVerticalLine(21, 27, 16, Color.white);
    	drawVerticalLine(21, 25, 15, Color.white);
    	drawVerticalLine(21, 23, 14, Color.white);
    	drawVerticalLine(22, 28, 22, Color.white);
    	drawVerticalLine(21, 27, 23, Color.white);
    	drawVerticalLine(21, 25, 24, Color.white);
    	drawVerticalLine(21, 23, 25, Color.white);
    	// black
    	putPixel(14, 20, Color.black);
    	putPixel(13, 21, Color.black);
    	drawVerticalLine(22, 24, 12, Color.black);
    	drawVerticalLine(25, 30, 11, Color.black);
    	drawVerticalLine(31, 34, 12, Color.black);
    	drawVerticalLine(31, 34, 17, Color.black);
    	
    	putPixel(25, 20, Color.black);
    	putPixel(26, 21, Color.black);
    	drawVerticalLine(22, 24, 27, Color.black);
    	drawVerticalLine(25, 28, 28, Color.black);
    	drawHorizontalLine(13, 16, 35, Color.black);
    	drawVerticalLine(31, 32, 22, Color.black);
    	
    	drawHorizontalLine(18, 20, 34, Color.black);
    	
    	// TAIL
    	// orange
      	putPixel(29, 27, orange); 
      	drawHorizontalLine(29, 31, 28, orange);
      	fillRect(28,29,5,7, orange);
      	drawVerticalLine(30, 33, 33, orange);
    	// black
    	putPixel(29, 26, Color.black);
    	drawHorizontalLine(30, 31, 27, Color.black);
    	putPixel(32, 28, Color.black);
    	putPixel(33, 29, Color.black);
      	drawVerticalLine(30, 33, 34, Color.black);
      	putPixel(33, 34, Color.black);
      	putPixel(32, 35, Color.black);
      	drawHorizontalLine(30, 31, 36, Color.black);
    	drawHorizontalLine(28, 29, 37, Color.black);
      	drawHorizontalLine(24, 27, 38, Color.black);
      	putPixel(27, 29, Color.black);
      	putPixel(26, 30, Color.black);
      	drawHorizontalLine(24, 25, 31, Color.black);
      	putPixel(23, 32, Color.black);
      	putPixel(22, 33, Color.black);
      	drawVerticalLine(34, 35, 21, Color.black);
      	putPixel(22, 36, Color.black);
      	putPixel(23, 37, Color.black);
      	// white
      	putPixel(23, 33, Color.white);
      	drawHorizontalLine(22, 25, 34, Color.white);
      	drawHorizontalLine(22, 27, 35, Color.white);
      	drawHorizontalLine(23, 29, 36, Color.white);
      	drawHorizontalLine(24, 27, 37, Color.white);
      	
      	// some black
      	putPixel(14, 7, Color.black);
      	putPixel(13, 8, Color.black);
      	putPixel(12, 9, Color.black);
      	putPixel(11, 8, Color.black);
      	
      	putPixel(25, 7, Color.black);
      	putPixel(26, 8, Color.black);
      	putPixel(27, 9, Color.black);
      	putPixel(28, 8, Color.black);

        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("foxSit.png"));
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