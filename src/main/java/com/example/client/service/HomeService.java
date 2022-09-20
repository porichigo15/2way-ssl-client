package com.example.client.service;

import com.example.client.service.client.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private ServerClient serverClient;

    public String callServer() {
        return serverClient.index();
    }
}
