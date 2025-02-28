import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageCreation {
    public static void main(String[] args) {
        // Image dimensions
        int width = 400;
        int height = 300;

        // Create a BufferedImage
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Get Graphics2D object to draw on the image
        Graphics2D g = image.createGraphics();

        // Set background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Draw a rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        // Draw a circle
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100);

        // Draw text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello, Image!", 100, 200);

        // Dispose of the graphics object
        g.dispose();

        // Save the image to a file
        try {
            File outputFile = new File("output_image.png");
            ImageIO.write(image, "png", outputFile);
            System.out.println("Image created: " + outputFile.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
