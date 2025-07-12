package com.trinetra.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinetra.entity.Ipc;
import com.trinetra.service.IpcService;

@RestController
@RequestMapping("/ipcs")
public class IpcControllar {
    @Autowired
    private IpcService companyService;

    @GetMapping("/ipc")
    public List<Ipc> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping
    public Ipc createIpc(@RequestBody Ipc ipc) {
        return companyService.saveIpc(ipc);
    }

    @DeleteMapping("/{id}")
    public void deleteIpc(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }
}

