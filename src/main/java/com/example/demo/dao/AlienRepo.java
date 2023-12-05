package com.example.demo.dao;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel="Alien",path="Alien")// by this we dont need to create restcontroller
public interface AlienRepo extends JpaRepository<Alien , Integer> {//we use jpa repository cause
//	its extends pagingandsorting repository and it extrends curdrepository so ulitmately get al properties


}
