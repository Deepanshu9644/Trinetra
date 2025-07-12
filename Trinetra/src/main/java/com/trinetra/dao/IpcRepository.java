package com.trinetra.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trinetra.entity.Ipc;

@Repository
public interface IpcRepository extends JpaRepository<Ipc, Long> {}