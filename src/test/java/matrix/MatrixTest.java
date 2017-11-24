package matrix;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.Arrays.asList;

/**
 * Created by Aäron & Laurien on 24/11/2017.
 */
public class MatrixTest {

    @Test
    public void vul_volledigeReeksGetallen() throws Exception {
        Matrix matrix = new Matrix(2,3);
        matrix.vul(asList(1,2,3,4,5,6));

        Assertions.assertThat(matrix.getVakje(0,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(1,2)).isEqualTo(6);
    }

    @Test
    public void vul_meerGetallenDanPlaats() throws Exception {
        Matrix matrix = new Matrix(2,2);
        matrix.vul(asList(1,2,3,4,5,6));

        Assertions.assertThat(matrix.getVakje(0,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(1,1)).isEqualTo(4);
    }

    @Test
    public void vul_meerPlaatsDanGetallen_HerhalendeReeks() throws Exception {
        Matrix matrix = new Matrix(5,5);
        matrix.vul(asList(1,2,3,4,5));

        Assertions.assertThat(matrix.getVakje(0,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(1,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(2,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(3,0)).isEqualTo(1);
        Assertions.assertThat(matrix.getVakje(4,0)).isEqualTo(1);
    }

}