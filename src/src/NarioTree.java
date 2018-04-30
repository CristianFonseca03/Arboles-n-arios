package src;

import java.util.ArrayList;
import java.util.Comparator;

public class NarioTree<T> {
	@SuppressWarnings("rawtypes")
	private NodeNario root;
	private ArrayList<T> arrayAux;
	private Comparator<T> comparator;

	public NarioTree(Comparator<T> comp) {
		this.comparator = comp;
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(T info, NodeNario<T> node) {
		if (isEmpty()) {
			root = new NodeNario<T>(info);
		} else {
			node.addChild((new NodeNario<T>(info)));
		}
	}

	public ArrayList<T> listNodes() {

		return null;

	}

	@SuppressWarnings("unchecked")
	public NodeNario<T> findNode(T info) {
		return find(root, info);
	}

	private NodeNario<T> find(NodeNario<T> node, T info) {
		if (comparator.compare(info, node.getInfo()) == 0) {
			return node;
		} else {
			for (NodeNario<T> aux : node.getChild()) {
				NodeNario<T> nAux = find(aux, info);
				if (nAux != null) {
					return nAux;
				}
			}
			return null;
		}
	}

	public boolean isSheet(NodeNario<T> node) {
		if (node.getChild().size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<T> getTree() {
		arrayAux = new ArrayList<>();
		list(root);
		return arrayAux;
	}

	private void list(NodeNario<T> node) {
		if (node != null) {
			arrayAux.add(node.getInfo());
			for (NodeNario<T> aux : node.getChild()) {
				list(aux);
			}

		}
	}
}
