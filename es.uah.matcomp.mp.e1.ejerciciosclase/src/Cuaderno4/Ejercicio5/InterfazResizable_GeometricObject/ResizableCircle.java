package Cuaderno4.Ejercicio5.InterfazResizable_GeometricObject;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void Resize(int percent) {
        radius *= ((double) percent /100);
    }
}
