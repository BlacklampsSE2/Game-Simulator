package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.GameRepository;
import stock_simulator.models.Game;


@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;

	public Collection<Game> findAllGames() {
		List<Game> games = new ArrayList<Game>();
		for (Game game : gameRepository.findAll()) {
			games.add(game);
		}
		return games;
	}

	public void delete(int id) {
		gameRepository.delete(id);
	}

	public Game findOne(int id) {
		return gameRepository.findOne(id);
	}

	public void save(Game game) {
		gameRepository.save(game);
	}
}
