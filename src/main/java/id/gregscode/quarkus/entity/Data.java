package id.gregscode.quarkus.entity;

import id.gregscode.quarkus.api.model.RequestSimple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String value;

    public Data(String data) {
        setValue(data);
    }

    public Data(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RequestSimple toRequest() {
        return new RequestSimple(id, value);
    }
}
