package id.gregscode.quarkus.repository;

import id.gregscode.quarkus.entity.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.Optional;

@ApplicationScoped
public class DataSimpleRepositoryImpl implements DataSimpleRepository{

    @PersistenceContext
     EntityManager entityManager;

    @Override
    public Optional<Data> findOne(Long id) {
        Query query = entityManager.createQuery("SELECT d FROM Data d where id = ?1");
        query.setParameter(1, id);
        if(!query.getResultList().isEmpty()){
            return Optional.of(((Data)query.getSingleResult()));
        }
        return null;

    }

    @Override
    @Transactional
    public Optional<Data> save(Data data) {
        entityManager.persist(data);
        return Optional.of(data);
    }
}
