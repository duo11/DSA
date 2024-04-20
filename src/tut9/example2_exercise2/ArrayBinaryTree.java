package tut9.example2_exercise2;

public class ArrayBinaryTree {
    int maxSize;
    String[] l;
    int n;


    public ArrayBinaryTree(){
        this.maxSize = 100;
        this.n = 0;
        this.l = new String[100];
    }

    public String[] getL(){
        return l;
    }

    public boolean isFull(){
        return n == maxSize;
    }

    public boolean isEmpty(){
        return n == 0;
    }
    public void addRoot(String label){
        l[0] = label;
        n++;
    }
    public int getLeftChild(int node){
        return 2*node + 1;

    }

    public int getRightChild(int node){

        return 2*node + 2;
    }

    public int getParent(int node){
        return (node - 1)/2;
    }

    public String getNodeLabel(int node){
        return l[node];
    }
    public void setNodeLabel(int node,String label){
        l[node] = label;
    }

    public void addLeftChild(String label,int node){
        l[getLeftChild(node)] = label;
        n++;
    }
    public void addRightChild(String label,int node){
        l[getRightChild(node)] = label;
        n++;
    }

    public void preOrderTravel(int node){
        if(l[node] != null && node < maxSize ){
            System.out.print(l[node] + " ");
            preOrderTravel(getLeftChild(node));
            preOrderTravel(getRightChild(node));
        }

    }

    public boolean isLeaf(int node){
        if(l[getRightChild(node)] != null || l[getLeftChild(node)] != null){
            return false;
        }
        return true;
    }

    public int countLeaves(){
        int count=0;
        for(int i = 0; i < n;i++ ){
            if(isLeaf(i)) count++;
        }
        return count;
    }

    public int getLevel(int node){
        int level = 0;
        while(node >0){
            node = getParent(node);
            level++;
        }
        return level;

    }

    public int getDepth(){
        int max=0;
        for(int i = 0; i < n;i++){
            if(getLevel(i) > max){
                max = getLevel(i);
            }
        }
        return max;
    }
    public void inOrderTravel(int node){
        if (l[node] != null && node < maxSize){
            inOrderTravel(getLeftChild(node));
            System.out.print(l[node] + " ");
            inOrderTravel(getRightChild(node));
        }
    }
    public void postOrderTravel(int node){
        if (l[node] != null && node < maxSize){
            postOrderTravel(getLeftChild(node));
            postOrderTravel(getRightChild(node));
            System.out.print(l[node] + " ");
        }
    }
    public int search(String label){
        for (int i = 0; i < n; i++){
            if (l[i] != null && l[i].equals(label)){
                return i; // Return the position of the first node with the label
            }
        }
        return -1; // Label not found
    }

}
