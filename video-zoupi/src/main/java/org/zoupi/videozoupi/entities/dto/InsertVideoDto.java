package org.zoupi.videozoupi.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InsertVideoDto  {
    private String idAuthor;
    private String urlFile;
    private String caption;
    private List<String> tags;
    private String nameAuthor;
    private String nameSound;
    private String category;
}
