package com.whitewall.issuemanagement.service;

import com.whitewall.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    Page<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete (IssueDto issue);


}
