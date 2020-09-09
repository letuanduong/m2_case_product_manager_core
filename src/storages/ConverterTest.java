package storage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

	@Test
	void testConverter() {
		Converter converter = new Converter();
		converter.regax("Samsung, Điện thoại, 0131491002034, 3690000, data216173 category: CANDY; id: 12; cost: 445.0; name: cosy;");
		converter.convert();
		assertEquals(converter.getArrConveter()[0], "CANDY");
		assertEquals(converter.getArrConveter()[1], "12");
		assertEquals(converter.getArrConveter()[2], "445.0");
		assertEquals(converter.getArrConveter()[3], "cosy");
		assertEquals(converter.getArrConveter()[4], "Samsung");
		assertEquals(converter.getArrConveter()[5], "216173");
		assertEquals(converter.getArrConveter()[6], "3690000");
		assertEquals(converter.getArrConveter()[7], "Điện thoại");
	}
}
