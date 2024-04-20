package tut10.expression_tree;

public class ETNode {
    private String data;
    ETNode left;
    ETNode right;

    public ETNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String getData() {
        return data;
    }

    public ETNode getLeft() {
        return left;
    }

    public ETNode getRight() {
        return right;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLeft(ETNode left) {
        this.left = left;
    }

    public void setRight(ETNode right) {
        this.right = right;
    }
}
