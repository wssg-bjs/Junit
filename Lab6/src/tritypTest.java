import org.junit.*;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class tritypTest {
    trityp tri=new trityp();

    //    Triang = 1 if triangle is scalene
    //    Triang = 2 if triangle is isosceles
    //    Triang = 3 if triangle is equilaterala
    //    Triang = 4 if not a triangle

    @Test
    public void testTriang_1(){
        assertEquals(1, tri.Triang(3, 4, 6));
    }

    @Test
    public void testTriang_2(){
        assertEquals(2, tri.Triang(4, 4, 7));
        assertEquals(2, tri.Triang(4, 7, 4));
        assertEquals(2, tri.Triang(7, 4, 4));
    }

    @Test
    public void testTriang_3(){
        assertEquals(3, tri.Triang(4, 4, 4));
    }

    @Test
    public void testTriang_4(){
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(3, 3, 6));
        assertEquals(4, tri.Triang(3, 6, 3));
        assertEquals(4, tri.Triang(6, 3, 3));
        assertEquals(4, tri.Triang(6, 8, 1));
        assertEquals(4, tri.Triang(6, 1, 8));
        assertEquals(4, tri.Triang(8, 6, 1));
        assertEquals(4, tri.Triang(8, 1, 6));
        assertEquals(4, tri.Triang(1, 6, 8));
        assertEquals(4, tri.Triang(1, 8, 6));
        assertEquals(4, tri.Triang(-1, 2, 3));
        assertEquals(4, tri.Triang(2, -1, 3));
        assertEquals(4, tri.Triang(2, 3, -1));
    }
}