// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import com.example.demo.entity.Warranty;
// import com.example.demo.service.WarrantyService;

// @RestController
// @RequestMapping("/warranties")
// public class WarrantyController {

//     private final WarrantyService service;

//     public WarrantyController(WarrantyService service) {
//         this.service = service;
//     }

   
//     @PostMapping
//     public Warranty create(@RequestBody Warranty warranty) {
//         return service.save(warranty);
//     }


//     @GetMapping
//     public List<Warranty> getAll() {
//         return service.getAll();
//     }

//     @GetMapping("/{id}")
//     public Warranty getById(@PathVariable Long id) {
//         return service.getById(id);
//     }

  
//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         return service.delete(id);
//     }

   
//     @GetMapping("/user/{user}")
//     public List<Warranty> getByUser(@PathVariable String user) {
//         return service.getByUser(user);
//     }

//     @GetMapping("/serial/{serialNumber}")
//     public Warranty getBySerial(@PathVariable String serialNumber) {
//         return service.getBySerialNumber(serialNumber);
//     }
// }

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;

import java.util.List;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService service;

    @Autowired
    public WarrantyController(WarrantyService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Warranty register(@RequestBody Warranty warranty) {
        return service.registerWarranty(warranty);
    }

    @GetMapping("/{id}")
    public Warranty getWarranty(@PathVariable Long id) {
        return service.getWarranty(id);
    }

    @GetMapping("/user/{user}")
    public List<Warranty> getUserWarranties(@PathVariable String user) {
        return service.getUserWarranties(user);
    }
}

