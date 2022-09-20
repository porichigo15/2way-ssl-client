package com.example.client.service.client;

import com.example.client.config.CustomFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "server-api",
        url = "${endpoint.api.server}",
        configuration = CustomFeignConfiguration.class
)
public interface ServerClient {

    @GetMapping(
            value = "/index",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    String index();
}
