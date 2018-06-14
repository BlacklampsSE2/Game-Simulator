package stock_simulator;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);

		int[] RTT = new int[20];
		Random prob = new Random();
		Random rand = new Random();

		RTT[0] = rand.nextInt(3 + 1 + 3) - 3;

		for (int i = 1; i < (RTT.length); i++) {
			for (int r = 1; r <= 100; r++) {
				double z = prob.nextDouble();

				if (0 < z && z < 0.25) {
					// Increases
					if ((RTT[i - 1] + 1) >= 3) {
						RTT[i] = RTT[i - 1];
					} else {
						RTT[i] = RTT[i - 1] + 1;
					}
				} else if (0.25 < z && z < 0.50) {
					// Decreases
					if ((RTT[i - 1] - 1) < -3) {
						RTT[i] = RTT[i - 1];
					} else {
						RTT[i] = RTT[i - 1] - 1;
					}
				} else if (0.50 < z && z < 1.0) {
					RTT[i] = RTT[i - 1];
				}
			}

		}
		
		System.out.println("");
		System.out.println("*********************");
		for (int j = 0; j < RTT.length; j++) {
			System.out.println(j + " : " + RTT[j]);
		}

	}

}
