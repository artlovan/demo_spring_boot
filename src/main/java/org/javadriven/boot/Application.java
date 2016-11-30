package org.javadriven.boot;

import org.javadriven.boot.dao.TeamDao;
import org.javadriven.boot.model.Player;
import org.javadriven.boot.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication(scanBasePackages = "org/javadriven/boot")
@RestController
public class Application {

    @Value("${name}")
    private String name;

    @Autowired
    private String message;

    @RequestMapping("/rest")
    public String home(){
        return name + message;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private TeamDao teamDao;

    @PostConstruct
    public void init() {
        Player p1 = new Player("Dan", "pitcher");
        Player p2 = new Player("Phil", "runner");

        Set<Player> players = new HashSet<Player>(){
            {
                add(p1);
                add(p2);
            }
        };

        Team team = new Team("NY_Rangers", "New York", players);
        teamDao.save(team);
    }
}

@Component
class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyCommandLineRunner");

        args.getOptionNames().forEach(System.out::println);
    }
}
