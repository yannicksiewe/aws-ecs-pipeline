package com.mysearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysearch.dao.BaseballCardRepository;
import com.mysearch.model.BaseballCard;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    BaseballCardRepository cardrepository;

    BaseballCard TedWilliams = new BaseballCard();
    BaseballCard BobGibson = new BaseballCard();
    BaseballCard HonusWagner = new BaseballCard();
    BaseballCard YannickSiewe = new BaseballCard();

    public void addCards() {
        TedWilliams.setName("Ted Williams");
        TedWilliams.setYear(1954);
        TedWilliams.setRarityLevel("Very Rare");

        cardrepository.save(TedWilliams);

        BobGibson.setName("Bob Gibson");
        BobGibson.setYear(1959);
        BobGibson.setRarityLevel("Very Rare");

        cardrepository.save(BobGibson);

        HonusWagner.setName("Honus Wagner");
        HonusWagner.setYear(1909);
        HonusWagner.setRarityLevel("Rarest");

        cardrepository.save(HonusWagner);

        YannickSiewe.setName("Y Siewe");
        YannickSiewe.setYear(2020);
        YannickSiewe.setRarityLevel("Rarest");

        cardrepository.save(YannickSiewe);

        System.out.println("Cards have been added : " + cardrepository.findAll());

    }
}
