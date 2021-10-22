package solucion;

public class TreeNumberLeaf implements TreeNumber {
	private Integer number;

	public TreeNumberLeaf(Integer number) {
		this.number = number;
	}

	@Override
	public int numberOfNodes() {
		return 1;
	}

	@Override
	public int sum() {
		return this.number;
	}

	@Override
	public int higher() {
		return this.number;
	}

}
