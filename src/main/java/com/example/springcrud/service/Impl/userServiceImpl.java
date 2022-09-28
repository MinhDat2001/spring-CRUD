package com.example.springcrud.service.Impl;

import com.example.springcrud.entity.user;
import com.example.springcrud.repository.userRepository;
import com.example.springcrud.service.userService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class userServiceImpl implements userService {
//    @Autowired
    userRepository userRepo;

    public userServiceImpl(userRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<user> findAll() {
        return userRepo.findAll();
    }

    @Override
    public List<user> findAll(Sort sort) {
        return userRepo.findAll(sort);
    }

    @Override
    public List<user> findAllById(Iterable<Long> longs) {
        return userRepo.findAllById(longs);
    }

    @Override
    public <S extends user> List<S> saveAll(Iterable<S> entities) {
        return userRepo.saveAll(entities);
    }

    @Override
    public void flush() {
        userRepo.flush();
    }

    @Override
    public <S extends user> S saveAndFlush(S entity) {
        return userRepo.saveAndFlush(entity);
    }

    @Override
    public <S extends user> List<S> saveAllAndFlush(Iterable<S> entities) {
        return userRepo.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<user> entities) {
        userRepo.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<user> entities) {
        userRepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        userRepo.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        userRepo.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public user getOne(Long aLong) {
        return userRepo.getOne(aLong);
    }

    @Override
    @Deprecated
    public user getById(Long aLong) {
        return userRepo.getById(aLong);
    }

    @Override
    public user getReferenceById(Long aLong) {
        return userRepo.getReferenceById(aLong);
    }

    @Override
    public <S extends user> List<S> findAll(Example<S> example) {
        return userRepo.findAll(example);
    }

    @Override
    public <S extends user> List<S> findAll(Example<S> example, Sort sort) {
        return userRepo.findAll(example, sort);
    }

    @Override
    public Page<user> findAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @Override
    public <S extends user> S save(S entity) {
        return userRepo.save(entity);
    }

    @Override
    public Optional<user> findById(Long aLong) {
        return userRepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return userRepo.existsById(aLong);
    }

    @Override
    public long count() {
        return userRepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        userRepo.deleteById(aLong);
    }

    @Override
    public void delete(user entity) {
        userRepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        userRepo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends user> entities) {
        userRepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepo.deleteAll();
    }

    @Override
    public <S extends user> Optional<S> findOne(Example<S> example) {
        return userRepo.findOne(example);
    }

    @Override
    public <S extends user> Page<S> findAll(Example<S> example, Pageable pageable) {
        return userRepo.findAll(example, pageable);
    }

    @Override
    public <S extends user> long count(Example<S> example) {
        return userRepo.count(example);
    }

    @Override
    public <S extends user> boolean exists(Example<S> example) {
        return userRepo.exists(example);
    }

    @Override
    public <S extends user, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return userRepo.findBy(example, queryFunction);
    }
}
