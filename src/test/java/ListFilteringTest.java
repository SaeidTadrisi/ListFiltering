import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ListFilteringTest {

    ListFiltering listFiltering = new ListFiltering();
    @Test
    void should_get_an_integer_list_and_return_new_list() {

        List<Object> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(9);

        List<Object> filteredList = listFiltering.filterList(list);

        assertThat(filteredList).isEqualTo(list);
    }

    @Test
    void should_get_an_integer_and_string_list_and_filter_out_strings() {

        List<Object> list = new ArrayList<>();
        list.add(8);
        list.add(8);
        list.add("X");
        list.add(10);
        list.add("S");
        list.add(19);
        list.add("Q");
        list.add(20);

        List<Object> expectedList = new ArrayList<>();
        expectedList.add(8);
        expectedList.add(8);
        expectedList.add(10);
        expectedList.add(19);
        expectedList.add(20);

        ListFiltering listFiltering = new ListFiltering();
        List<Object> filteredList = listFiltering.filterList(list);

        assertThat(filteredList).isEqualTo(expectedList);
    }
}
