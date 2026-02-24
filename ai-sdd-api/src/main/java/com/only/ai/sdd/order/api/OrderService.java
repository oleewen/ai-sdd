package com.only.ai.sdd.order.api;

import io.swagger.annotations.Api;
import com.only.ai.sdd.order.api.module.request.OrderBuyRequest;
import com.only.ai.sdd.order.api.module.response.OrderBuyResponse;

@Api(tags = "OrderService")
public interface OrderService {
    OrderBuyResponse buy(OrderBuyRequest buyRequest);
}
