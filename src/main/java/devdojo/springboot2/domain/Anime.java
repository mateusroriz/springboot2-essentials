package devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//representa o que temos no banco de dados
public class Anime {
    private Long id;
    private String name;


}
