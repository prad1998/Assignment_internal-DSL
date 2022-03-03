package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine {
	private Map<String,State> states = new HashMap<>();
	private State initial;
	private State current; 
	private String currentEvent;
	private List<String> integerList = new ArrayList<>();
	private Map<String,Integer> integerList2 = new HashMap<>();
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}

	public Machine build() {
		
		return new Machine(states.values(),initial);
	}

	public StateMachine state(String string) {
		current = getState(string);
		return this;
	}

	public StateMachine initial() {
		initial = current;
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this; 
	}

	public StateMachine to(String string) {
		Transition t = new Transition(currentEvent,getState(string));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String string) {
		integerList2.put(string, null);
		integerList.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
