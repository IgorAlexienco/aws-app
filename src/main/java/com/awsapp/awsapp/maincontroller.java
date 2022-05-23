package com.awsapp.awsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class maincontroller {

    @GetMapping("/locations")
    public List<location> getLocations() {

        List<location> requestedLocations = new ArrayList();
        location l1 = new location("location 111", "123 Main St", 31.01, -121.11);
        location l2 = new location("location 222", "444 22 nn St", 32.02, -122.22);
        location l3 = new location("location 333", "888 Main St", 33.03, -123.33);
        location l4 = new location("location 444", "4 Chapel Arches", 44.04, -444.44);

        requestedLocations.add(l1);
        requestedLocations.add(l2);
        requestedLocations.add(l3);
        requestedLocations.add(l4);

        return requestedLocations;
    }

}
