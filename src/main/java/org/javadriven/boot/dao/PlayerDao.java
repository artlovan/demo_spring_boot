package org.javadriven.boot.dao;

import org.javadriven.boot.model.Player;
import org.javadriven.boot.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "players", rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long>{

}
