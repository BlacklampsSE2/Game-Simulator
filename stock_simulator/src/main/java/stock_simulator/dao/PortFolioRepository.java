package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Portfolio;

@Repository
public interface PortFolioRepository extends CrudRepository<Portfolio, Integer> {

}