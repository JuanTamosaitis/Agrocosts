package com.agro.costs.service;

import com.agro.costs.dao.AgroquimicoDao;
import com.agro.costs.dao.AgroquimicoRepository;
import com.agro.costs.model.AgroquimicoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("agroquimicoService")
public class AgroquimicoDefaultService implements AgroquimicoService {

    @Autowired
    private AgroquimicoRepository agroquimicoRepository;

    @Override
    public AgroquimicoData saveAgroquimico(AgroquimicoData agroquimico) {
        AgroquimicoDao agroquimicoModel = populateAgroquimicoEntity(agroquimico);
        return populateAgroquimicoData(agroquimicoRepository.save(agroquimicoModel));
    }

    @Override
    public List<AgroquimicoData> getAllAgroquimicos() {
        List<AgroquimicoData> agroquimicos = new ArrayList<>();
        List<AgroquimicoDao> agroquimicosList = agroquimicoRepository.findAll();
        agroquimicosList.forEach(agroquimico -> agroquimicos.add(populateAgroquimicoData(agroquimico)));
        return agroquimicos;
    }

    private AgroquimicoDao populateAgroquimicoEntity(AgroquimicoData agroquimico) {
        AgroquimicoDao agroquimicoModel = new AgroquimicoDao();
        agroquimicoModel.setNombre(agroquimico.getNombre());
        return agroquimicoModel;
    }

    private AgroquimicoData populateAgroquimicoData(AgroquimicoDao agroquimico) {
        AgroquimicoData agroquimicoModel = new AgroquimicoData();
        agroquimicoModel.setId(agroquimico.getId());
        agroquimicoModel.setNombre(agroquimico.getNombre());
        return agroquimicoModel;
    }

}
