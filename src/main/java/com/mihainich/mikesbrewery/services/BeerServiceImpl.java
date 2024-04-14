package com.mihainich.mikesbrewery.services;

import com.mihainich.mikesbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Shiner Bock")
                .beerStyle("Lager")
                .build();
    }
}
