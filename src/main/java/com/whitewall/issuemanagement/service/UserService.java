package com.whitewall.issuemanagement.service;


import com.whitewall.issuemanagement.entity.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

   User getByUsername(String username);


}
