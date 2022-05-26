import java.util.ArrayList;

public class SuperList extends ListManager {

    public SuperList(Object lista) {
        this.list = (ArrayList) lista;
    }

    @Override
    public void addElement(Object element) {
        list.add(element);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());

        }
    }

    @Override
    public Object removeElement(int position) {
        list.remove(position);
        for (int i = 0; i < list.size();) {

        }
        return null;
    }

    @Override
    public void showElements() {

    }

    @Override
    public void showReversedElements() {

    }
}