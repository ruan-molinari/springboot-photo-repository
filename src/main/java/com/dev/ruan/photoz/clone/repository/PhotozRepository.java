package com.dev.ruan.photoz.clone.repository;

import com.dev.ruan.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
