public class Algorithmus {

    public static void main(String[] args) {
        einfacheListe liste = new einfacheListe();
        algorithmusAusfuehren(242, 411, liste); //hier entsprechend Werte einsetzen
        liste.listeAusgeben();
        bruecheAusgeben(liste);
    }

    //0<m<n
    public static void algorithmusAusfuehren(int m, int n, einfacheListe liste) {
        int k, r;
        k = n/m;
        r = n%m;
        if (r==0) liste.append(k);
        else {
            algorithmusAusfuehren(m-r, n*(k+1), liste);
            liste.append(k+1);
        }
    }

    public static void bruecheAusgeben(einfacheListe liste) {
        if (liste.anfang == null) return;
        Listenelement temp = liste.anfang;
        while (temp.nachfolger!=null) {
            System.out.print("(1/" + temp.wert + ") + ");
            temp = temp.nachfolger;
        }
        System.out.print("(1/" +temp.wert + ")\n");
    }

}
