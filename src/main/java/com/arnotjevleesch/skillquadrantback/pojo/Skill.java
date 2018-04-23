package com.arnotjevleesch.skillquadrantback.pojo;

import io.vavr.collection.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Skill {

    public String id;
    public String text;
    public String color;
    public List<SkillItem> data;
}

