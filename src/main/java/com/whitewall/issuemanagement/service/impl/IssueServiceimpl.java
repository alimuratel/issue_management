package com.whitewall.issuemanagement.service.impl;

import com.whitewall.issuemanagement.dto.IssueDto;
import com.whitewall.issuemanagement.repository.IssueRepository;
import com.whitewall.issuemanagement.service.IssueService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class IssueServiceimpl implements IssueService {


    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;


    public IssueServiceimpl(IssueRepository issueRepository){
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate()==null)
            throw  new IllegalArgumentException("Issue Date cannot be null");

        Issue issueDb = modelMapper.map(issue,Issue.class);

        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public Page<IssueDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }

