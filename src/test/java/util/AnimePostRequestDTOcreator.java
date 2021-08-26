package util;


import devdojo.springboot2.DTO.AnimePostRequestDTO;
import devdojo.springboot2.domain.Anime;

public class AnimePostRequestDTOcreator {

    public static AnimePostRequestDTO createAnimePostRequestBody(){
        return AnimePostRequestDTO.builder()
                .name(AnimeCreator.createAnimeToBeSaved().getName())
                .build();
    }
}
