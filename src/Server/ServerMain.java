package src.Server;

import org.apache.catalina.Server;
import org.springframework.web.servlet.ModelAndView;
import src.Session;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ServerMain {

    private ConcurrentMap <String, Session> sessionMap;
    //Singleton
    private static ServerMain instance = new ServerMain();

    public static ServerMain getInstance(){
        return instance;
    }

    private ServerMain(){
        sessionMap = new ConcurrentHashMap<>() ;
    }


    public ModelAndView getMetadata(String sessionId,Integer local_id){
        ModelAndView result = new ModelAndView();

        return result;
    }

}
