import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class YoungPhysicistTest {
    @Test
    public void checkIfInEquilibrium() {
        YoungPhysicist physicist = new YoungPhysicist();

        ArrayList<ArrayList<Integer>> values = new ArrayList<ArrayList<Integer>>(
               Arrays.asList(
                       new ArrayList<Integer>( Arrays.asList(4, 1, 7)),
                       new ArrayList<Integer>( Arrays.asList(-2, 4, 1)),
                       new ArrayList<Integer>( Arrays.asList(1, -5, 3))
                       )
        );
        assertEquals(false, physicist.checkIfInEquilibrium(3, values));

        values.clear();
        values = new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                        new ArrayList<Integer>( Arrays.asList(3, -1, 7)),
                        new ArrayList<Integer>( Arrays.asList(-5, 2, -4)),
                        new ArrayList<Integer>( Arrays.asList(2, -1, -3))
                )
        );
        assertEquals(true, physicist.checkIfInEquilibrium(3, values));

        values.clear();
        values = new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                        new ArrayList<Integer>( Arrays.asList(2, 0, 7)),
                        new ArrayList<Integer>( Arrays.asList(2, 0, -4)),
                        new ArrayList<Integer>( Arrays.asList(-2, 0, -3)),
                        new ArrayList<Integer>( Arrays.asList(-2, 0, 0))
                )
        );
        assertEquals(true, physicist.checkIfInEquilibrium(4, values));
    }
}