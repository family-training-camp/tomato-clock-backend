package com.tomatoclock.taskserver.converter;

import com.tomatoclock.taskserver.dto.TagDTO;
import com.tomatoclock.taskserver.entity.Tag;

import java.util.ArrayList;
import java.util.List;

public class TagConverter {
  public static TagDTO fromTag(Tag tag) {
    TagDTO tagDTO = new TagDTO();
    tagDTO.setTagName(tag.getTagName());
    tagDTO.setColor(tag.getColor());
    return tagDTO;
  }

  public static List<TagDTO> fromTags(List<Tag> tags) {
    List<TagDTO> tagDTOs = new ArrayList<>();
    for(Tag tag : tags){
      tagDTOs.add(fromTag(tag));
    }
    return tagDTOs;
  }
}
