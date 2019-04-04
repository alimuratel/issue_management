package com.whitewall.issuemanagement.repository;

import com.whitewall.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface IssueRepository extends JpaRepository<Issue,Long> {

    Page<Issue> findAll(Pageable pageable);
}
