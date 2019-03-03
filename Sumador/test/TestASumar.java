import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("5");
        String resultado = sumi.mostrar();
        assertEquals("5 = 5",resultado );
    }
	
	@Test
    public void testNegativo() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("Es un número negativo",resultado );
    }
	
	@Test
	public void testTotal() {
		ASumar sumi = new ASumar("3433");
		int resultado = sumi.total();
		assertEquals(13,resultado );
	}
	
	@Test
    public void testVariasCifra() {
        ASumar sumi = new ASumar("3433");
        String resultado = sumi.mostrar();
        assertEquals("3 + 4 + 3 + 3 = 13",resultado );
    }
     
}
