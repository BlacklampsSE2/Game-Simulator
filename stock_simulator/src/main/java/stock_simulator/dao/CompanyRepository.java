package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Company;


@Repository
public interface CompanyRepository extends CrudRepository<Company,Integer>{

}
