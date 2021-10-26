package Exercise03;

import java.util.*;

public class DAO<T>{
    private Map<String,T> map=new HashMap<String, T>();
        //保持T类型的对象到Map成员变量中
    public void save(String id,T entity){
        map.put(id, entity);
    }
        //从map中获取id对应的对象
    public T get(String id){
        return get(id);
    }
    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id, entity);
        }else {
            System.out.println("没有对应的id");
        }
    }
    public List<T>list(){
        ArrayList<T> ts = new ArrayList<>();
        Collection<T> values = map.values();
        for(T t:values){
            ts.add(t);
        }
        return ts;
    }
    public void delete(String id){
        map.remove(id);
    }
}
