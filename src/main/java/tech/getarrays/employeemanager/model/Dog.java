package tech.getarrays.employeemanager.model;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{


    @Override
    public String characteristics() {
        return "Bark";
    }
}
