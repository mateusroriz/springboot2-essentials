package devdojo.springboot2.service;

import devdojo.springboot2.domain.Anime;
import devdojo.springboot2.mapper.AnimeMapper;
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

    public List<Anime> findByName(String name){
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrThrowBadRequestException(long id){ //procurar anime pelo id ou retornar erro caso nao encontrados
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not found"));
    }

    public Anime save(AnimePostRequestDTO animePostRequestDTO){
        return animeRepository.save( AnimeMapper.INSTANCE.toAnime(animePostRequestDTO));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestDTO animePutRequestDTO) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestDTO.getId()); //retorna erro caso nao ache um anime com o id passado
       Anime anime =  AnimeMapper.INSTANCE.toAnime(animePutRequestDTO);
        anime.setId(savedAnime.getId());
        animeRepository.save(anime);
    }
}
