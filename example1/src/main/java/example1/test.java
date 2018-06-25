package example1;

public class test {

	public static void main(String[] args) {	
		//IAlpha alpha = new Alpha();
		/**
		 * System.out.println(alpha.inverse("tony"));
		 * IAlpha beta = new Beta();
		   System.out.println(beta.inverse("tony"));
		 */
		
		Service service = new Service();
		service.traitement(new IAlpha() {	
			@Override
			public String inverse(String mot) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

}
