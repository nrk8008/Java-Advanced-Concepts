package Generics.GenericClasses;
//Generic classes with type <T>

public class Box <T>{
    private T content;
    public Box() {
        this.content = content;
    }

    public void addContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

}
