package BehavioralDP.MediatorDP;

import BehavioralDP.MediatorDP.Actor;
import BehavioralDP.MediatorDP.Dispatcher;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher {

    // butun actorleri uzman oldugu topic ile setlemem lazim
    Map<String, Actor> registeredActors = new HashMap<>();

    // actorleri kaydeden method
    public void register(String topic, Actor actor){
        registeredActors.put(topic,actor);
    }

    @Override
    public void dispatch(String topic, String message) {
        // topic ile ilgili uzmanı çağırıyorum
        Actor actor = registeredActors.get(topic);
        if (actor==null){
            System.out.println("No actor registered for this topic");
        }else {
            actor.receiveMessage(message);
        }
    }
}
