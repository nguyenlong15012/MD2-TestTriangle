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
}