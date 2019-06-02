package output;

import java.util.Comparator;

public class CompareName implements Comparator<ComparableStrudent>{

	@Override
	public int compare(ComparableStrudent o1, ComparableStrudent o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
