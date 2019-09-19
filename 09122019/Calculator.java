package intervju_09122019;

public class Calculator {
/*
 * Napisati klasu Calculator koja omogucava korisniku da izvrsava sledeci kod:
 * Calculator calc = new Calculator();
 * double result = calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
 * System.out.println(result);
 */
	private static double total = 0;

	public Calculator add(double x) {
		total += x;
		return this;
	}

	public Calculator sub(double x) {
		total -= x;
		return this;
	}

	public Calculator mul(double x) {
		total *= x;
		return this;
	}

	public Calculator div(double x) {
		if (x != 0) {
			total /= x;
		} else {
			System.out.println("Deljenje sa nulom daje nedefinisan broj");
			return this;
		}
		return this;
	}

	public double value() {
		return total;
	}
}
