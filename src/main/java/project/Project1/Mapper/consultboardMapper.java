package project.Project1.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import project.Project1.DTO.consultboardDTO;
import project.Project1.Entity.consultboardEntity;

@Mapper
public interface consultboardMapper {

    consultboardMapper INSTANCE = Mappers.getMapper(consultboardMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "writer", target = "writer")
    @Mapping(source = "date", target = "date")

    @Mapping(target="formattedDate", ignore=true)
    consultboardEntity dtoToEntity(consultboardDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "writer", target = "writer")
    
    @Mapping(source = "date", target = "date")
    consultboardDTO entityToDto(consultboardEntity entity);
}
