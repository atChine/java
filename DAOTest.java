package Exercise03;

import java.util.List;

public class DAOTest {
    public static void main(String[] args){
        DAO<User> dao = new DAO<User>();

        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,31,"王冰冰"));
        dao.save("1003",new User(1003,16,"jack"));

        dao.update("1003",new User());
        dao.delete("1003");
        dao.update("1005",new User());
        List<User> list = dao.list();
        list.forEach(System.out::println);
    }
}
