import processing.core.PApplet;

import java.util.Vector;

public class OOPsFourBalls extends  PApplet
{
    public static final int BackGroundColor = 255;
    Vector<Balls> balls = new Vector<Balls>();
    public static final int HEIGHT = 750;
    public static final int WIDTH = 1000;

    public static void main(String Args[])
    {
        PApplet.main("OOPsFourBalls",Args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        Balls Ball1=new Balls(this);
        balls.add(Ball1);
        Balls Ball2=new Balls(this);
        balls.add(Ball2);
        Balls Ball3=new Balls(this);
        balls.add(Ball3);
        Balls Ball4=new Balls(this);
        balls.add(Ball4);
    }

    @Override
    public void setup() {
        super.setup();
        background(BackGroundColor);
        setBallsHeight();
    }

    private void setBallsHeight() {
        int counter=1;
        for(Balls balliterator:balls) {
            balliterator.setY_coordinate((counter * HEIGHT) / 5);
            counter = counter + 1;
        }
    }

    @Override
    public void draw() {
        int counter=1;
        for(Balls balliterator:balls) {
            balliterator.draw(counter);
            counter = counter + 1;
        }


    }
}




