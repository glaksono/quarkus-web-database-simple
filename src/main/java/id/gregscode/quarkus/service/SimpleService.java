package id.gregscode.quarkus.service;

import id.gregscode.quarkus.api.model.RequestSimple;

public interface SimpleService {
    void save(RequestSimple data);
    RequestSimple get(long id);
}
