package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParamentrosDePaginacao;

import java.time.LocalDate;
import java.util.UUID;

public interface FilmesRepository {

    Pagina<Filme> buscaPaginaEmExibicao(
            ParamentrosDePaginacao parametroDePaginacao, LocalDate referencia);

    /**
     *@throws IllegalArgumentException se não encontrar pelo id
     */
    Filme buscaPorId(UUID id);





}
