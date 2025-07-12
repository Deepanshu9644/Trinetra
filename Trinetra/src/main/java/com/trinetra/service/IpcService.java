package com.trinetra.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinetra.dao.IpcRepository;
import com.trinetra.entity.Ipc;

@Service
public class IpcService {
    @Autowired
    private IpcRepository companyRepository;

    public List<Ipc> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Ipc saveIpc(Ipc ipc) {
        return companyRepository.save(ipc);
    }

    public Optional<Ipc> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

     
}

