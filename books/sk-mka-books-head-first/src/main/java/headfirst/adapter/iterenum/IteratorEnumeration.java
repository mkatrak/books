package headfirst.adapter.iterenum;

import java.util.*;

public class IteratorEnumeration implements Enumeration {
	Iterator iterator;
 
	public IteratorEnumeration(final Iterator iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
