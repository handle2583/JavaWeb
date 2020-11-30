package com.example.myweb.repository;

import com.example.myweb.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author miaojian_v
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * @param pageable
     * @return
     */
    @Query("select u from User u")
    Page<User> findList(Pageable pageable);

    /**
     * @param id
     * @return
     */
    User findById(long id);

    /**
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * @param id
     */
    @Override
    void deleteById(Long id);
}

