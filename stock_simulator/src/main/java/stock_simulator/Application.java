package stock_simulator;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);

		int[] ETT = new int[60];
		int[] ETTT = new int[60];
		Random rand = new Random();
		int t = 0;
		double Sector_length = 0.33;
		double Stock_length = 0.67;
		// rand.nextInt(50) + 1;

		// ini evet details

		//
		// for (int i = 0; i < ETT.length; i++) {
		// int a = rand.nextInt(4) + 1;// Number 0-1
		// if (a == 1) {
		//
		// }
		// }
		// for (int i = 0; i < 30; i++) {
		// t=rand.nextInt(1 + 1 + 0) + 0;
		// System.out.println("Turns : "+t);}
		// System.out.println

		System.out.println("----------------------------");
		for (int i = 0; i < ETT.length; i++) {;
			int a = rand.nextInt(1 + 1 + 0) + 0;// Number 0-1
			if (a == 1) {
				for (int k = 1; k <= 100; k++) {
					double z = rand.nextDouble();
					if (0 < z && z < Sector_length) {
						// Sector Event
						
						int turns = rand.nextInt(4) + 2; // 2-5 turns done
						if ((i + turns) < ETT.length) {
							for (int count = 0; count < turns; count++) {
								if (i < ETT.length) {
									for (int sek = 1; sek <= 100; sek++) {
										double l = rand.nextDouble();
										if (0 < l && l < 0.5) {
											ETT[i] = rand.nextInt(5) + 1; // 1-5 val corrected
										} else if (0.5 < l && l < 1.0) {
											ETT[i] = rand.nextInt(-1 + 1 + 5) - 5; // -1 to -5 done
										}
									}
									 ETTT[i] = turns;
									i++;
								}
							}

						}
						Sector_length=Sector_length-1.0; //Sector prob down
					}
					else if (Sector_length < z && z < 1.0) {
						// Stock Event
						int turns = rand.nextInt(7) + 1;// Number 1-7 corrected
						if ((i + turns) < ETT.length) {
							for (int count = 0; count < turns; count++) {
								if (i < ETT.length) {
									for (int stk = 1; stk <= 100; stk++) {
										double l = rand.nextDouble();
										if (0 < l && l < 0.5) {
											ETT[i] = rand.nextInt(2) + 2;// Number 2-3 corrected;
										} else if (0.5 < l && l < 0.25) {
											ETT[i] = rand.nextInt(-1 + 1 + 5) - 5; // -1 to -5 done;
										} else if (0.25 < l && l < 1.0) {
											ETT[i] = rand.nextInt(-3 + 1 + 6) - 6; // -3 to -6 done
										}
									}
									 ETTT[i] = turns;
									i++;
								}
							}

						}
						Sector_length=Sector_length+1.0; //Sector prob up (Stock prob down)
					}
				}

			} else {

			}
			// System.out.println(a);
		}

		for (int j = 0; j < ETT.length; j++) {
			System.out.println(j + " : " + ETT[j]);
		}
	}

}
