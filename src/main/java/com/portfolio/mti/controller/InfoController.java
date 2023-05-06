package com.portfolio.mti.controller;

import com.portfolio.mti.models.Info;
import com.portfolio.mti.services.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/info")
public class InfoController {
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Info> getInfo(@PathVariable("id") Long id) {
        Info info = infoService.getInfoById(id);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Info> updateInfo(@RequestBody Info info) {
        Info updatedInfo = infoService.updateInfo(info);
        return new ResponseEntity<>(updatedInfo, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Info> addInfo(@RequestBody Info info) {
        Info newInfo = infoService.addInfo(info);
        return new ResponseEntity<>(newInfo, HttpStatus.OK);
    }

}
