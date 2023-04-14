package com.br.cadastro.endereco.service;

import com.br.cadastro.endereco.feign.EnderecoFeign;
import com.br.cadastro.endereco.model.dto.EnderecoResponse;
import com.br.cadastro.endereco.model.dto.EnderecoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoFeign enderecoFeign;

    private static final Map<String, Double> FRETES = Map.of(
            "Sudeste", 7.85,
            "Centro-Oeste", 12.50,
            "Nordeste", 15.98,
            "Sul", 17.30,
            "Norte", 20.83
    );


    public EnderecoResponse executa(EnderecoRequest request){
        //assert request != null;
        //String regiao = request.getEstado();
        //double frete = FRETES.getOrDefault(regiao, 0.0);
        //request.setFrete(frete);
        return enderecoFeign.buscaEnderecoCep(request.getCep());

    }
}
