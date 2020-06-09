package assignment.objects;

public class MyObject {
    private long id;

    public MyObject(long id) {
        this.id = id;
    }
    public long getId() {return id;}
    @Override
    public boolean equals(Object o) {
        if (o instanceof MyObject) {
            return ((MyObject) o).getId() == this.id;
        }
        return false;
    }
}
