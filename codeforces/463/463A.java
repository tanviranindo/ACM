import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.awt.Point;

import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Long.*;
import static java.lang.Short.*;
import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Collections.*;

public class Main {

	private Scanner in;
	private StringTokenizer st;
	private PrintWriter out;

	private DecimalFormat fmt = new DecimalFormat("0.0000000000");

	public void solve() throws Exception {
		int n = in.nextInt();
		int s = in.nextInt();

		boolean cando = false;
		int ans = -1;

		while (n --> 0) {
			int x = in.nextInt();
			int y = in.nextInt();

			if (x < s || (x <= s && y == 0)) {
				cando = true;
				ans = max(ans, (100 - y) % 100);
			}
		}

		out.println(ans);
	}

	public Main() {
		this.in = new Scanner(System.in);
		this.out = new PrintWriter(System.out);
	}

	public void end() {
		try {
			this.out.flush();
			this.out.close();
			this.in.close();
		} catch (Exception e){
			//do nothing then :)
		}
	}

	public static void main(String[] args) throws Exception {
		Main solver = new Main();
		solver.solve();
		solver.end();
	}
}
