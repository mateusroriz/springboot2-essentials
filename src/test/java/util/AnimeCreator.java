package util;

import devdojo.springboot2.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder().name("Initial D")
                .build();
    }

    public static Anime createValidAnime(){
        return Anime.builder().name("Initial D")
                .id(1L)
                .build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder().name("Vinland")
                .id(1L)
                .build();
    }

}
