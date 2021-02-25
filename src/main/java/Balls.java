public class Balls
{
    private final int radius;
    private int x_coordinate;
    private int y_coordinate;

    public Balls()
    {
        radius=10;
        x_coordinate=0;
    }

    public int getX_coordinate()
    {
        return x_coordinate;
    }

    public int getY_coordinate()
    {
        return y_coordinate;
    }

    public void setX_coordinate(int Value)
    {
        x_coordinate+=Value;
    }

    public void setY_coordinate(int Value)
    {
        y_coordinate=Value;

    }

    public int getRadius()
    {
        return radius;
    }
}
