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
public class IF110118008Latihan47NilaiMahasiswa {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Nilai n = new Nilai(75, 45, 34);
		System.out.println("QUIZ\t\t= " + n.getQuiz());
		System.out.println("UTS\t\t= " + n.getUts());
		System.out.println("UAS\t\t= " + n.getUts());
		System.out.println("\nNilai Akhir\t\t= " + n.getNa());
		System.out.println("\nIndex = " + n.getIndex());
		System.out.println("Keterangan = " + n.getKet());
	}
	
}
