package com.springboot.graphql.helper.map;

import com.springboot.graphql.dto.TradeTypeInput;
import com.springboot.graphql.entity.TradeType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MapTradeType {

    public TradeType mapInputToTradeType(TradeTypeInput tradeTypeInput) {
        TradeType tradeType = new TradeType();

        tradeType.setName(tradeTypeInput.getName());
        tradeType.setCreatedAt(new Date());

        return tradeType;
    }
}
