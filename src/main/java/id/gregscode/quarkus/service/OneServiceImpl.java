package id.gregscode.quarkus.service;

import id.gregscode.quarkus.api.model.RequestSimple;
import id.gregscode.quarkus.entity.Data;
import id.gregscode.quarkus.repository.DataSimpleRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class OneServiceImpl implements SimpleService{

    @Inject
    DataSimpleRepository dataSimpleRepository;

    @Override
    public void save(RequestSimple data) {
        dataSimpleRepository.save(data.toDataEntity());
    }

    @Override
    public RequestSimple get(long id) {
        Optional<Data> result = dataSimpleRepository.findOne(id);
        if(result.isPresent()){
            return result.get().toRequest();
        }
        return null;
    }
}
