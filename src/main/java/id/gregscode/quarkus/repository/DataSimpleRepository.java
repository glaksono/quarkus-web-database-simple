package id.gregscode.quarkus.repository;

import id.gregscode.quarkus.entity.Data;

import java.util.Optional;

public interface DataSimpleRepository {
    Optional<Data> findOne(Long id);
    Optional<Data> save(Data data);
}
