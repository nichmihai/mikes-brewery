package com.mihainich.mikesbrewery.services;

import com.mihainich.mikesbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
