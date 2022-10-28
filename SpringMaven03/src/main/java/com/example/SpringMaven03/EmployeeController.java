package com.example.SpringMaven03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public Employee emp()
    {
        return new Employee(001,"Shivani", "Sathyanarayan");
    }
    @GetMapping("/employee/{Eid}/{Fname}/{Lname}")
    public Employee empl(@PathVariable("Eid") int Eid,@PathVariable("Fname") String Fname,@PathVariable("Lname") String Lname)
    {
        return new Employee(Eid,Fname,Lname);
    }
    @GetMapping("/employee/api")
    public Employee emplo(@RequestParam(name="Eid") int Eid,@RequestParam(name="Fname") String Fname, @RequestParam(name="Lname") String Lname){
        return new Employee(Eid,Fname,Lname);
    }
}
