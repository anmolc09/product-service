package com.learning.s2s.client;

import com.learning.s2s.shared.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "car-service-client", url = "${s2s.url}")
public interface CarServiceClient {

    @GetMapping("/all-cars")
    List<Car> findAllCars();
}
