public class DataUrodzenia {
    public int dzien;
    public int miesiac;
    public int rok;


    public DataUrodzenia(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }
    /// RRRRMM-DD
    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", rok, miesiac, dzien);
    }

    ///  DD.MM.RRRR
    /*public String toString() {
        if (dzien < 10){
            return "0" + dzien + "." + miesiac + "." + rok;
        } if (miesiac < 10){
            return dzien + "." + "0" + miesiac + "." + rok;
        }
        return dzien + "." + miesiac + "." + rok;
    }*/
}
