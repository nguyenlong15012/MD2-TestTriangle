import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testtriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam Giac Deu";
        String result = TriangleClassifier.Triangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    void testtriangleCan() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam Giac Can";
        String result = TriangleClassifier.Triangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleNor() {
        int a = 2;
        int b = 3;
        int c = 4;
        String expected = "Tam Giac Thuong";
        String result = TriangleClassifier.Triangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    void testNotTriangle() {
        int a = 2;
        int b = 3;
        int c = 1;
        String expected = "Khong La Tam Giac";
        String result = TriangleClassifier.Triangle(a,b,c);
        assertEquals(expected, result);
    }
}