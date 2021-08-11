package devdojo.springboot2.mapper;

import devdojo.springboot2.DTO.AnimePostRequestDTO;
import devdojo.springboot2.DTO.AnimePutRequestDTO;
import devdojo.springboot2.domain.Anime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")

public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class); // é uma instancia do anime mapper

    //fazem a conversao de todos os atributos que temos em um valor
    public abstract Anime toAnime(AnimePostRequestDTO animePostRequestDTO);
    public abstract Anime toAnime(AnimePutRequestDTO animePustRequestDTO);

}
