package read;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;

public class GifMaker {
	
	public static void main(String[] args) throws Exception {
        BufferedImage first = ImageIO.read(new File("fox.png"));
        
        //static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //ImageIO.write(image, "png", new File("Raccoon.png"));
        
        ImageOutputStream output = new FileImageOutputStream(new File("foxGif.gif"));

        GifSequenceWriter writer = new GifSequenceWriter(output, first.getType(), 250, true);
        
        writer.writeToSequence(first);

        File[] images = new File[]{
        		new File("foxUp.png"),
        		new File("foxUp2.png"),
        		new File("foxUp3.png"),
        		new File("foxUp4.png"),
        		new File("foxUp5.png"),
        		new File("foxUp4.png"),
                new File("foxUp3.png"),
                new File("foxUp2.png"),
          		new File("foxUp.png"),
        };

        for (File image : images) {
            BufferedImage next = ImageIO.read(image);
            writer.writeToSequence(next);
        }

        writer.close();
        output.close();
    }
	
}
