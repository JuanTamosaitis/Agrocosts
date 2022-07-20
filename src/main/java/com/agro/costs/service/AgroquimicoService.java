package com.agro.costs.service;

import com.agro.costs.model.AgroquimicoData;

import java.util.List;

public interface AgroquimicoService {

    AgroquimicoData saveAgroquimico(AgroquimicoData agroquimico);
    List<AgroquimicoData> getAllAgroquimicos();

}
