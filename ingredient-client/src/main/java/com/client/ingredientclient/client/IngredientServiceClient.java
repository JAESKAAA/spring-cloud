package com.client.ingredientclient.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class IngredientServiceClient {

    private WebClient.Builder wcBuilder;

    public IngredientServiceClient(@LoadBalanced WebClient.Builder wcBuilder) {
        this.wcBuilder = wcBuilder;
    }
}
