package example.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Receiver {

  @JmsListener(destination = "mytopic1", containerFactory = "myFactory")
  def receiveMessage(HashMap<String,String> msg) {
    println("[LOG] Received <" + msg + ">");
  }

}
