package tut9.example1_exercise1;

public class ArrayTree {
    int maxSize;
    int n;
    String[] l;
    int[] p;


    public ArrayTree(){
        this.maxSize = 20;
        this.n = 0;
        this.l = new String[20];
        this.p = new int[20];
    }

    public String[] getL(){
        return l;
    }
    public int[] getP(){
        return p;
    }

    public boolean isFull(){
        return n == maxSize;
    }

    public boolean isEmpty(){
        return n == 0;
    }
    public void addNode(String label,int parent){
        if(n==0){
            l[n] = label;
            p[n++] = parent;
        }
        else{
            int i = n;
            while(p[i-1] > parent){
                l[i] = l[i-1];
                p[i] = p[i-1];
                i--;
            }
            n++;
            l[i] = label;
            p[i] = parent;
        }

    }
    public int getParent(int node){
        return p[node];
    }

    public int leftMostChild(int node){
        for(int i = node + 1; i < p.length;i++){
            if(p[i] == node){
                return i;
            }
        }
        return -1;
    }

    public int rightSibling(int node){
        for(int i = node + 1; i < p.length;i++){
            if(p[node]  == p[i]){
                return i;
            }
        }
        return -1;
    }

    public String getNodeLabel(int node){

        return l[node];
    }
    public void setNodeLabel(int node,String label){
        l[node] = label;
    }


    //Exercise 1

    public int getDegree(int node){
        int count=0;
        for(int i = 0; i < p.length;i++){
            if(p[i] == node){
                count++;
            }
        }
        return count;
    }
    public boolean isLeaf(int node){

        for (int i = 0; i < n;i++){
            if(p[i] == node){
                return false;
            }
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
        int current = p[node];
        while(current != -1){
            current = getParent(current);
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

    public int search(String label){
        for(int i = 0; i < n;i++){
            if(l[i] == label){
                return i;
            }
        }
        return -1;
    }





}
