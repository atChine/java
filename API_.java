package Exercise01;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }

}
