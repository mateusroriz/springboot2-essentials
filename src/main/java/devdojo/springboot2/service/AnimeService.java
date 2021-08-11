package devdojo.springboot2.service;

import devdojo.springboot2.domain.Anime;
import devdojo.springboot2.repository.AnimeRepository;
import devdojo.springboot2.DTO.AnimePostRequestDTO;
import devdojo.springboot2.DTO.AnimePutRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
//aqui acontece a logica de negocios
public class AnimeService  {

    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }


    public Anime findByIdOrThrowBadRequestException(long id){ //procurar anime pelo id
        return
                animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not found"));
    }

    public Anime save(AnimePostRequestDTO animePostRequestDTO){
        return animeRepository.save( Anime.builder().name(animePostRequestDTO.getName()).build());
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestDTO animePutRequestDTO) {
     Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestDTO.getId());
      Anime anime =   Anime.builder()
                .id(savedAnime.getId())
                .name(animePutRequestDTO.getName())
        .build();
        animeRepository.save(anime);
    }
}
