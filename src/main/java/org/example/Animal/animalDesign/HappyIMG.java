package org.example.Animal.animalDesign;

import java.awt.image.BufferedImage;

public interface HappyIMG {
    void setIMG();
    BufferedImage getIMG();
    BufferedImage getResizedIMG(int newW, int newH);
}
