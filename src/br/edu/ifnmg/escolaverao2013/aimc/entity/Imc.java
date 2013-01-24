package br.edu.ifnmg.escolaverao2013.aimc.entity;

public class Imc {

	private float peso;
	private float altura;

	public Imc() {

	}

	public Imc(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso < 0 ? 0 : peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura < 0 ? 0 : altura;
	}

	public float obterImc() {
		if (altura == 0) {
			return 0;
		} else {
			return peso / (altura * altura);
		}
	}

	public String obterDescricao() {
		float imc = obterImc();

		if (imc == 0) {
			return "Valores inválidos";
		} else if (imc < 16) {
			return "Magreza severa";
		} else if (imc < 17) {
			return "Magreza moderada";
		} else if (imc < 18.5) {
			return "Magreza";
		} else if (imc < 25) {
			return "Normal";
		} else if (imc < 30) {
			return "Pré-obesidade";
		} else if (imc < 35) {
			return "Obesidade Grau I (Leve)";
		} else if (imc < 40) {
			return "Obesidade Grau II (Moderada)";
		} else {
			return "Obesidade Grau III (Mórbida)";
		}
	}

}
