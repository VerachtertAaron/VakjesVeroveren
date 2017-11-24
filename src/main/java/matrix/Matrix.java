package matrix;

import java.util.*;

/**
 * Created by Aäron & Laurien on 24/11/2017.
 */
public class Matrix {

    private int[] vakjes;
    private int aantalRijen;
    private int aantalKolommen;

    public Matrix(int aantalRijen, int aantalKolommen) {
        this.vakjes = new int[aantalRijen * aantalKolommen];
        this.aantalRijen = aantalRijen;
        this.aantalKolommen = aantalKolommen;
    }

    public int getVakje(int rij, int kolom) {
        return vakjes[rij*aantalKolommen + kolom];
    }

    public void vul(List<Integer> getallen) {
        Queue<Integer> huidigeReeks = new LinkedList<>(getallen);
        int index = 0;
        while(index < vakjes.length) {
            if(huidigeReeks.isEmpty()){
                huidigeReeks = new LinkedList<>(getallen);
            }
            vakjes[index] = huidigeReeks.poll();
            index++;
        }
    }

    public void vulRandom(List<Integer> getallen) {
        Collections.shuffle(getallen);
        Queue<Integer> huidigeReeks = new LinkedList<>(getallen);
        int index = 0;
        while(index < vakjes.length) {
            if(huidigeReeks.element() == null){
                Collections.shuffle(getallen);
                huidigeReeks = new LinkedList<>(getallen);
            }
            vakjes[index] = huidigeReeks.poll();
        }
    }
}
