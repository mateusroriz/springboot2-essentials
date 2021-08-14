package devdojo.springboot2.DTO;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestDTO {
    @NotEmpty(message = "the name cannot be empty")
    private String name;
}
