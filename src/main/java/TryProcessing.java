import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;
    int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        ellipse(x1, 1*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x2, 2*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x3, 3*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x4, 4*HEIGHT/5, DIAMETER, DIAMETER);
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
    }

}
