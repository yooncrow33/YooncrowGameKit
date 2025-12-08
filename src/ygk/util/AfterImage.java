package ygk.util;

import java.awt.*;

public abstract class AfterImage {
    private final int X, Y;
    private int ALPHA;
    private final int ALPHA_DEGREE;
    private final int R,G,B, HEIGHT, WIDTH;

    public AfterImage(int x, int y,int r, int g, int b, int width, int height ,int alpha, int alphaDegree) {
        this.X = x;
        this.Y = y;
        this.ALPHA = alpha;
        this.ALPHA_DEGREE = alphaDegree;
        this.R = r;
        this.G = g;
        this.B = b;
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    public void update() {
        ALPHA -= ALPHA_DEGREE;
    }

    public boolean isExpired() {
        return ALPHA <= 0;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(R, G, B, ALPHA));
        g.fillRect(X, Y, WIDTH ,HEIGHT);
    }
}
