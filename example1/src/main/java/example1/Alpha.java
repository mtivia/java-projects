package example1;

public class Alpha implements IAlpha {

	@Override
	public String inverse(String mot) {
		return mot.toUpperCase();
	}

}
