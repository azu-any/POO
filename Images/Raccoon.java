package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Raccoon {
    static int width = 1600;
    static int height = 1600;
    static Color gray = new Color(191,191,191);
    static Color gray_b = new Color(76,76,76);
    static Color gray_w = new Color(224,224,224);
    
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
        putPixel(4,10, Color.black);
        putPixel(4,19, Color.black);
        drawVerticalLine(21, 22, 4, Color.black);
        drawHorizontalLine(4, 6, 10, Color.black);
        putPixel(5,23, Color.black);       
        putPixel(5,20, Color.black);
        drawVerticalLine(21, 25, 6, Color.black);
        drawHorizontalLine(7, 8, 11, Color.black);
        putPixel(7,26, Color.black);
        putPixel(8,27, Color.black);
        
        drawHorizontalLine(9, 10, 28, Color.black);
        drawHorizontalLine(11, 18, 29, Color.black);
        putPixel(19,28, Color.black);
        
        drawHorizontalLine(9, 11, 12, Color.black);
        drawHorizontalLine(12, 14, 11, Color.black);
        drawVerticalLine(8, 10, 15, Color.black);
        putPixel(16, 7, Color.black);
        putPixel(17, 6, Color.black);
        drawHorizontalLine(18, 19, 5, Color.black);
        drawVerticalLine(4, 5, 22, Color.black);
        drawVerticalLine(6, 12, 23, Color.black);
        drawHorizontalLine(19, 20, 4, Color.black);
        drawHorizontalLine(21, 22, 3, Color.black);
        drawVerticalLine(13, 14, 24, Color.black);
        drawVerticalLine(13, 14, 22, Color.black);
        drawVerticalLine(15, 16, 23, Color.black);
      
        // gray
        drawVerticalLine(10, 13, 2, gray);
        drawVerticalLine(10, 11, 3, gray);
        drawVerticalLine(13, 14, 3, gray);
        drawVerticalLine(16, 17, 3, gray);
        drawVerticalLine(17, 18, 4, gray);
        putPixel(4,20, gray);
        drawHorizontalLine(5, 6, 11, gray);
        drawVerticalLine(18, 19, 5, gray);
        drawVerticalLine(21, 22, 5, gray);
        drawVerticalLine(17, 20, 6, gray);
        drawHorizontalLine(7, 8, 12, gray);
        drawVerticalLine(16, 22, 7, gray);
        fillRect(8,13,12,11, gray);
        putPixel(9,24, gray);
        drawHorizontalLine(13, 19, 24, gray);
        drawHorizontalLine(14, 19, 25, gray);
        drawHorizontalLine(15, 17, 11, gray);
        drawVerticalLine(8, 10, 16, gray);
        putPixel(17, 7, gray);
        drawVerticalLine(6, 12, 22, gray);
        drawHorizontalLine(18, 21, 6, gray);
        drawHorizontalLine(20, 21, 5, gray);
        putPixel(21, 4, gray);
        drawVerticalLine(13, 14, 23, gray);
        putPixel(23, 17, gray);
        drawVerticalLine(12, 19, 20, gray);
        drawVerticalLine(15, 18, 22, gray);
        drawVerticalLine(10, 17, 21, gray);
        
        // gray_b
        drawHorizontalLine(10, 14, 22, gray_b);
        fillRect(9, 23, 7, 5, gray_b);
        drawVerticalLine(24, 26, 8, gray_b);
        putPixel(7, 25, gray_b);
        putPixel(16, 27, gray_b);
        drawHorizontalLine(20, 23, 18, gray_b);
        fillRect(19, 19, 4, 5, gray_b);
        putPixel(21, 24, gray_b);
        drawVerticalLine(19, 22, 23, gray_b);
        drawVerticalLine(19, 21, 24, gray_b);
        drawHorizontalLine(11, 17, 28, gray_b);
        // white
        drawVerticalLine(23, 24, 7, Color.white);
        drawVerticalLine(22, 23, 8, Color.white);
        drawVerticalLine(21, 22, 9, Color.white);
        drawHorizontalLine(10, 14, 21, Color.white);
        drawHorizontalLine(20, 23, 17, Color.white);
        drawVerticalLine(17, 18, 24, Color.white);
        drawVerticalLine(17, 19, 19, Color.white);
        putPixel(18, 28, Color.white);
        
        // black-eyes
        drawHorizontalLine(10, 12, 24, Color.black);
        drawHorizontalLine(12, 13, 25, Color.black);
        drawVerticalLine(21, 22, 20, Color.black);
        drawVerticalLine(19, 21, 21, Color.black);
        
        //nose
        putPixel(19, 26, Color.black);
        putPixel(20, 27, Color.black);
        putPixel(21, 26, Color.black); 
        drawHorizontalLine(17, 19, 27, Color.white);
        drawHorizontalLine(16, 17, 26, Color.white);
        drawHorizontalLine(17, 18, 25, Color.white);
        drawHorizontalLine(18, 20, 24, Color.white);
        drawHorizontalLine(20, 21, 25, Color.white);
        putPixel(20, 26, Color.white); 
        
        // gray_b-left ear
        putPixel(22, 8, gray_b);
        drawHorizontalLine(3, 4, 12, gray_b);
        drawHorizontalLine(4, 6, 13, gray_b);
        drawHorizontalLine(4, 6, 14, gray_b);
        drawHorizontalLine(3, 6, 15, gray_b);
        drawHorizontalLine(4, 5, 16, gray_b);
        putPixel(5, 17, gray_b);
        putPixel(6,16, gray_b);
        drawVerticalLine(13, 15, 7, gray_b);
        drawHorizontalLine(5, 6, 12, gray_b);
        putPixel(4,11, gray_b);
        // gray_b-right ear
        drawVerticalLine(8, 10, 18, gray_b);
        drawVerticalLine(7, 11, 19, gray_b);
        drawVerticalLine(6, 11, 20, gray_b);
        drawVerticalLine(7, 9, 21, gray_b);
        drawVerticalLine(8, 10, 17, gray_b);
        putPixel(18, 11, gray_b);
        putPixel(19, 12, gray_b);
        putPixel(18, 7, gray_b);
        
        
        // TUMMY-ARMS
        // black-outline
        drawVerticalLine(30, 31, 12, Color.black);
        drawHorizontalLine(13, 15, 32, Color.black);
        putPixel(19,32, Color.black);
        drawHorizontalLine(16, 18, 33, Color.black);
        drawVerticalLine(30, 31, 16, Color.black);
        putPixel(17,29, Color.black);
        putPixel(20,31, Color.black);
        putPixel(21,30, Color.black);
        // gray
        drawVerticalLine(30, 31, 13, gray);
        drawVerticalLine(30, 31, 14, gray);
        putPixel(15,31, gray);
        drawHorizontalLine(16, 18, 32, gray);
        drawHorizontalLine(17, 19, 31, gray);
        drawHorizontalLine(17, 20, 30, gray);
        drawHorizontalLine(19, 21, 29, gray);
        drawHorizontalLine(20, 21, 28, gray);
        putPixel(21, 27, gray);
        // white
        //drawHorizontalLine(14, 16, 29, gray_w);
        putPixel(15, 30, gray_w);
        
        // BACK 
        // black - outline
        drawHorizontalLine(33, 34, 14, Color.black);
        drawHorizontalLine(30, 31, 12, Color.black);
        putPixel(32, 13, Color.black);
        drawVerticalLine(17, 21, 25, Color.black);
        putPixel(24, 16, Color.black);
        putPixel(35, 15, Color.black);
        // gray
        drawHorizontalLine(24, 29, 12, gray);
        drawHorizontalLine(25, 31, 13, gray);
        drawHorizontalLine(25, 32, 14, gray);
        drawHorizontalLine(24, 34, 15, gray);
        drawHorizontalLine(25, 35, 16, gray);
        drawHorizontalLine(26, 35, 17, gray);
        drawHorizontalLine(26, 30, 18, gray);
        drawHorizontalLine(26, 28, 19, gray);
        drawHorizontalLine(26, 27, 20, gray);
        
        
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
        // gray
        drawHorizontalLine(33, 36, 18, gray);
        drawHorizontalLine(31, 36, 19, gray);
        drawHorizontalLine(29, 36, 20, gray);
        drawHorizontalLine(28, 36, 21, gray);
        drawHorizontalLine(25, 37, 22, gray);
        drawHorizontalLine(24, 37, 23, gray);
        drawHorizontalLine(23, 37, 24, gray);
        drawHorizontalLine(31, 36, 25, gray);
        drawHorizontalLine(31, 36, 26, gray);
        drawHorizontalLine(31, 36, 27, gray);
        drawHorizontalLine(31, 35, 28, gray);
        drawHorizontalLine(31, 34, 29, gray);
        drawHorizontalLine(31, 33, 30, gray);
        drawHorizontalLine(31, 32, 31, gray);
        drawHorizontalLine(23, 27, 33, gray);
        
        drawHorizontalLine(12, 18, 12, gray);
        fillRect(23,25, 8,8, gray);
        // gray_b
        putPixel(23, 30, gray_b);
        drawHorizontalLine(23, 24, 31, gray_b);
        drawHorizontalLine(23, 25, 32, gray_b);
        drawHorizontalLine(23, 26, 33, gray_b);
        drawHorizontalLine(24, 25, 34, gray_b);
       
        putPixel(23, 24, gray_b);
        drawHorizontalLine(23, 24, 25, gray_b);
        drawHorizontalLine(23, 25, 26, gray_b);
        drawHorizontalLine(24, 26, 27, gray_b);
        drawHorizontalLine(25, 27, 28, gray_b);
        drawHorizontalLine(26, 28, 29, gray_b);
        drawHorizontalLine(27, 29, 30, gray_b);
        drawHorizontalLine(28, 30, 31, gray_b);
        drawHorizontalLine(29, 30, 32, gray_b);
        
        drawHorizontalLine(25, 27, 22, gray_b);
        drawHorizontalLine(26, 28, 23, gray_b);
        drawHorizontalLine(27, 29, 24, gray_b);
        drawHorizontalLine(28, 30, 25, gray_b);
        drawHorizontalLine(29, 31, 26, gray_b);
        drawHorizontalLine(30, 32, 27, gray_b);
        drawHorizontalLine(31, 33, 28, gray_b);
        drawHorizontalLine(32, 34, 29, gray_b);
        putPixel(33, 30, gray_b);
        
        drawHorizontalLine(29, 31, 20, gray_b);
        drawHorizontalLine(30, 32, 21, gray_b);
        drawHorizontalLine(31, 33, 22, gray_b);
        drawHorizontalLine(32, 34, 23, gray_b);
        drawHorizontalLine(33, 35, 24, gray_b);
        drawHorizontalLine(34, 36, 25, gray_b);
        drawHorizontalLine(35, 36, 26, gray_b);
        putPixel(36, 27, gray_b);
        
        drawHorizontalLine(33, 35, 18, gray_b);
        drawHorizontalLine(34, 36, 19, gray_b);
        drawHorizontalLine(35, 36, 20, gray_b);
        putPixel(36, 21, gray_b);
        putPixel(37, 22, gray_b);
   
        putPixel(18, 26, Color.black);
        putPixel(19, 25, Color.black);
        
        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("Raccoon.png"));
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