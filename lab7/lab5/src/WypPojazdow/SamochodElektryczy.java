package WypPojazdow;

public class SamochodElektryczy extends Pojazd implements Elektryczny{
    private int poziomBaterii = 90;
    public SamochodElektryczy(String id, String model) {
        super(id, model);
    }

    @Override
    public void naladuj() {
        poziomBaterii = 100;
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 35.0;
    }
}
