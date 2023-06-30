import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public List<Object> filterList(List<Object> list) {

        List<Object> integerList = new ArrayList<>();

        for (Object element : list) {
            if (element instanceof Integer) {
                integerList.add(element);
            }
        }
        return integerList;
    }

}
