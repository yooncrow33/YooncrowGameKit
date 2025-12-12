package ygk;

import ygk.util.AfterImage;

import java.util.ArrayList;

class AfterImageManager {

    ArrayList <AfterImage> afterImages = new ArrayList<>();

    protected void addAfterImage(AfterImage afterImage) {
        afterImages.add(afterImage);
    }

    public void update() {
        for (int i = afterImages.size() - 1; i >= 0; i--) {
            AfterImage afterImage = afterImages.get(i);
            afterImage.update();
            if (afterImage.isExpired()) {
                afterImages.remove(i);
            }
        }
    }

    public void draw(java.awt.Graphics g) {
        for (AfterImage afterImage : afterImages) {
            afterImage.draw(g);
        }
    }
}
