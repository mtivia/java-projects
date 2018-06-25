package example2;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		/*IOperator add = new IOperator() {
			@Override
			public int op(int a, int b) {	
				return a + b;
			}
		};
		*/
		/*IOperator mult = new IOperator() {
			@Override
			public int op(int a, int b) {
				return a*b;
			}
		};*/
		
		IOperator add = (int a,int b) -> {
			return a + b;
		};
		
		System.out.println(add.op(2,3));
		
		/**lambdas expressions ne fonctionnent que pour une interface n'ayant qu'une seule methode
		 * on peut retirer les types d'arguments
		 * une seule methode ne necessite pas les accolades
		 * pas besoin du return
		 * BiFunction remplace l'interface qui a une methode avec 
		 * lambdas = mettre une fonction dans une variable types en entr�e
		 * 
		 * */
		
		BiFunction<Integer, Integer, Integer> mult = (a,b) -> a * b;
		
		System.out.println(mult.apply(2, 3));
		
		 
	}

}
