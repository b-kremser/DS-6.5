public class einfacheListe {
    public Listenelement anfang;

    public einfacheListe() {
        anfang = null;
    }

    public void append(int wert) {
        Listenelement neuesElement = new Listenelement(wert);
        append(neuesElement);
    }

    public void append(Listenelement neuesElement) {
        if (anfang == null) {
            anfang = neuesElement;
        } else {
            Listenelement temp = anfang;
            while (temp.nachfolger!=null) temp = temp.nachfolger;
            temp.nachfolger = neuesElement;
        }
    }

    public void listeAusgeben() {
        if (anfang == null) return;
        Listenelement temp = anfang;
        while (temp.nachfolger!=null) {
            System.out.print(temp.wert + "; ");
            temp = temp.nachfolger;
        }
        System.out.print(temp.wert + "\n");
    }
}
