package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Not Implemented yet!");
		if(leftIndex == rightIndex+1) {
			return;
		}else {
			for(int i=leftIndex; i<rightIndex+1;i++) {
				for(int j = i+1;j<rightIndex+1;j++) {
					if(array[j].compareTo(array[i]) < 0) {
						Util.swap(array, i, j);
						
					}
				}
		}
			 sort(array,leftIndex+1,rightIndex);
		}

		

}
}
