package com.whitewall.issuemanagement.service;

import com.whitewall.issuemanagement.entity.Project;
import com.whitewall.issuemanagement.entity.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectService {

    Project save(User project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete (Project project);


}
