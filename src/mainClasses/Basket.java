package mainClasses;

import java.io.Serializable;

public class Basket implements Serializable {
    private String nameUser;
    private String name;
    private Integer cost;
    private Long id;

    public Basket(String nameUser, String name, Integer cost, Long id) {
        this.nameUser = nameUser;
        this.name = name;
        this.cost = cost;
        this.id = id;
    }

    public Basket() {  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
