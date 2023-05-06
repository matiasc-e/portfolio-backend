package com.portfolio.mti.services;

import com.portfolio.mti.exceptions.UserNotFoundException;
import com.portfolio.mti.models.Info;
import com.portfolio.mti.repository.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class InfoService {
    private final InfoRepo infoRepo;

    @Autowired
    public InfoService(InfoRepo infoRepo) {
        this.infoRepo = infoRepo;
    }

    public Info addInfo(Info info) {
        return infoRepo.save(info);
    }

    public Optional<Info> getInfo (Long id) {
        return infoRepo.findById(id);
    }

    public Info updateInfo(Info info) {
        return infoRepo.save(info);
    }

    public Info getInfoById(Long id) {
        return infoRepo.findById(id).orElseThrow( () -> new UserNotFoundException("Usuario no encontrado"));
    }

    public void deleteUser(Long id) {
        infoRepo.deleteById(id);
    }
}
