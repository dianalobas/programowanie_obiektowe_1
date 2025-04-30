public class Sprzet {
    private int id;
    private String nazwa;
    private String rodzaj;

    public Sprzet(int id, String nazwa, String rodzaj) {
        this.id = id;
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString() {
        return "Sprzet{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                "}\n";
    }
}
