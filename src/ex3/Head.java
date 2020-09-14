package ex3;

public class Head {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Head(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Head{" +
                "size=" + size +
                '}';
    }
}
