package org.javadriven.boot.dbData;

import org.javadriven.boot.dao.TeamDao;
import org.javadriven.boot.model.Player;
import org.javadriven.boot.model.Team;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

public class InitData {

//    @Autowired
//    private TeamDao teamDao;
//
//    @PostConstruct
//    public void initTeams() {
//        Player p1 = new Player("Dan", "pitcher");
//        Player p2 = new Player("Phil", "runner");
//
//        Set<Player> players = new HashSet<Player>(){
//            {
//                add(p1);
//                add(p2);
//            }
//        };
//
//        Team team = new Team("NY Rangers", "New York", players);
//
//        teamDao.save(team);
//    }
}
