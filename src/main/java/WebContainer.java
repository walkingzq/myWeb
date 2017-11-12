import javax.servlet.Servlet;
import java.net.Socket;
import java.util.HashMap;

/**
 * Create by Zhao Qing on 2017/11/12
 */
public class WebContainer {
    private HashMap<String,Servlet> servletMap;//用于存储uri与servlet的对应关系

    public static void main(String[] args){

    }

    //uri与servlet对应关系
    private void register(String uri, Servlet servlet){
        servletMap.put(uri, servlet);
    }

    private void start(){
        Socket socket = new Socket();
    }


}
