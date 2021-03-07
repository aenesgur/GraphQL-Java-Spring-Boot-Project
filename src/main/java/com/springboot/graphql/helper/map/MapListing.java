package com.springboot.graphql.helper.map;

import com.springboot.graphql.dto.ListingInput;
import com.springboot.graphql.entity.Listing;
import com.springboot.graphql.entity.TradeType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MapListing {

    public Listing mapInputToListing(ListingInput listingInput, TradeType tradeType) {
        Listing listing = new Listing();

        listing.setTitle(listingInput.getTitle());
        listing.setDescription(listingInput.getDescription());
        listing.setPrice(listingInput.getPrice());
        listing.setCurrency(listingInput.getCurrency());
        listing.setCreatedAt(new Date());
        listing.setTradeType(tradeType);

        return listing;
    }
}
