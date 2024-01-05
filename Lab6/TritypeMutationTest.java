import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TritypeMutationTest {
    TritypMutantOne triOne = new TritypMutantOne();
    TritypMutantTwo triTwo = new TritypMutantTwo();

    @Test
    public void testTriang_1(){
        assertEquals(4, triOne.Triang(2, 2, 4));
    }

    @Test
    public void testTriang_2(){
        assertEquals(4, triTwo.Triang(2, 2, 4));
    }
}
