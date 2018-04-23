package com.arnotjevleesch.skillquadrantback.pojo;

import org.springframework.data.annotation.Id;

import io.vavr.collection.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSkills {

    @Id
    public String id;

    public String user;
    public List<Skill> skills;
}

