package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.CompanyRepository;
import stock_simulator.models.Company;

@Service
public class CompanyService {

	Company company_Obj = new Company();
	int[] RT = company_Obj.RT;
	int[] MT=company_Obj.MT;
	int[]ST=company_Obj.ST;
	@Autowired
	private CompanyRepository companyRepository;

	public Collection<Company> findAllCompanies() {
		List<Company> companies = new ArrayList<Company>();
		for (Company company : companyRepository.findAll()) {
			companies.add(company);
		}
		return companies;
	}

	public void delete(int id) {
		companyRepository.delete(id);
	}

	public Company findOne(int id) {
		return companyRepository.findOne(id);
	}

	public void save(Company company) {
		companyRepository.save(company);
	}

	public void RandomTrend() {
		Random rand = new Random();
		for (int i = 0; i < RT.length; i++) {
			RT[i] = rand.nextInt(2 + 1 + 2) - 2;
			// System.out.println(RT[i]);
		}

	}

	public void SectorTrend() {
		Random prob = new Random();
		Random rand = new Random();

		ST[0] = rand.nextInt(3 + 1 + 3) - 3;

		for (int i = 1; i < (ST.length); i++) {
			for (int r = 1; r <= 100; r++) {
				double z = prob.nextDouble();

				if (0 < z && z < 0.25) {
					// Increases
					if ((ST[i - 1] + 1) >= 3) {
						ST[i] = ST[i - 1];
					} else {
						ST[i] = ST[i - 1] + 1;
					}
				} else if (0.25 < z && z < 0.50) {
					// Decreases
					if ((ST[i - 1] - 1) < -3) {
						ST[i] = ST[i - 1];
					} else {
						ST[i] = ST[i - 1] - 1;
					}
				} else if (0.50 < z && z < 1.0) {
					ST[i] = ST[i - 1];
				}
			}

		}
	}

	public void MarketTrend() {
		Random prob = new Random();
		Random rand = new Random();

		MT[0] = rand.nextInt(3 + 1 + 3) - 3;

		for (int i = 1; i < (MT.length); i++) {
			for (int r = 1; r <= 100; r++) {
				double z = prob.nextDouble();

				if (0 < z && z < 0.25) {
					// Increases
					if ((MT[i - 1] + 1) >= 3) {
						MT[i] = MT[i - 1];
					} else {
						MT[i] = MT[i - 1] + 1;
					}
				} else if (0.25 < z && z < 0.50) {
					// Decreases
					if ((MT[i - 1] - 1) < -3) {
						MT[i] = MT[i - 1];
					} else {
						MT[i] = MT[i - 1] - 1;
					}
				} else if (0.50 < z && z < 1.0) {
					MT[i] = MT[i - 1];
				}
			}

		}
	}

	public void EventTrend() {

	}
}
