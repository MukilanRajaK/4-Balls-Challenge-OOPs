import processing.core.PApplet;
public class Balls extends PApplet
{
    private PApplet pApplet;
    private final int radius;
    private int x_coordinate;
    private int y_coordinate;

    public Balls(PApplet pApplet)
    {
        this.pApplet=pApplet;
        radius=10;
        x_coordinate=0;
    }

    public void setX_coordinate(int Value)
    {
        x_coordinate+=Value;
    }

    public void setY_coordinate(int Value)
    {
        y_coordinate=Value;

    }

    public void draw(int incrementer)
    {
        pApplet.ellipse(x_coordinate,y_coordinate,radius,radius);
        setX_coordinate(incrementer);
    }
}
