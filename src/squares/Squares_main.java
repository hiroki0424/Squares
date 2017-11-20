package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.1, 0.4, 0.8, 1.0, 1.6, 1.8, 2.6 };
		double y[] = { 0.3, 0.9, 1.2, 2.3, 3.8, 4.1, 6.2 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
          }
	}
}