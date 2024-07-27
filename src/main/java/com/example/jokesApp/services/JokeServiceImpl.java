package com.example.jokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke(){
        return  chuckNorrisQuotes.getRandomQuote();
    }

    @Bean
    public ChuckNorrisInfoContributor chuckNorrisInfoContributor(){
        return new ChuckNorrisInfoContributor();
    }
}
