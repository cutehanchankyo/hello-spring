package hello.hellospring.domain;

public class Member {

    private Long id;
    private String Name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
