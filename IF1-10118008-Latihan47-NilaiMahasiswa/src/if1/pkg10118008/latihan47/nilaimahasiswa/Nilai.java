/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan47.nilaimahasiswa;

/**
 *
 * @author ASUS
 */
public class Nilai {
	private float quiz, uts, uas, na;
	private String ket;
	private char index;

	public float getQuiz() {
		return quiz;
	}

	public float getUts() {
		return uts;
	}

	public float getUas() {
		return uas;
	}

	public float getNa() {
		return na;
	}

	public String getKet() {
		return ket;
	}

	public char getIndex() {
		return index;
	}

	public Nilai(float quiz, float uts, float uas){
		this.quiz = quiz;
		this.uts = uts;
		this.uas = uas;
		hitungNA();
		hitungIndex();
		buatKeterangan();
	}

	private void hitungNA(){
		this.na = (float)0.2 * this.quiz + (float)0.3 * this.uts + (float)0.5 * this.uas;	
	}

	private void hitungIndex(){
		if (na > 80 && na <= 100){
			this.index = 'A';	
		} else if (na > 68 && na <= 80){
			this.index = 'B';
		} else if (na > 56 && na <= 68){
			this.index = 'C';
		} else if (na > 45 && na <= 56){
			this.index = 'D';
		} else if (na > 0 && na <= 45){
			this.index = 'E';
		}
	}

	private void buatKeterangan(){
		if (this.index == 'A')
			this.ket = "Sangat Baik";
		else if (this.index == 'B')
			this.ket = "Baik";
		else if (this.index == 'C')
			this.ket = "Cukup";
		else if (this.index == 'D')
			this.ket = "Kurang";
		else if (this.index == 'E')
			this.ket = "Sangat Kurang";
	}
	
}
