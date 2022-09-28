package com.example.springcrud.service;

import com.example.springcrud.entity.user;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface userService {
    List<user> findAll();

    List<user> findAll(Sort sort);

    List<user> findAllById(Iterable<Long> longs);

    <S extends user> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends user> S saveAndFlush(S entity);

    <S extends user> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<user> entities);

    void deleteAllInBatch(Iterable<user> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    user getOne(Long aLong);

    @Deprecated
    user getById(Long aLong);

    user getReferenceById(Long aLong);

    <S extends user> List<S> findAll(Example<S> example);

    <S extends user> List<S> findAll(Example<S> example, Sort sort);

    Page<user> findAll(Pageable pageable);

    <S extends user> S save(S entity);

    Optional<user> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(user entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends user> entities);

    void deleteAll();

    <S extends user> Optional<S> findOne(Example<S> example);

    <S extends user> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends user> long count(Example<S> example);

    <S extends user> boolean exists(Example<S> example);

    <S extends user, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
