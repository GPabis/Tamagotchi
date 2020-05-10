package org.example.animalDesign;

import java.awt.image.BufferedImage;

public interface SleepIMG {
    void setIMG();
    BufferedImage getIMG();
    BufferedImage getResizedIMG(int newW, int newH);
}
