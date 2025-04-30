import java.util.Objects;

public class Uczestnicy {
    private int id;
    private String name;
    private int wiek;

    public Uczestnicy(int id, String name, int wiek) {
        this.id = id;
        this.name = name;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnicy that = (Uczestnicy) o;
        return id == that.id && wiek == that.wiek && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, wiek);
    }

    @Override
    public String toString() {
        return "Uczestnicy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wiek=" + wiek +
                '}';
    }

}
