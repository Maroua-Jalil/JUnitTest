package org.mql.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaClasseTest {

	@Test
	void testMaClasse() {
		
		assertEquals(2, MaClasse.maMethode(1,1));
	}

}
