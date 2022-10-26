package com.company;
abstract class Shapes
{
    abstract void draw();
}
class Line extends Shapes
{
void draw()
{
    System.out.println("draw a line");
}
}
class Circle extends Shapes
{
    void draw()
    {
        System.out.println("draw a circle");
    }
}
class Rectangle extends Shapes
{
    void draw()
    {
        System.out.println("draw a rectangle");
    }
}
public class Abstractshapes {
    public static void main(String args[])
    {
        Line l=new Line();
        l.draw();
        Circle c=new Circle();
        c.draw();
        Rectangle r=new Rectangle();
        r.draw();
    }
}
