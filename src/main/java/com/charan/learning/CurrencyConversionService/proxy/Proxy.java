package com.charan.learning.CurrencyConversionService.proxy;

import com.charan.learning.CurrencyConversionService.domain.CurrencyConversionEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="forex-service", url="localhost:8000")
public interface Proxy {
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public CurrencyConversionEntity retrieveExchangeValue
      (@PathVariable("from") String from, @PathVariable("to") String to);
}