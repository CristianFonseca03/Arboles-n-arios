package src;

import java.util.ArrayList;

public class NodeNario<T> {
	private T info;
	private ArrayList<NodeNario<T>> sons;

	public NodeNario(T info) {
		sons = new ArrayList<>();
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void addChild(NodeNario<T> nodo) {
		sons.add(nodo);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<NodeNario<T>> getChild() {
		return (ArrayList<NodeNario<T>>) sons.clone();

	}

}
