package ForTasks;

import Task1.*;
import Task2.*;
import Task3.Species;

public class Runner {
    public void RunTask1(){
        InfGet infGet = new InfGet();
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Cuboid cuboid = new Cuboid();
        Cone cone = new Cone();
        System.out.println("Choose a geometric figure:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Cube");
        System.out.println("5. Cuboid");
        System.out.println("6. Sphere");
        System.out.println("7. Cone");
        System.out.println("8. Tringle");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        int choice = infGet.LiczbyInt();
        switch (choice) {
            case 1:
                System.out.println("You selected a circle. Enter the radius r:");
                circle.Radius = infGet.LiczbyDouble();
                circle.Print();
                break;
            case 2:
                System.out.println("You selected a square. Enter the side length a:");
                square.Side = infGet.LiczbyDouble();
                square.Print();
                break;
            case 3:
                System.out.println("You selected a rectangle. Enter the lengths of sides a and b:");
                rectangle.Side1 = infGet.LiczbyDouble();
                rectangle.Side2 = infGet.LiczbyDouble();
                rectangle.Print();
                break;
            case 4:
                System.out.println("You selected a cube. Enter the edge length a:");
                cube.Side = infGet.LiczbyDouble();
                cube.Print();
                break;
            case 5:
                System.out.println("You selected a cuboid. Enter the lengths of edges a, b, and h:");
                cuboid.Side1 = infGet.LiczbyDouble();
                cuboid.Side2 = infGet.LiczbyDouble();
                cuboid.Side3 = infGet.LiczbyDouble();
                cuboid.Print();
                break;
            case 6:
                System.out.println("You selected a sphere. Enter the radius r:");
                sphere.Radius = infGet.LiczbyDouble();
                sphere.Print();
                break;
            case 7:
                System.out.println("You selected a cone. Enter the base radius r and height h:");
                cone.Radius = infGet.LiczbyDouble();
                cone.Hight = infGet.LiczbyDouble();
                cone.Print();
                break;
            case 8:
                System.out.println("You selected a triangle. Enter height h, the base b, a and c:");
                triangle.Hight = infGet.LiczbyDouble();
                triangle.Side1 = infGet.LiczbyDouble();
                triangle.Side2 = infGet.LiczbyDouble();
                triangle.Side3 = infGet.LiczbyDouble();
                triangle.Print();
                break;
        }
    }

    public void RunTask2(){
        Build build1 = new Build("Olimp", 1999, 24);
        Build build2 = new Build("City", 2010, 9);
        Build build3 = new Build("New", 2025, 32);

        build1.Print();
        build2.Print();
        build3.Print();
    }

    public void RunTask3(){
        Species species1 = new Species("Mammal", "Human", "about human", 46, 23);
        Species species2 = new Species("Mammal", "Dog", "about dog", 78, 39);
        Species species3 = new Species("Bird", "Penguin", "about penguin", 74, 37);
        ///species1.Print();
        Species species1Cloned = species1.Clone();
        species1Cloned.Type = "Сloned " + species1Cloned.Type;
        species1Cloned.Print();
    }
}
