package util;


import devdojo.springboot2.DTO.AnimePutRequestDTO;

public class AnimePutRequestDTOcreator {

    public static AnimePutRequestDTO createAnimePostRequestBody(){
        return AnimePutRequestDTO.builder()
                .id(AnimeCreator.createValidUpdatedAnime().getId())
                .name(AnimeCreator.createValidUpdatedAnime().getName())
                .build();
    }
}
