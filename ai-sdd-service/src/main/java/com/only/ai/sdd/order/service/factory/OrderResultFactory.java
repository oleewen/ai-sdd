package com.only.ai.sdd.order.service.factory;

import com.only.ai.sdd.order.api.module.dto.OrderBuyDTO;
import com.only.ai.sdd.order.api.module.response.OrderBuyResponse;
import com.only.ai.sdd.order.application.result.OrderBuyResult;

public class OrderResultFactory {
    public static OrderBuyResponse asResponse(OrderBuyResult buyResult) {
        OrderBuyResponse response = OrderBuyResponse.success();
        OrderBuyDTO buyDTO = OrderBuyDTOFactory.INSTANCE.toDTO(buyResult);
        response.setModule(buyDTO);
        return response;
    }
}
