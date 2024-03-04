package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.InterfazResizable_GeometricObject;

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
