public class QuickSort extends MySortAlg{

	public int[] sort(int[] array){

		this.sortRec(array,0,array.length-1);
		return array;

	}

	public void sortRec(int[] array, int start, int end){

		if(start<end){

			//find the pivot index
			int pivotIndex = this.partition(array,start,end);

			//recursively calling the fucntion to the sub arrays
			this.sortRec(array, start, pivotIndex-1);
			this.sortRec(array, pivotIndex+1, end);

		}
	}

	public int partition(int[] array, int start, int end){
		
		//finding the pivot value
		int pivot = array[end];
		int i=start;

		//getting all the values greater than pivot to the left of pivot
		for(int j=start;j<end;j++){

			if(array[j]>pivot){

				int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;

			}
		}

		int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
	}
}