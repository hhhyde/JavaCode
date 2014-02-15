package a9_5;

public class Shel {
	void shellsort(Object[] a) {
		int j;
		for (int gap = a.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				Object temp=a[i];
//				for ( j = i; j >= gap&&temp.compareTo(a[j-gap])<0; j-=gap) {
//					a[j]=a[j-gap];
//				}
			}
		}
	}
}
