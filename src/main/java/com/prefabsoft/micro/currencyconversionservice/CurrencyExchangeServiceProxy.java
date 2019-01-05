package com.prefabsoft.micro.currencyconversionservice;

import com.prefabsoft.micro.currencyconversionservice.bean.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    //TODO: https://www.udemy.com/microservices-with-spring-boot-and-spring-cloud/learn/v4/t/lecture/8005762?start=15 => PathVariable params not necessary?
    CurrencyConversionBean retrieveExchangeValue(@PathVariable(name = "from") String from, @PathVariable(name = "to") String to);

}

