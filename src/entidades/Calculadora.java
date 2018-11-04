package entidades;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora() {
		
	}

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public double soma() {
		return this.getNum1() + this.getNum2();
	}
	public double subtracao() {
		return this.getNum1() - this.getNum2();
	}
	public double multiplicacao() {
		return this.getNum1() * this.getNum2();
	}
	public double divisao() {
		return this.getNum1() / this.getNum2();
	}
	
}
