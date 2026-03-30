package com.example.ttproject;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ScoreController {

    @Autowired
    private ScoreRepository repo;

    @PostMapping("/saveScore")
    public Score saveScore(@RequestBody Score score){
        return repo.save(score);
    }

    @GetMapping("/leaderboard")
    public List<Score> getScores(){
        return repo.findAll();
    }
}