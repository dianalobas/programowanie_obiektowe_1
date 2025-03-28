package Task2;

import java.time.LocalDate;

public class Build {
    String name;
    int building_year, floors;

    public Build(String name, int building_year, int floors) {
        this.name = name;
        this.building_year = building_year;
        this.floors = floors;
    }
    public int HaveYearsOldNow(){
        int yearNow = LocalDate.now().getYear();
        return yearNow-building_year;
    }
    public void Print(){
        System.out.println("Build: " + name);
        System.out.println("Building year: " + building_year);
        System.out.println("Build have " + HaveYearsOldNow() + " years");
        System.out.println("Number of floors: " + floors);
        System.out.println("\n");
    }
}
