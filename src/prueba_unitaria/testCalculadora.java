		package prueba_unitaria;
		
		import junit.framework.TestCase;
		
		public class testCalculadora extends TestCase{
		private calculadora calculadora;
		
		public void escenario () {
			calculadora = new calculadora();
		}
		
		
		public void  testsumar () {
			escenario();
			assertTrue(calculadora.sumar(2, 2)==(2+2));;
		
		}
		
		public void  testsumar2 () {
			escenario();
			assertTrue(calculadora.sumar(2, 2) != 5);
		
		}
		
		public void  testrestar () {
			escenario();
		assertEquals(3, calculadora.restar(5, 2));;
		
		}
		public void testmultiplicar () {
			escenario();
			assertTrue(calculadora.multiplicar(2, 2)==2 * 2);
		
		}
		public void  testdividir () {
			escenario();
			assertTrue(calculadora.dividir(2, 2)==(2 / 2));;
		
		}
		
		
		}
