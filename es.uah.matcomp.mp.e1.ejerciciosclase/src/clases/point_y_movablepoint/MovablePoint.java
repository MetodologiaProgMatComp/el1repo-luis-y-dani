package clases.point_y_movablepoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] xy = new float[2];
        xy[0] = xSpeed;
        xy[1] = ySpeed;
        return xy;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override

    public String toString() {
        return "(" + getX() + "," + getY() + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move() {
        // terminar
        MovablePoint a = new MovablePoint(getX(), getY(), xSpeed, ySpeed);
        this.getX() += xSpeed;
        this.getY() += ySpeed;
        return this;
    }
}
