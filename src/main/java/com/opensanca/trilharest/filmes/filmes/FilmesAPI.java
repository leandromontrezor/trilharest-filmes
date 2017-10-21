package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParamentrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping(path = "/em-exibicao", method = RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(ParamentrosDePaginacao paramentrosDePaginacao){
       if(paramentrosDePaginacao == null){
           paramentrosDePaginacao = new ParamentrosDePaginacao();
       }
        LocalDate referencia = LocalDate.now();
        return this.filmesRepository.buscaPaginaEmExibicao(paramentrosDePaginacao, referencia);

    }

    @GetMapping("/{id}")
    public Filme getPorId(@PathVariable UUID id ){
        return this.filmesRepository.buscaPorId(id);
    }


}
