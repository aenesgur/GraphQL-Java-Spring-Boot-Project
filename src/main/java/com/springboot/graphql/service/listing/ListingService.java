package com.springboot.graphql.service.listing;

import com.springboot.graphql.dto.ListingInput;
import com.springboot.graphql.entity.Listing;

import java.util.List;

public interface ListingService {

    Listing add(ListingInput listingInput);

    Listing getById(Long id);

    List<Listing> get(Integer skip, Integer limit);
}