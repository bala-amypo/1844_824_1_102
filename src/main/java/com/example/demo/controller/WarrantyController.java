package com.example.demo.controller;
import java.util.List;
import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService service;

    public WarrantyController(WarrantyService service) {
        this.service = service;
    }

   
    @PostMapping
    public Warranty create(@RequestBody Warranty warranty) {
        return service.save(warranty);
    }


    @GetMapping
    public List<Warranty> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Warranty getById(@PathVariable Long id) {
        return service.getById(id);
    }

  
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }

   
    @GetMapping("/user/{user}")
    public List<Warranty> getByUser(@PathVariable String user) {
        return service.getByUser(user);
    }

    @GetMapping("/serial/{serialNumber}")
    public Warranty getBySerial(@PathVariable String serialNumber) {
        return service.getBySerialNumber(serialNumber);
    }
}
