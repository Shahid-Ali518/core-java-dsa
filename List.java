
class ListImpl<T>{
    private T[] data;
    private int curSize;
    private final int maxSize = 10;

    public ListImpl(){
        this.data = (T[]) new Object[maxSize];
        this.curSize = -1;

    }

    public void showList(){
        System.out.print("List: [");
        for(int i = 0; i <= curSize; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("]");

    }
    public boolean isFull(){
        return curSize == maxSize;
    }
    public boolean isEmpty(){
        return curSize == -1;
    }
    public void clear(){
        curSize = -1;
    }

    public int getCurSize() {
        return curSize + 1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void add(T newItem){
        if(!isFull())
            data[++curSize] = newItem;
        else
            System.out.println("List is full");
    }

    public T findElement(T key){
        if(!isEmpty()){
            for (int i = 0; i <= curSize; i++){
                if(key == data[i])
                    return key;
            }
        }
        return null;
    }
    public boolean updateElement(T key, T update){
        if(!isEmpty()){
            for (int i = 0; i <= curSize; i++){
                if(key == data[i]){
                    data[i] = update;
                    return true;
                }

            }
            return false;
        }
        return false;
    }

    public boolean deleteElement(T key){
        if(!isEmpty()){
            for (int i = 0; i <= curSize; i++){
                if(key == data[i]){
                    data[i] = data[curSize];
                    curSize--;
                    return true;
                }

            }
            return false;
        }
        return false;
    }


}

public class List {

    public static void main(String[] args) {

        ListImpl<Integer> list = new ListImpl<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(34);
        list.showList();

        Integer find = list.findElement(4);
        if(find != null)
            System.out.println(find);

        boolean isUpdate = list.updateElement(3, 9);
        if(isUpdate)
            System.out.println("Element updated successfully");
        else
            System.out.println("Error while updating element");

        boolean isDelete = list.deleteElement(9);
        if(isDelete)
            System.out.println("Element Deleted successfully");
        else
            System.out.println("Error while Deleted element");

        list.showList();
        System.out.println(list.getCurSize());


    }
}
