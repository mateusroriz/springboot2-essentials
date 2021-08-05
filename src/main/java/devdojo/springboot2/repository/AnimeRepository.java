package devdojo.springboot2.repository;

import devdojo.springboot2.domain.Anime;

import java.util.List;
//conexao com o banco de dados
public interface AnimeRepository {
    List<Anime> listAll();
}
