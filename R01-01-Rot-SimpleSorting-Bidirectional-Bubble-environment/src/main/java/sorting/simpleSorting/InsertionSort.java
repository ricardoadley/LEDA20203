package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub
		for(int i=leftIndex; i<rightIndex+1;i++) {
			int posicaoDoMenor = i;
			for(int j = i+1;j<rightIndex+1;j++) {
				if(array[j].compareTo(array[posicaoDoMenor]) < 0) {
					T aux = array[posicaoDoMenor];
					array[posicaoDoMenor] = array[j];
					array[j] = aux;
					
				}
			}
		}
		
		//throw new UnsupportedOperationException("Not Implemented yet!");
	}
}
