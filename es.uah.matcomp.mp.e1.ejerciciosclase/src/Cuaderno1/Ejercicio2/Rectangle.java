package Cuaderno1.Ejercicio2;

public class Rectangle {
    private float Length;
    private float Width;

    public Rectangle(float l, float w) {
        Length = l;
        Width = w;

    }

    public Rectangle() {
        Length = 1.0f;
        Width = 1.0f;
    }
    public String toString() {
        return "Rectangle[length="+ Length+",width="+ Width+"]";
    }
    public void setLength(float Length) {
        this.Length = Length;
    }

    public void setWidth(float Width) {
        this.Width = Width;
    }

    public float getLength() {return Length;
    }

    public float getWidth() {return Width;
    }

    public double getArea() {return Length * Width;
    }

    public double getPerimeter() { return 2*Length + 2*Width;
    }

}
