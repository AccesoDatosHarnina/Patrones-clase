package solucion;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import problema.TreeNumbers;

public class TreeNumberComposite implements TreeNumber {
	private String name;

	private final List<TreeNumber> treeNumbersList;

	public TreeNumberComposite(String name) {
	        this.name = name;
	        this.treeNumbersList = new ArrayList<>();
	    }

	public void add(TreeNumber treeNumbers) {
            this.treeNumbersList.add(treeNumbers);
    }
	public void remove(TreeNumber  treeNumbers) {
            this.treeNumbersList.remove(treeNumbers);
    }
	@Override
	public int numberOfNodes() {
		  return this.treeNumbersList.size();
	}

	@Override
	public int sum() {
		 return this.treeNumbersList.stream()
                 .mapToInt(TreeNumber::sum)
                 .sum();
	}

	@Override
	public int higher() {
		 return this.treeNumbersList.stream()
                 .mapToInt(TreeNumber::higher)
                 .max()
                 .orElseThrow(NoSuchElementException::new);
	}
}
