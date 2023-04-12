package read;

import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Canvas;
//import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class RaccoonSit {
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
    	// gray
    	drawHorizontalLine(17, 22, 5, gray);
    	drawHorizontalLine(14, 25, 6, gray);
    	fillRect(12,7,16,9, gray);
    	drawHorizontalLine(19, 20, 16, gray);
    	drawVerticalLine(7, 13, 11, gray);
    	drawVerticalLine(7, 13, 10, gray);
    	drawVerticalLine(7, 13, 28, gray);
    	drawVerticalLine(7, 13, 29, gray);
    	drawHorizontalLine(17, 18, 21, gray);
    	drawHorizontalLine(21, 22, 21, gray);
    	
    	//black outline
    	drawHorizontalLine(17, 22, 4, Color.black);
    	drawHorizontalLine(14, 16, 5, Color.black);
    	drawHorizontalLine(23, 24, 5, Color.black);
    	
    	drawHorizontalLine(13, 16, 21, Color.black);
    	drawHorizontalLine(11, 12, 20, Color.black);
    	putPixel(10, 19, Color.black);
    	putPixel(9, 18, Color.black);
    	drawVerticalLine(16, 17, 8, Color.black);
    	drawVerticalLine(14, 15, 7, Color.black);
    	drawVerticalLine(11, 13, 8, Color.black);
    	drawVerticalLine(8, 10, 9, Color.black);
    	
    	drawHorizontalLine(17, 22, 22, Color.black);

    	drawHorizontalLine(23, 26, 21, Color.black);
    	drawHorizontalLine(27, 28, 20, Color.black);
    	putPixel(29, 19, Color.black);
    	putPixel(30, 18, Color.black);
    	drawVerticalLine(16, 17, 31, Color.black);
    	drawVerticalLine(14, 15, 32, Color.black);
    	drawVerticalLine(11, 13, 31, Color.black);
    	drawVerticalLine(8, 10, 30, Color.black);
    	
    	
    	// EYES
    	// left
    	fillRect(12,10,7,6, gray_b);
    	drawVerticalLine(11, 18, 11, gray_b);
    	drawVerticalLine(12, 18, 10, gray_b);
    	drawVerticalLine(13, 17, 9, gray_b);
    	drawVerticalLine(14, 15, 8, gray_b);
    	drawHorizontalLine(12, 17, 16, gray_b);
    	drawHorizontalLine(12, 16, 17, gray_b);
    	drawHorizontalLine(12, 15, 18, gray_b);
    	drawHorizontalLine(11, 16, 19, gray_b);
    	drawHorizontalLine(13, 17, 20, gray_b);
    	fillRect(15,11,3,4, Color.black);
    	putPixel(17, 12, Color.white);
    	putPixel(16, 13, Color.white);
    	// white
    	drawVerticalLine(11, 12, 9, Color.white);
    	drawVerticalLine(10, 11, 10, Color.white);
    	drawVerticalLine(9, 10, 11, Color.white);
    	drawHorizontalLine(12, 18, 9, Color.white);
    	
    	// right
    	fillRect(21,10,7,6, gray_b);
    	drawVerticalLine(11, 18, 28, gray_b);
    	drawVerticalLine(12, 18, 29, gray_b);
    	drawVerticalLine(13, 17, 30, gray_b);
    	drawVerticalLine(14, 15, 31, gray_b);
    	drawHorizontalLine(22, 27, 16, gray_b);
    	drawHorizontalLine(23, 27, 17, gray_b);
    	drawHorizontalLine(24, 27, 18, gray_b);
    	drawHorizontalLine(23, 28, 19, gray_b);
    	drawHorizontalLine(22, 26, 20, gray_b);
    	fillRect(22,11,3,4, Color.black);
    	putPixel(24, 12, Color.white);
    	putPixel(23, 13, Color.white);
    	// white
    	drawVerticalLine(11, 12, 30, Color.white);
    	drawVerticalLine(10, 11, 29, Color.white);
    	drawVerticalLine(9, 10, 28, Color.white);
    	drawHorizontalLine(21, 27, 9, Color.white);
    	
    	
    	//nose
    	drawHorizontalLine(18, 21, 18, Color.black);
    	drawHorizontalLine(19, 20, 19, Color.black);
    	putPixel(18, 16, Color.white);
    	putPixel(21, 16, Color.white);
    	drawHorizontalLine(17, 22, 17, Color.white);
    	drawHorizontalLine(15, 17, 18, Color.white);
    	drawHorizontalLine(16, 18, 19, Color.white);
    	
    	drawHorizontalLine(17, 22, 20, Color.white);
    	
    	drawHorizontalLine(21, 23, 19, Color.white);
    	drawHorizontalLine(22, 24, 18, Color.white);
    	drawHorizontalLine(19, 20, 21, Color.white);
    	
    	// EARS
    	// left
    	// gray_b
    	fillRect(10,5,4,2, gray_b);
    	drawHorizontalLine(10, 12, 4, gray_b);
    	drawHorizontalLine(10, 11, 3, gray_b);
    	drawHorizontalLine(11, 13, 7, gray_b);
    	putPixel(14, 6, gray_b);
    	putPixel(12, 8, gray_b);
    	// gray
    	drawVerticalLine(3, 7, 9, gray);
    	drawHorizontalLine(10, 11, 2, gray);
    	putPixel(12, 3, gray);
    	putPixel(13, 4, gray);
    	putPixel(14, 5, gray);
    	// outline
    	drawVerticalLine(3, 7, 8, Color.black);
    	putPixel(9, 2, Color.black);
    	drawHorizontalLine(10, 11, 1, Color.black);
    	putPixel(12, 2, Color.black);
    	putPixel(13, 3, Color.black);
    	putPixel(14, 4, Color.black);
    	
    	putPixel(9, 5, gray_b);
    	
    	// right
    	// gray_b
    	fillRect(26,5,4,2, gray_b);
    	drawHorizontalLine(27, 29, 4, gray_b);
    	drawHorizontalLine(28, 29, 3, gray_b);
    	drawHorizontalLine(26, 28, 7, gray_b);
    	putPixel(25, 6, gray_b);
    	putPixel(27, 8, gray_b);
    	// gray
    	drawVerticalLine(3, 7, 30, gray);
    	drawHorizontalLine(28, 29, 2, gray);
    	putPixel(27, 3, gray);
    	putPixel(26, 4, gray);
    	putPixel(25, 5, gray);
    	// black
    	drawVerticalLine(3, 7, 31, Color.black);
    	putPixel(30, 2, Color.black);
    	drawHorizontalLine(28, 29, 1, Color.black);
    	putPixel(27, 2, Color.black);
    	putPixel(26, 3, Color.black);
    	putPixel(25, 4, Color.black);
    	
    	putPixel(30, 5, gray_b);
    	
    	// TUMMY
    	// gray
    	fillRect(13,22,4,8, gray);
    	drawVerticalLine(23, 30, 17, gray);
    	drawVerticalLine(25, 28, 12, gray);
    	drawHorizontalLine(14, 17, 30, gray);
    	putPixel(16, 31, gray);
    	drawHorizontalLine(18, 21, 23, gray);
    	drawHorizontalLine(19, 20, 24, gray);
    	drawVerticalLine(23, 30, 22, gray);
    	fillRect(23,22,4,13, gray);
    	drawVerticalLine(25, 30, 27, gray);
    	// gray_w
    	fillRect(18,25,4,9, gray_w);
    	putPixel(18, 24, gray_w);
    	putPixel(21, 24, gray_w);
    	drawVerticalLine(25, 28, 17, gray_w);
    	drawVerticalLine(25, 28, 22, gray_w);
    	// black
    	drawVerticalLine(22, 24, 12, Color.black);
    	drawVerticalLine(25, 28, 11, Color.black);
    	drawVerticalLine(31, 32, 17, Color.black);
    	drawVerticalLine(22, 24, 27, Color.black);
    	drawVerticalLine(25, 30, 28, Color.black);
    	drawVerticalLine(31, 34, 27, Color.black);
    	drawHorizontalLine(23, 26, 35, Color.black);
    	drawVerticalLine(31, 34, 22, Color.black);
    	
    	drawHorizontalLine(19, 21, 34, Color.black);
    	
    	/*
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
    	*/
    	// TAIL
    	// black
    	putPixel(10, 26, Color.black);
    	drawHorizontalLine(8, 9, 27, Color.black);
    	putPixel(7, 28, Color.black);
    	putPixel(6, 29, Color.black);
      	drawVerticalLine(30, 33, 5, Color.black);
      	putPixel(6, 34, Color.black);
      	putPixel(7, 35, Color.black);
      	drawHorizontalLine(8, 9, 36, Color.black);
    	drawHorizontalLine(10, 11, 37, Color.black);
      	drawHorizontalLine(12, 15, 38, Color.black);
      	putPixel(12, 29, Color.black);
      	putPixel(13, 30, Color.black);
      	drawHorizontalLine(14, 15, 31, Color.black);
      	putPixel(16, 32, Color.black);
      	putPixel(17, 33, Color.black);
      	drawVerticalLine(34, 35, 18, Color.black);
      	putPixel(17, 36, Color.black);
      	putPixel(16, 37, Color.black);
      	// gray
      	putPixel(10, 27, gray);
      	drawHorizontalLine(8, 10, 28, gray);
      	fillRect(7,29,5,5, gray);
      	drawVerticalLine(30, 33, 6, gray);
      	drawVerticalLine(30, 33, 12, gray);
      	drawVerticalLine(31, 33, 13, gray);
      	drawHorizontalLine(14, 15, 32, gray);
      	drawHorizontalLine(14, 16, 33, gray);
      	drawHorizontalLine(7, 17, 34, gray);
      	drawHorizontalLine(8, 17, 35, gray);
      	drawHorizontalLine(10, 16, 36, gray);
      	putPixel(12, 37, gray);
      	// gray_b 
      	drawHorizontalLine(9, 11, 29, gray_b);
      	drawHorizontalLine(8, 10, 30, gray_b);
      	drawHorizontalLine(7, 9, 31, gray_b);
      	drawHorizontalLine(6, 8, 32, gray_b);
      	drawHorizontalLine(6, 7, 33, gray_b);
      	putPixel(13, 31, gray_b);
      	drawHorizontalLine(12, 14, 32, gray_b);
      	drawHorizontalLine(11, 13, 33, gray_b);
      	drawHorizontalLine(10, 12, 34, gray_b);
      	drawHorizontalLine(9, 11, 35, gray_b);
      	putPixel(10, 36, gray_b);
      	drawHorizontalLine(16, 17, 34, gray_b);
      	drawHorizontalLine(15, 17, 35, gray_b);
      	drawHorizontalLine(14, 16, 36, gray_b);
      	drawHorizontalLine(13, 15, 37, gray_b);

        // Guardamos la imagen en formato PNG
        try {       
            ImageIO.write(image, "png", new File("RacconSit.png"));
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