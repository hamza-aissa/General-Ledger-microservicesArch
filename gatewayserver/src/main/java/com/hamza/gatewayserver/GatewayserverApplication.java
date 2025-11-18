package com.hamza.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import org.springframework.cloud.gateway.route.RouteLocator;
// import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayserverApplication.class, args);
  }

  // @Bean
  // public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
  // return routeLocatorBuilder.routes()
  // .route(p -> p
  // .path("/api/accounts/**")
  // .uri("lb://ACCOUNT-SERVICE"))
  // .route(p -> p
  // .path("/api/transactions/**")
  // .uri("lb://TRANSACTION-SERVICE"))
  // .build();
  // }

}
