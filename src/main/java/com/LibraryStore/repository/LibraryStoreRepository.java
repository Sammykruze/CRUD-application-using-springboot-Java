package com.LibraryStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.LibraryStore.model.LibraryStoreModel;


@Repository
public interface LibraryStoreRepository extends CrudRepository<LibraryStoreModel, Long> {}

