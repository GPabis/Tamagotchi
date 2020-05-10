package org.example.animalDesign;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PersianCatHappyIMG implements HappyIMG {
    private static final String pathToIMG =
            "src/main/java/org/example/animalDesign/IMG/persiancatIMG/persiancathappyimg.jpg";
    private BufferedImage img;

    @Override
    public void setIMG() {
    try {
        this.img = ImageIO.read(new File(this.pathToIMG));
    }catch (IOException e){
        System.out.println("Img not found.");
    }
    }

    @Override
    public BufferedImage getIMG() {
        return this.img;
    }

    @Override
    public BufferedImage getResizedIMG(int newW, int newH) {
        try {
            return Thumbnails.of(this.img).size(newW, newH).asBufferedImage();
        } catch (IOException e) {
            e.printStackTrace();
            return img;
        }
    }
}
