package com.microservice.currencyconversionservices;
import com.microservice.currencyconversionservices.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@org.springframework.cloud.openfeign.EnableFeignClients("com.microservice.currencyconversionservices")
@EnableDiscoveryClient
public class SpringBootMicroserviceCurrencyConversionApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
  }
}
