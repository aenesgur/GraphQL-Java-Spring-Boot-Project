package com.springboot.graphql.resolver.listing;

import com.springboot.graphql.entity.Listing;
import com.springboot.graphql.service.listing.ListingService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ListingQueryResolver implements GraphQLQueryResolver {

    private final ListingService listingService;

    public Listing getListingById(Long id) {
        return listingService.getById(id);
    }

    public List<Listing> getListings(Integer skip, Integer limit) {
        return listingService.get(skip, limit);
    }
}
