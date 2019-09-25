package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input x > ");
		double x = Double.parseDouble(scan.next());
		System.out.print("Input h > ");
		double h = Double.parseDouble(scan.next());
		System.out.print("Input c > ");
		double c = Double.parseDouble(scan.next());

		Differential_lib dlib = new Differential_lib(h,c);
		double idx = 0;
		int i = 0;
		double x_value[] = new double[(int) (x * 10)+1];
		double r_value[] = new double[(int) (x * 10)+1];
		double d_value[] = new double[(int) (x * 10)+1];
		while(idx < x) {
			System.out.println("x = "+idx);
			System.out.println("理論値 = " + dlib.getRx(idx));
			System.out.println("微分値 = " + dlib.getDx(idx));
			x_value[i] = idx;
			r_value[i] = dlib.getRx(idx);
			d_value[i++] = dlib.getRx(idx);
			idx += 0.1;
		}
		Differential_view dview = new Differential_view(x_value,r_value,d_value);
		dview.setBounds(5,5,655,455);
		dview.setVisible(true);
	}

}
