package com.whitewall.issuemanagement.service;

import com.whitewall.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete (IssueHistory issueHistory);


}
