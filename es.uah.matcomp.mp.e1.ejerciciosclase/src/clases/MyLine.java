package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases;

import es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
    }
    public void setBeginX(int x){
        this.x = x1;
    }
    public int getBeginY(){

    }
    public void setBeginY(int y){
        this.y = y1;
    }
    public int getEndX(){
        return
    }
    public void setEndX(int x){
        this.x = x2;
    }
    public int getEndY(){

    }
    public void setEndY(int y){
        this.y = y2;
    }
    public int getBeginXY(){
        int[] BeginXY = new int[2];
        BeginXY[0] = x1;
        BeginXY[1] = y1;
        return beginxy;
    }
    public void setBeginXY(int x, int y){
        this.x = x1;
        this.y = y1;
    }
    public int getEndXY(){
        int[] EndXY = new int[2];
        EndXY[0] = x2;
        EndXY[1] = y2;
        return endxy;
    }
    public void setEndXY(int x, int y){
        this.x = x2;
        this.y = y2;
    }
    public double getLength(){
        return myPoint.distance();
    }
    public double getGradient(){
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLine[begin=("+x1+","+y1+"), end=("+x2+","+y2+")]";
    }
}