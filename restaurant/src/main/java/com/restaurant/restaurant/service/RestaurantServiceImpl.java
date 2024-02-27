package com.restaurant.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements IRestaurantService{



    @Override
    public String findClients() {
        return "Valentina";
    }
}
