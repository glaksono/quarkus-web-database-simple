package id.gregscode.quarkus.api.model;

import id.gregscode.quarkus.entity.Data;

public class RequestSimple {
    private long id;
    private String data;

    public RequestSimple(Long id, String value) {
        setId(id);
        setData(value);
    }
    public RequestSimple() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Data toDataEntity() {
        return new Data(data);
    }
}
