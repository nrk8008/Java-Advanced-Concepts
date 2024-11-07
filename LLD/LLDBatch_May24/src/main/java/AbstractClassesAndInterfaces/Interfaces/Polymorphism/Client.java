package AbstractClassesAndInterfaces.Interfaces.Polymorphism;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Square());

        System.out.println("Achieved Polymorphism");
        for(Shape shape : shapes){
            System.out.println(shape.name());
        }
    }
}
