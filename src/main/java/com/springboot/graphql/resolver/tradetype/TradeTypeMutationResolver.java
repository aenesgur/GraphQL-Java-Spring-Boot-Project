package com.springboot.graphql.resolver.tradetype;

import com.springboot.graphql.dto.TradeTypeInput;
import com.springboot.graphql.entity.TradeType;
import com.springboot.graphql.service.tradetype.TradeTypeService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TradeTypeMutationResolver implements GraphQLMutationResolver {

    private final TradeTypeService tradeTypeService;

    public TradeType addTradeType(TradeTypeInput tradeTypeInput) {
        return tradeTypeService.add(tradeTypeInput);
    }
}
