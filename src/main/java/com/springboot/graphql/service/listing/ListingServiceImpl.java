package com.springboot.graphql.service.listing;

import com.springboot.graphql.dto.ListingInput;
import com.springboot.graphql.entity.Listing;
import com.springboot.graphql.entity.TradeType;
import com.springboot.graphql.helper.map.MapListing;
import com.springboot.graphql.repository.ListingRepository;
import com.springboot.graphql.repository.TradeTypeRepository;
import graphql.GraphQLException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListingServiceImpl implements ListingService {

    private final ListingRepository listingRepository;

    private final TradeTypeRepository tradeTypeRepository;

    private final MapListing mapListing;

    private static final Integer DEFAULT_SKIP = 0;

    private static final Integer DEFAULT_LIMIT = 4;

    @Override
    public Listing add(ListingInput listingInput) {
        TradeType tradeType = findTradeTypeById(listingInput.getTradeTypeId());
        Listing listing = mapListing.mapInputToListing(listingInput, tradeType);
        return listingRepository.save(listing);
    }

    @Override
    public Listing getById(Long id) {
        return listingRepository.findById(id).get();
    }

    @Override
    public List<Listing> get(Integer skip, Integer limit) {
        return listingRepository.get(skip == null ? DEFAULT_SKIP : skip, limit == null ? DEFAULT_LIMIT : limit);
    }

    private TradeType findTradeTypeById(Long id) {
        TradeType tradeType = tradeTypeRepository.findById(id).get();
        if (tradeType == null)
            throw new GraphQLException("There is no Trade Type according with id: " + id);

        return tradeType;
    }
}
