package devdojo.springboot2.service;

import devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
//aqui acontece a logica de negocios
public class AnimeService  {
    //private final AnimeRespository animeRepository;

    private List<Anime> animes = List.of(new Anime(1L,"Nagatoro"), new Anime(2L,"JOJO"));

    public List<Anime> listAll(){
        return animes;
    }


    public Anime findById(long id){ //procurar anime pelo id
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not found"));
    }
}
