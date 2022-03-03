package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import examples.mini_state_machine.metamodel.State;

public class Machine {
	
	private List<State> states = new ArrayList<State>();
	private State initialState;
	
	public Machine(Collection<State> states, State initialState) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
	}

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
       return states.get(states.indexOf(string)+1);
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
