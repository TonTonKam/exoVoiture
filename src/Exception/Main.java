package Exception;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(inverse(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
	public static double inverse(double a) throws Exception {
		
		if(a == 0) throw new Exception("Division par 0 impossible");
		return 1/a;
	}

}
