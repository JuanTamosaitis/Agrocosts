package com.agro.costs.api;

import com.agro.costs.model.AgroquimicoData;
import com.agro.costs.service.AgroquimicoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/agroquimicos")
public class AgroquimicoController {

    @Resource(name = "agroquimicoService")
    private AgroquimicoService agroquimicoService;

    @GetMapping
    public List<AgroquimicoData> getAllAgroquimicos() {
        return agroquimicoService.getAllAgroquimicos();
    }

    @PostMapping
    public AgroquimicoData saveAgroquimico(@RequestBody AgroquimicoData agroquimico) {
        return agroquimicoService.saveAgroquimico(agroquimico);
    }

}
