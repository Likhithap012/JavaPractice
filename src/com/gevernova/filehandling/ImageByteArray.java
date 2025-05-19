package com.gevernova.filehandling;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class ImageByteArray {
    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        // Create a buffered image
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Draw on the image
        Graphics2D g2d = image.createGraphics();
        g2d.setPaint(Color.BLUE);
        g2d.fillRect(0, 0, width, height);
        g2d.setPaint(Color.YELLOW);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Sample Image", 30, 100);
        g2d.dispose();

        // Save the image to a file
        try {
            File output = new File("original_image.jpg");
            ImageIO.write(image, "jpg", output);
            System.out.println("Sample image created: original_image.jpg");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String originalImagePath = "original_image.jpg";
        String copiedImagePath = "copied_image.jpg";

        try {
            // 1. Read the image file into a byte array
            FileInputStream fis = new FileInputStream(originalImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            // Convert ByteArrayOutputStream to byte array
            byte[] imageBytes = baos.toByteArray();

            // 2. Read the byte array using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(copiedImagePath);

            // 3. Write the byte array to a new image file
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fos.close();
            bais.close();

            System.out.println("Image copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
