package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FoxUp2 {
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
    	drawVerticalLine(8, 11, 1, Color.black);
        drawHorizontalLine(5, 6, 10, Color.black);
        drawHorizontalLine(2, 3, 7, Color.black);
        drawVerticalLine(10, 14, 2, Color.black);
        drawVerticalLine(15, 17, 3, Color.black);
        drawVerticalLine(8, 9, 4, Color.black);
        putPixel(4, 16, Color.black);
        drawVerticalLine(18, 19, 4, Color.black);
        drawHorizontalLine(5, 6, 8, Color.black);
        putPixel(5,20, Color.black);
        drawHorizontalLine(5, 6, 12, Color.black);
        putPixel(6,13, Color.black);
        putPixel(5,17, Color.black);
        drawVerticalLine(18, 22, 6, Color.black);
        drawHorizontalLine(7, 8, 9, Color.black);
        drawVerticalLine(10, 12, 7, Color.black);
        putPixel(7,23, Color.black);
        putPixel(8,24, Color.black);
        drawHorizontalLine(9, 19, 25, Color.black);
        drawHorizontalLine(9, 11, 10, Color.black);
        drawHorizontalLine(12, 14, 9, Color.black);
        drawVerticalLine(6, 8, 15, Color.black);
        putPixel(16, 5, Color.black);
        drawVerticalLine(6, 8, 17, Color.black);
        putPixel(18, 8, Color.black);
        putPixel(19, 9, Color.black);
        putPixel(17, 4, Color.black);
        putPixel(18, 5, Color.black);
        drawHorizontalLine(18, 19, 3, Color.black);
        drawVerticalLine(2, 3, 22, Color.black);
        drawVerticalLine(4, 9, 23, Color.black);
        drawHorizontalLine(19, 20, 2, Color.black);
        drawHorizontalLine(21, 22, 1, Color.black);
        drawVerticalLine(10, 11, 24, Color.black);
        drawVerticalLine(10, 11, 22, Color.black);
        drawVerticalLine(12, 13, 23, Color.black);
        
        // orange
        drawHorizontalLine(15, 18, 9, orange);
        drawVerticalLine(6, 15, 21, orange);
        drawVerticalLine(8, 10, 2, orange);
        drawVerticalLine(8, 9, 3, orange);
        drawVerticalLine(10, 11, 3, orange);
        drawVerticalLine(13, 14, 3, orange);
        drawVerticalLine(14, 15, 4, orange);
        putPixel(4,17, orange); 
        drawHorizontalLine(5, 6, 9, orange);
        drawVerticalLine(15, 16, 5, orange);
        drawVerticalLine(18, 19, 5, orange);
        drawVerticalLine(14, 17, 6, orange);
        drawVerticalLine(13, 19, 7, orange);
        fillRect(8,11,12,11, orange);
        putPixel(9, 21, orange);
        putPixel(20, 19, orange);
        
        //drawHorizontalLine(13, 16, 20, orange); //
        drawHorizontalLine(8, 19, 21, orange); //
        //drawHorizontalLine(15, 17, 8, orange);
        drawHorizontalLine(12, 19, 10, orange);
        putPixel(8, 10, orange);
        drawVerticalLine(6, 8, 16, orange);
        putPixel(17, 5, orange);
        drawVerticalLine(4, 9, 22, orange);
        drawHorizontalLine(18, 21, 4, orange);
        drawHorizontalLine(20, 21, 3, orange);
        putPixel(21, 2, orange);
        drawVerticalLine(10, 11, 23, orange);
        putPixel(23, 14, orange);
        drawVerticalLine(9, 16, 20, orange);
        putPixel(20, 20, orange);
        drawVerticalLine(12, 15, 22, orange);
        putPixel(23, 22, orange);
        putPixel(24, 21, orange);
        drawVerticalLine(16, 17, 21, orange);
        // white-mouth
        drawVerticalLine(20, 22, 7, Color.white);
        drawVerticalLine(21, 23, 8, Color.white);
        drawHorizontalLine(9, 17, 22, Color.white);
        drawHorizontalLine(9, 19, 23, Color.white);
        drawHorizontalLine(9, 19, 24, Color.white);
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
        putPixel(22, 5, Color.white);
        drawHorizontalLine(3, 4, 10, Color.white);
        //drawHorizontalLine(4, 6, 10, Color.white);
        drawHorizontalLine(4, 6, 11, Color.white);
        drawHorizontalLine(3, 6, 12, Color.white);
        drawHorizontalLine(4, 5, 13, Color.white);
        putPixel(5, 14, Color.white);
        // white-right ear
        drawVerticalLine(6, 7, 18, Color.white);
        drawVerticalLine(5, 8, 19, Color.white);
        drawVerticalLine(4, 8, 20, Color.white);
        drawVerticalLine(5, 6, 21, Color.white);
        // black-eyes
        drawHorizontalLine(10, 13, 21, Color.black);
        //drawHorizontalLine(12, 13, 21, Color.black);
        drawVerticalLine(16, 18, 20, Color.black);
        //drawVerticalLine(15, 16, 21, Color.black);
        //black-nose
        putPixel(19, 22, Color.black);
        putPixel(20, 24, Color.black);
        putPixel(21, 23, Color.black);
        putPixel(18, 22, Color.black);
        putPixel(19, 21, Color.black);
       
        
        // TUMMY-ARMS
        
        // white
        fillRect(13, 26, 7, 4, Color.white);
        drawHorizontalLine(19, 21, 25, orange);
        // orange
        putPixel(21, 24, orange);
        putPixel(22, 23, orange);
        fillRect(11, 30, 3, 3, orange);
        fillRect(12, 27, 3, 3, orange);
        fillRect(19, 25, 3, 5, orange);
        fillRect(18, 30, 3, 4, orange);
        drawHorizontalLine(20, 21, 28, orange);
        putPixel(13, 27, orange);
        putPixel(13, 26, orange);
        // black-outline
        putPixel(12, 26, Color.black);
        drawVerticalLine(27, 29, 11, Color.black);
        drawVerticalLine(30, 32, 10, Color.black);
        drawHorizontalLine(11, 13, 33, Color.black);
        drawVerticalLine(28, 29, 15, Color.black);
        drawVerticalLine(30, 32, 14, Color.black);
        putPixel(16, 30, Color.black);
        drawHorizontalLine(18, 20, 34, Color.black);
        drawVerticalLine(30, 33, 17, Color.black);
        drawVerticalLine(27, 29, 18, Color.black);
        drawVerticalLine(25, 26, 19, Color.black);
        drawVerticalLine(30, 33, 21, Color.black);
        
        // BACK 
        // black - outline
        drawHorizontalLine(24, 26, 10, Color.black);
        drawHorizontalLine(27, 29, 11, Color.black);
        drawHorizontalLine(30, 31, 12, Color.black);
        putPixel(32, 13, Color.black);
        drawHorizontalLine(33, 34, 14, Color.black);
        putPixel(35, 15, Color.black);
        // orange
        drawHorizontalLine(25, 26, 11, orange);
        drawHorizontalLine(24, 29, 12, orange);
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
        drawHorizontalLine(25, 27, 21, Color.black);
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
        
        // orange
        
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
        
        /*/ some black
        //drawSquareGrid(PIXEL_SIZE, Color.black);*/
        
        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("foxUp2.png"));
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