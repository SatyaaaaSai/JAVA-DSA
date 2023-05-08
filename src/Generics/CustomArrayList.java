package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_VALUE=10;
    int size=0; //works as a index also..
    public CustomArrayList() {
        this.data = new int[DEFAULT_VALUE];
    }
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull(){
        return size== data.length;
    }

    public void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList obj=new CustomArrayList();
//        obj.add(12);
//        obj.add(13);
//        obj.add(13);
        for (int i =0; i <14; i++) {
            obj.add(2*1);
        }
        System.out.println(obj);
    }
}
