package devdojo.springboot2.service;

import devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//aqui acontece a logica de negocios
public class AnimeService  {
    //private final AnimeRespository animeRepository;
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"Nagatoro"), new Anime(2L,"JOJO"));
    }
}
