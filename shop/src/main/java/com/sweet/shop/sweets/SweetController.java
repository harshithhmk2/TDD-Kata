package com.sweet.shop.sweets;

import com.sweet.shop.dto.SweetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sweets")
@RequiredArgsConstructor
@CrossOrigin
public class SweetController {

    private final SweetService service;

    @PostMapping
   // @PreAuthorize("hasRole('ADMIN')")
    public Sweet add(@RequestBody SweetRequest request) {
        return service.addSweet(request);
    }

    @GetMapping
    public List<Sweet> list() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
