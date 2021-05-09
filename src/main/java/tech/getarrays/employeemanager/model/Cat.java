package tech.getarrays.employeemanager.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class Cat implements Animal{
    @Override
    public String characteristics() {
        return "Meon";
    }
}
