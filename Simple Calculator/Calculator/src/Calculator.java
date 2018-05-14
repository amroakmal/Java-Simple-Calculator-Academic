import javax.swing.JOptionPane;

public class Calculator {
	private String current = "";
	String history;
	private int operand, k = 1;
	int i = 0;
	private double ans, number1, number2;
	private char opCheck;

	public double operation() {
		switch (operand) {
		case 1:
			ans = number1 + number2;
			current = number1 + "+" + number2 + "=" + ans;
			return ans;
		case 2:
			ans = number1 - number2;
			current = number1 + "-" + number2 + "=" + ans;
			return ans;
		case 3:
			ans = number1 * number2;
			current = number1 + "*" + number2 + "=" + ans;
			return ans;
		case 4:
			if (number2 == 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = number1 / number2;
				current = number1 + "/" + number2 + "=" + ans;
				return ans;
			}
		case 5:
			if (number2 == 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = number1 % number2;
				current = number1 + "%" + number2 + "=" + ans;
				return ans;
			}
		case 6:
			ans = number1 * number1;
			current = number1 + "*" + number1 + "=" + ans;
			return ans;
		case 7:
			ans = Math.sin(Math.toRadians(number1));
			String auxS = String.format("%.2f", ans);
			current = "sin" + "(" + number1 + ")" + "=" + auxS;
			return ans;
		case 8:
			ans = Math.cos(Math.toRadians(number1));
			String auxC = String.format("%.2f", ans);
			current = "cos" + "(" + number1 + ")" + "=" + auxC;
			return ans;
		case 9:
			ans = Math.tan(Math.toRadians(number1));
			String auxT = String.format("%.2f", ans);
			current = "tan" + "(" + number1 + ")" + "=" + auxT;
			return ans;
		case 10:
			ans = Math.sinh(number1);
			String auxSH = String.format("%.2f", ans);
			current = "sinh" + "(" + number1 + ")" + "=" + auxSH;
			return ans * 180 / Math.PI;
		case 11:
			ans = Math.cosh(number1);
			String auxCH = String.format("%.2f", ans);
			current = "cosh" + "(" + number1 + ")" + "=" + auxCH;
			return ans;
		case 12:
			ans = Math.tanh(number1);
			String auxTH = String.format("%.2f", ans);
			current = "tanh" + "(" + number1 + ")" + "=" + auxTH;
			return ans;
		case 13:
			if (number1 > 1) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = Math.asin(number1);
				String auxAS = String.format("%.3f", ans * 180 / Math.PI);
				current = "asin" + "(" + number1 + ")" + "=" + auxAS;
				return ans * 180 / Math.PI;
			}
		case 14:
			if (number1 > 1) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = Math.acos(number1);
				String auxAC = String.format("%.3f", ans * 180 / Math.PI);
				current = "acos" + "(" + number1 + ")" + "=" + auxAC;
				return ans * 180 / Math.PI;
			}
		case 15:
			ans = Math.atan(number1);
			String auxAT = String.format("%.3f", ans * 180 / Math.PI);
			current = "atan" + "(" + number1 + ")" + "=" + auxAT;
			return ans * 180 / Math.PI;
		case 16:
			if (number1 < 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = Math.sqrt(number1);
				current = "sqrt" + "(" + number1 + ")" + "=" + ans;
				return ans;
			}
		case 17:
			ans = Math.exp(number1);
			current = "e^" + "(" + number1 + ")" + "=" + ans;
			return ans;
		case 18:
			if (number1 == 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = Math.log(number1);
				current = "Ln" + "(" + number1 + ")" + "=" + ans;
				return ans;
			}
		case 19:
			if (number1 < 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				ans = 1;
				for (int i = 1; i <= number1; i++) {
					ans *= i;
				}
				current = number1 + "!" + "=" + ans;
				return ans;
			}
		case 20:
			if (number1 < 0) {
				JOptionPane.showMessageDialog(null, "Math Error");
				break;
			} else {
				int aux1 = (int) number1;
				String k = Integer.toBinaryString(aux1);
				ans = Double.parseDouble(k);
				current = "DtoB " + number1 + "=" + k;
				return ans;
			}
		case 21:
			number1 = number1 * -1;
			return number1;
		}
		return 0;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public double getAns() {
		return ans;
	}

	public void setAns(double ans) {
		this.ans = ans;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public char getOpCheck() {
		return opCheck;
	}

	public void setOpCheck(char opCheck) {
		this.opCheck = opCheck;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}
}
