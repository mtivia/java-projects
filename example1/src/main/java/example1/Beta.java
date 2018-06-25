package example1;

public class Beta implements IAlpha{

	@Override
	public String inverse(String mot) {
		return mot.toLowerCase();
	}

}
