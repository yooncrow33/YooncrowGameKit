import ygk.Base;

import java.awt.*;

public class App extends Base {

    int x = 500;
    int y = 300;
    int height = 50;
    int width = 50;

    public App(String title) {
        super(title);

    }

    @Override
    protected void render(Graphics g) {
        g.setColor(Color.red);
        g.drawString(String.valueOf(getTickManager().getTick()), 100, 100);
        g.drawString("CPU: " + getSystemMonitor().getCpuPercentage() + "%", 100, 120);

        g.fillRect(x,y, width, height);
    }

    @Override
    protected void update(double dt) {
        x++;

        TestAfterImage testAfterImage = new TestAfterImage(x, y, 255, 100, 100, width, height, 150, 15);
        getAfterImageManager().addAfterImage(testAfterImage);
    }

    @Override
    protected void initGame() {
        getSystemMonitor();
        getAfterImageManager();
    }

    public static void main(String[] args) {
        new App("Sample Application");
    }
}