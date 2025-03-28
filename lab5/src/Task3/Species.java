package Task3;

public class Species {
    public String Type, Name, Description;
    public int NumChrom, BaseNumbChrom;

    public Species(String type, String name, String description, int numChrom, int baseNumbChrom) {
        Type = type;
        Name = name;
        Description = description;
        NumChrom = numChrom;
        BaseNumbChrom = baseNumbChrom;
    }

    public String FullName(){
        return Type + " " + Name;
    }
    public int HaploidNumb(){
        return NumChrom/2;
    }
    public void Print(){
        System.out.println("Name: " + FullName());
        System.out.println("Description: " + Description);
        System.out.println("Number of chromosome: " + NumChrom);
        System.out.println("Haploid number of chromosome: " + HaploidNumb());
        System.out.println("\n");
    }
    public Species Clone(){
        ///return new Species(this.Type, this.Name, this.Description, this.NumChrom, this.BaseNumbChrom);
        return new Species(Type, Name, Description, NumChrom, BaseNumbChrom);
    }

}