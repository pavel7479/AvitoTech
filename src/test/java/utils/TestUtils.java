package utils;

import com.example.dao.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUtils {

    public static List<User> getUsers() {
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setUsername("Krstina");
        user.setCreated_at(new Date());

        User user2 = new User();
        user.setUsername("Marina");
        user.setCreated_at(new Date());

        list.add(user);
        list.add(user2);

        return list;
    }
}
