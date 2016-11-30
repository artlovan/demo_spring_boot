package org.javadriven.boot.controller;

import org.javadriven.boot.dao.TeamDao;
import org.javadriven.boot.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TeamController {

    @Autowired
    private TeamDao teamDao;

    @RequestMapping("hi/{name}")
    public Team getTheTeam(@PathVariable("name") String name) {
        return  teamDao.findByName(name);
    }
}
