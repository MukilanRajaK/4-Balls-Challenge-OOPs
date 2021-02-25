import processing.core.PApplet;

public class OOPsFourBalls extends  PApplet
{
    public static final int BackGroundColor = 255;
    Balls Ball1=new Balls();
    Balls Ball2=new Balls();
    Balls Ball3=new Balls();
    Balls Ball4=new Balls();
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
    }

    @Override
    public void setup() {
        super.setup();
        background(BackGroundColor);
        setBallsHeight();
    }

    private void setBallsHeight() {
        Ball1.setY_coordinate((1*HEIGHT)/5);
        Ball2.setY_coordinate((2*HEIGHT)/5);
        Ball3.setY_coordinate((3*HEIGHT)/5);
        Ball4.setY_coordinate((4*HEIGHT)/5);
    }

    @Override
    public void draw() {
        Draw4Balls();
    }

    private void Draw4Balls() {
        ellipse(Ball1.getX_coordinate(), Ball1.getY_coordinate(), Ball1.getRadius(), Ball1.getRadius());
        ellipse(Ball2.getX_coordinate(), Ball2.getY_coordinate(), Ball2.getRadius(), Ball2.getRadius());
        ellipse(Ball3.getX_coordinate(), Ball3.getY_coordinate(), Ball3.getRadius(), Ball3.getRadius());
        ellipse(Ball4.getX_coordinate(), Ball4.getY_coordinate(), Ball4.getRadius(), Ball4.getRadius());
        setBallsWidth();
    }

    private void setBallsWidth() {
        Ball1.setX_coordinate(1);
        Ball2.setX_coordinate(2);
        Ball3.setX_coordinate(3);
        Ball4.setX_coordinate(4);
    }
}




