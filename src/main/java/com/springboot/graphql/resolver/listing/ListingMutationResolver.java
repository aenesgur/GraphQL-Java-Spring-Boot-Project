package com.springboot.graphql.resolver.listing;

import com.springboot.graphql.dto.ListingInput;
import com.springboot.graphql.entity.Listing;
import com.springboot.graphql.service.listing.ListingService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ListingMutationResolver implements GraphQLMutationResolver {

    private final ListingService listingService;

    public Listing addListing(ListingInput listingInput) {
        return listingService.add(listingInput);
    }
}
