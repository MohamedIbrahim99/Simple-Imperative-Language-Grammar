package egtry;

public class grammer {

	public static void main(String[] args) {

		Example1 parser = new Example1(System.in);
	    try {
			parser.Input();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
