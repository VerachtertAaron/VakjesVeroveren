package generator;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by Aäron & Laurien on 24/11/2017.
 */
public class TafelGenerator {

    public static ArrayList<Integer> genereerTafels(int vanCijfer, int totCijfer){
        ArrayList<Integer> result = new ArrayList<>();
        for(int cijfer = vanCijfer; cijfer <= totCijfer; cijfer++) {
            result.addAll(genereerTafel(cijfer));
        }

        return result;
    }

    public static ArrayList<Integer> genereerTafels(int... cijfers){
        ArrayList<Integer> result = new ArrayList<>();
        for (int cijfer : cijfers) {
            result.addAll(genereerTafel(cijfer));
        }

        return result;
    }

    private static ArrayList<Integer> genereerTafel(int cijfer) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            result.add(i*cijfer);
        }

        return result;
    }
}
