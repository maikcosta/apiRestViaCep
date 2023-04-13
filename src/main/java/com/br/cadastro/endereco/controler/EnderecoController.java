package com.br.cadastro.endereco.controler;

import com.br.cadastro.endereco.model.dto.EnderecoRequest;
import com.br.cadastro.endereco.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class EnderecoController {

    private final EnderecoService enderecoService;

    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody EnderecoRequest enderecoRequest){
        enderecoService.executa(enderecoRequest);
        System.out.println("Cep pesquisado: " + enderecoRequest.getCep());
        return ResponseEntity.ok(enderecoService.executa(enderecoRequest));
    }
}
