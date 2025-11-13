public class Constructors {

    private String name;
    private int _class;
    private String teacher;

    public Constructors(String name, int _class, String teacher) {
        this.name = name;
        this._class = _class;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int get_class() {
        return _class;
    }

    public void set_class(int _class) {
        this._class = _class;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
