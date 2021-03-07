package com.springboot.graphql.service.tradetype;

import com.springboot.graphql.dto.TradeTypeInput;
import com.springboot.graphql.entity.TradeType;

import java.util.List;

public interface TradeTypeService {

    TradeType add(TradeTypeInput tradeTypeInput);

    TradeType getById(Long id);

    List<TradeType> get(Integer skip, Integer limit);
}
