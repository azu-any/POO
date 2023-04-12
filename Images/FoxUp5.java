package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FoxUp5 {
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
    	drawVerticalLine(7, 10, 3, Color.black);
        drawHorizontalLine(6, 7, 9, Color.black);
        drawHorizontalLine(3, 4, 6, Color.black);
        drawVerticalLine(10, 14, 3, Color.black);
        drawVerticalLine(15, 17, 3, Color.black);
        putPixel(4, 8, Color.black);
        putPixel(4, 16, Color.black);
        drawVerticalLine(18, 19, 4, Color.black);
        drawHorizontalLine(5, 6, 7, Color.black);
        putPixel(5,20, Color.black);
        drawHorizontalLine(5, 6, 12, Color.black);
        
        putPixel(5,17, Color.black);
        drawVerticalLine(18, 21, 6, Color.black);
        drawHorizontalLine(7, 8, 8, Color.black);
        drawVerticalLine(10, 11, 8, Color.black);
        putPixel(7, 22, Color.black);
        putPixel(8, 23, Color.black);
        putPixel(9, 24, Color.black);
        drawHorizontalLine(10, 18, 25, Color.black);
        drawHorizontalLine(9, 15, 9, Color.black);
        //drawHorizontalLine(12, 14, 9, Color.black);
        drawVerticalLine(6, 8, 16, Color.black);
        putPixel(17, 5, Color.black);
        drawVerticalLine(6, 8, 18, Color.black);
        putPixel(18, 4, Color.black);
        putPixel(19, 5, Color.black);
        drawHorizontalLine(19, 20, 3, Color.black);
        drawVerticalLine(2, 3, 23, Color.black);
        drawVerticalLine(4, 9, 24, Color.black);
        drawHorizontalLine(20, 21, 2, Color.black);
        drawHorizontalLine(21, 22, 1, Color.black);
        drawVerticalLine(10, 11, 24, Color.black);
        drawVerticalLine(10, 11, 24, Color.black);
        drawVerticalLine(12, 13, 24, Color.black);
        
        // orange
        drawVerticalLine(12, 13, 24, orange);
        drawHorizontalLine(16, 18, 9, orange);
        drawVerticalLine(6, 15, 22, orange);
        drawVerticalLine(7, 9, 4, orange);
        putPixel(4, 7, orange);
        drawVerticalLine(10, 11, 4, orange);
        drawVerticalLine(13, 15, 4, orange);
        drawVerticalLine(14, 15, 5, orange);
        putPixel(5,17, orange); 
        drawHorizontalLine(5, 6, 8, orange);
        drawHorizontalLine(8, 8, 9, orange);
        //drawVerticalLine(17, 17, 5, orange);
        putPixel(4, 17, orange);
        putPixel(5, 16, orange);
        putPixel(5, 17, Color.black);
        drawVerticalLine(18, 19, 5, orange);
        drawVerticalLine(14, 17, 6, orange);
        drawVerticalLine(13, 19, 7, orange);
        fillRect(8,11,12,11, orange);
        putPixel(9, 21, orange);
        putPixel(20, 19, orange);
        
        //drawHorizontalLine(13, 16, 20, orange); //
        drawHorizontalLine(8, 19, 21, orange); //
        //drawHorizontalLine(15, 17, 8, orange);
        drawHorizontalLine(9, 19, 10, orange);
        putPixel(8, 10, orange);
        drawVerticalLine(6, 8, 17, orange);
        putPixel(18, 5, orange);
        drawHorizontalLine(19, 22, 4, orange);
        drawHorizontalLine(21, 22, 3, orange);
        putPixel(22, 2, orange);
        drawVerticalLine(4, 13, 23, orange);
        putPixel(23, 14, orange);
        drawVerticalLine(9, 16, 20, orange);
        putPixel(20, 20, orange);
        drawVerticalLine(10, 17, 21, orange);
        // white-mouth
        drawVerticalLine(20, 21, 7, Color.white);
        drawVerticalLine(21, 22, 8, Color.white);
        drawHorizontalLine(9, 18, 22, Color.white);
        drawHorizontalLine(9, 19, 23, Color.white);
        drawHorizontalLine(10, 19, 24, Color.white);
        drawVerticalLine(21, 23, 20, Color.white);
        drawVerticalLine(18, 22, 21, Color.white);
        drawVerticalLine(16, 21, 22, Color.white);
        drawVerticalLine(15, 20, 23, Color.white);
        drawVerticalLine(14, 19, 24, Color.white);
        // mouth black
        putPixel(22, 22, Color.black);
        putPixel(23, 21, Color.black);
        putPixel(24, 20, Color.black);
        putPixel(24, 19, Color.black);
        drawVerticalLine(14, 18, 25, Color.black);
        putPixel(24, 13, Color.black);
        // white-left ear
        
        drawHorizontalLine(4, 5, 9, Color.white);
        drawHorizontalLine(5, 7, 10, Color.white);
        drawHorizontalLine(5, 7, 11, Color.white);
        drawHorizontalLine(4, 8, 12, Color.white);
        drawHorizontalLine(5, 7, 13, Color.white);
        putPixel(6, 14, Color.white);
        // white-right ear
        drawVerticalLine(6, 8, 19, Color.white);
        drawVerticalLine(5, 9, 20, Color.white);
        drawVerticalLine(4, 9, 21, Color.white);
        drawVerticalLine(5, 7, 22, Color.white);
        putPixel(23, 6, Color.white);
        // black-eyes
        drawHorizontalLine(11, 14, 21, Color.black);
        drawHorizontalLine(12, 13, 20, Color.black);
        //drawHorizontalLine(12, 13, 21, Color.black);
        drawVerticalLine(16, 18, 20, Color.black);
        drawVerticalLine(16, 17, 21, Color.black);
        //drawVerticalLine(15, 16, 21, Color.black);
        //black-nose
        putPixel(20, 22, Color.black);
        putPixel(20, 24, Color.black);
        putPixel(21, 23, Color.black);
        putPixel(19, 22, Color.black);
        putPixel(20, 21, Color.black);
        // black
        putPixel(5,8, Color.black); 
        putPixel(9,12, Color.black); 
        putPixel(7,13, Color.black); 
        putPixel(19, 9, Color.black);
        putPixel(20, 10, Color.black);
        drawVerticalLine(10, 11, 8, Color.black);
        
        
        // TUMMY-ARMS
        
        // white
        fillRect(14, 26, 7, 4, Color.white);
        drawHorizontalLine(19, 21, 25, orange);
        // orange
        drawHorizontalLine(24, 25, 21, orange);
        drawHorizontalLine(23, 24, 22, orange);
        drawHorizontalLine(21, 22, 24, orange);
        drawHorizontalLine(22, 23, 23, orange);
        fillRect(13, 30, 3, 3, orange);
        fillRect(14, 27, 3, 3, orange);
        fillRect(20, 25, 4, 5, orange);
        fillRect(19, 30, 3, 4, orange);
        //drawHorizontalLine(20, 21, 28, orange);
        putPixel(15, 26, orange);
        // black-outline
        putPixel(19, 25, Color.black);
        putPixel(14, 26, Color.black);
        drawVerticalLine(27, 29, 13, Color.black);
        drawVerticalLine(30, 32, 12, Color.black);
        drawHorizontalLine(13, 15, 33, Color.black);
        drawVerticalLine(28, 29, 17, Color.black);
        drawVerticalLine(30, 32, 16, Color.black);
        //putPixel(17, 30, Color.black);
        drawHorizontalLine(19, 21, 34, Color.black);
        drawVerticalLine(30, 33, 18, Color.black);
        drawVerticalLine(27, 29, 19, Color.black);
        drawVerticalLine(25, 26, 20, Color.black);
        drawVerticalLine(30, 33, 22, Color.black);
        //drawVerticalLine(27, 29, 22, Color.black);
        
        
        // BACK 
        // black - outline
        drawHorizontalLine(24, 26, 10, Color.black);
        drawHorizontalLine(27, 29, 11, Color.black);
        drawHorizontalLine(33, 34, 14, Color.black);
        drawHorizontalLine(30, 31, 12, Color.black);
        putPixel(32, 13, Color.black);
        putPixel(35, 15, Color.black);
        // orange
        drawHorizontalLine(25, 26, 11, orange);
        drawHorizontalLine(25, 29, 12, orange);
        drawHorizontalLine(25, 31, 13, orange);
        drawHorizontalLine(26, 32, 14, orange);
        drawHorizontalLine(26, 34, 15, orange);
        drawHorizontalLine(26, 35, 16, orange);
        drawHorizontalLine(26, 35, 17, orange);
        drawHorizontalLine(26, 30, 18, orange);
        drawHorizontalLine(25, 28, 19, orange);
        drawHorizontalLine(25, 27, 20, orange);
        
        // TAIL
        // black - outline
        drawHorizontalLine(26, 27, 21, Color.black);
        drawHorizontalLine(31, 32, 18, Color.black);
        drawHorizontalLine(29, 30, 19, Color.black);
        putPixel(28, 20, Color.black);
        //putPixel(24, 22, Color.black);
        //putPixel(24, 23, Color.black);
        //drawVerticalLine(24, 33, 22, Color.black);
        //drawVerticalLine(34, 35, 23, Color.black);
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
        
     // white
        fillRect(23,27, 8,6, Color.white);
        drawHorizontalLine(23, 27, 33, Color.white);
        drawHorizontalLine(24, 25, 34, Color.white);
        drawHorizontalLine(23, 24, 26, Color.white);
        drawHorizontalLine(26, 28, 26, Color.white);
        drawHorizontalLine(31, 32, 31, Color.white);
        drawVerticalLine(28, 29, 32, Color.white);
        drawVerticalLine(25, 26, 30, Color.white);
        drawHorizontalLine(23, 28, 25, Color.white);
        drawHorizontalLine(23, 30, 26, Color.white);
        putPixel(31, 27, Color.white);
        putPixel(31, 30, Color.white);
        putPixel(32, 30, Color.white);
        putPixel(33, 29, Color.white);
        
        // orange
        drawHorizontalLine(33, 36, 18, orange);
        drawHorizontalLine(31, 36, 19, orange);
        drawHorizontalLine(29, 36, 20, orange);
        drawHorizontalLine(28, 36, 21, orange);
        drawHorizontalLine(25, 37, 22, orange);
        drawHorizontalLine(25, 37, 23, orange);
        //putPixel(25, 25, orange);
        putPixel(26, 25, orange);
        putPixel(27, 25, orange);
        putPixel(25, 26, orange);
        putPixel(31, 29, orange);
        putPixel(31, 28, orange);
        putPixel(29, 25, orange);
        putPixel(30, 26, orange);
        drawHorizontalLine(25, 37, 24, orange);
        drawHorizontalLine(31, 36, 25, orange);
        drawHorizontalLine(31, 36, 26, orange);
        drawHorizontalLine(32, 36, 27, orange);
        drawHorizontalLine(33, 35, 28, orange);
        //drawHorizontalLine(33, 34, 29, orange);
        putPixel(32, 29, orange);
        putPixel(34, 29, orange);
        putPixel(33, 30, orange);
        drawVerticalLine(23, 24, 24, orange);
        
        // some black
        drawVerticalLine(24, 34, 23, Color.black);
        putPixel(25, 22, Color.black);
        putPixel(24, 23, Color.black);
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("foxUp5.png"));
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
    
    /*private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }*/
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